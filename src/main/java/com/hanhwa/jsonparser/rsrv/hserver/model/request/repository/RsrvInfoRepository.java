package com.hanhwa.jsonparser.rsrv.hserver.model.request.repository;

import com.hanhwa.jsonparser.rsrv.hserver.model.request.dto.RsrvRequestInfo;

import java.util.List;

public interface RsrvInfoRepository { // 예약 정보 저장소
    // 예약 정보 저장
    void saveRsrvInfo(long rsrvNo, RsrvRequestInfo rsrvRequestInfo);
    // 예약 번호 조회
    List<Long> rsrvNoInquiry();
    // 예약 정보 조회(예약 번호로 찾기)
    RsrvRequestInfo findByNo(long rsrvNo);
}
