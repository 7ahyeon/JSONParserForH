package com.hanhwa.jsonparser.rsrv.request.biz;

import com.hanhwa.jsonparser.rsrv.model.dto.req.RsrvInfo;

public interface RsrvRequestService {
    // 예약 번호 생성
    long createRsrvNo();
    // 예약 번호 중복 확인
    boolean checkDuplicateRsrvNo(long rsrvNo);
    // 예약 신청
    void rsrvRequest(long rsrvNo, RsrvInfo rsrvInfo);
}
