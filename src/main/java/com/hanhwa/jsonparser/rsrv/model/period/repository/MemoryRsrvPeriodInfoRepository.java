package com.hanhwa.jsonparser.rsrv.model.period.repository;

import com.hanhwa.jsonparser.rsrv.model.dto.resp.RsrvDateInfo;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class MemoryRsrvPeriodInfoRepository implements RsrvPeriodInfoRepository {
    // DB 대체 저장소 생성 (static 변수 : 프로그램이 실행되어 메모리에 올라갔을 때 딱 한 번 메모리 공간이 할당되며 모든 인스턴스가 그 값 공유함)
    // 날짜, 날짜별 예약 기간 정보
    private static Map<LocalDate, RsrvDateInfo> rsrvDateStore = new HashMap<>();

    @Override // 날짜별 예약 기간 정보 저장
    public void saveRsrvDateInfo(LocalDate sesnDate, RsrvDateInfo rsrvDateInfo) {
        rsrvDateStore.put(sesnDate, rsrvDateInfo);
    }

    @Override // 날짜별 예약 기간 정보 조회
    public RsrvDateInfo rsrvDateInquiry(LocalDate date) {
        return rsrvDateStore.get(date);
    }

}
