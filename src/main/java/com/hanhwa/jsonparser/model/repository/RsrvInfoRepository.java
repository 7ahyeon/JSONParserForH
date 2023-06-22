package com.hanhwa.jsonparser.model.repository;

import com.hanhwa.jsonparser.model.dto.rsrvrq.RsrvInfo;

public interface RsrvInfoRepository { // 예약 정보 저장소
    // 예약 번호 생성
    Long createRsrvNo();
    // 예약 번호 중복 확인
    boolean checkDuplicateRsrvNo(Long rsrvNo);
    // 예약 정보 저장
    void saveRsrvInfo(RsrvInfo rsrvInfo);
    // 예약 정보 조회(예약 번호로 찾기)
    RsrvInfo findByNo(Long rsrvNo);
}
