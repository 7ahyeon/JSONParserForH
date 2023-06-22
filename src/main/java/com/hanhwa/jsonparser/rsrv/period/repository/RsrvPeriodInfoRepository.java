package com.hanhwa.jsonparser.rsrv.period.repository;

import com.hanhwa.jsonparser.rsrv.model.dto.resp.RsrvDateInfo;

import java.time.LocalDate;

public interface RsrvPeriodInfoRepository { // 예약 기간 정보 저장소
    // 날짜별 예약 기간 정보 저장
    void saveRsrvDateInfo(LocalDate sesnDate, RsrvDateInfo rsrvDateInfo);
    // 날짜별 예약 기간 정보 조회
    RsrvDateInfo rsrvDateInquiry(LocalDate date);


}
