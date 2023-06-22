package com.hanhwa.jsonparser.rsrv.request.repository;

import com.hanhwa.jsonparser.rsrv.localserver.model.dto.req.RsrvInfo;

import java.util.List;

public interface RsrvInfoRepository { // 예약 정보 저장소

    // 예약 정보 저장
    void saveRsrvInfo(long rsrvNo, RsrvInfo rsrvInfo);

    // 예약 번호 조회
    List<Long> rsrvNoInquiry();

    // 예약 정보 조회(예약 번호로 찾기)
    RsrvInfo findByNo(long rsrvNo);
}
