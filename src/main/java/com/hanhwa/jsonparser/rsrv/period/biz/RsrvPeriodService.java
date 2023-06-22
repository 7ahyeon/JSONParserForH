package com.hanhwa.jsonparser.rsrv.period.biz;

import com.hanhwa.jsonparser.rsrv.localserver.model.dto.resp.RsrvDateInfo;

import java.time.LocalDate;
import java.util.List;

// 예약 기간 서비스 인터페이스
public interface RsrvPeriodService {
    // 예약 기간 내 전체 날짜 조회
    List<LocalDate> rsrvPeriodInquiry(LocalDate strtDate, LocalDate endDate);
    // 예약 기간 정보 조회
    List<RsrvDateInfo> findByRsrvPeriod(List<LocalDate> rsrvPeriod);

}
