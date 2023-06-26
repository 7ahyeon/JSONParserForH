package com.hanhwa.jsonparser.rsrv.hserver.model.period.biz;

import com.hanhwa.jsonparser.rsrv.hserver.model.dto.resp.RsrvDateInfo;
import com.hanhwa.jsonparser.rsrv.hserver.model.period.repository.RsrvPeriodInfoRepository;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

// 예약 기간 서비스 구현체
public class RsrvPeriodServiceImpl implements RsrvPeriodService {
    // 예약 기간 정보 저장소 인터페이스에 의존 (DIP 만족)
    private final RsrvPeriodInfoRepository rsrvPeriodInfoRepository;

    public RsrvPeriodServiceImpl(RsrvPeriodInfoRepository rsrvPeriodInfoRepository) {
        this.rsrvPeriodInfoRepository = rsrvPeriodInfoRepository;
    }

    @Override
    public List<LocalDate> rsrvPeriodInquiry(LocalDate strtDate, LocalDate endDate) {
        List<LocalDate> rsrvPeriod = new ArrayList<>();
        LocalDate date;

        // ChronoUnit : final, immutable, thread-safe enum
        // 기간 시작 일자와 끝 일자 차이 산출
        long period = ChronoUnit.DAYS.between(strtDate, endDate);

        // 기간 전체 날짜 순차적 반복
        for (long i = 1; i < period + 1; i++) {
            date = strtDate.plusDays(i);
            rsrvPeriod.add(date);
        }
        return rsrvPeriod;
    }

    @Override // 예약 기간 정보 조회
    public List<RsrvDateInfo> findByRsrvPeriod(List<LocalDate> rsrvPeriod) {
        List<RsrvDateInfo> rsrvPeriodData = new ArrayList<>();

        // 기간 전체 날짜별 예약 기간 정보 조회
        for (LocalDate rsrvDate : rsrvPeriod) {
            rsrvPeriodData.add(rsrvPeriodInfoRepository.rsrvDateInquiry(rsrvDate));
        }
        return rsrvPeriodData;
    }
}
