package com.hanhwa.jsonparser.rsrv.localserver.model.request.biz;

import com.hanhwa.jsonparser.rsrv.localserver.model.request.dto.RsrvRequestInfo;

public interface RsrvRequestService {
    // 예약 번호 생성
    long createRsrvNo();
    // 예약 번호 중복 확인
    boolean checkDuplicateRsrvNo(long rsrvNo);
    // 예약 신청
    void rsrvRequest(long rsrvNo, RsrvRequestInfo rsrvRequestInfo);
}
