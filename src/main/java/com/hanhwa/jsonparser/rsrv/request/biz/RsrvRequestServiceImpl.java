package com.hanhwa.jsonparser.rsrv.request.biz;

import com.hanhwa.jsonparser.rsrv.model.dto.req.RsrvInfo;
import com.hanhwa.jsonparser.rsrv.request.repository.RsrvInfoRepository;

import java.util.Random;

public class RsrvRequestServiceImpl implements RsrvRequestService {
    // 예약 정보 정보 저장소 인터페이스에 의존 (DIP 만족)
    private final RsrvInfoRepository rsrvInfoRepository;

    public RsrvRequestServiceImpl(RsrvInfoRepository rsrvInfoRepository) {
        this.rsrvInfoRepository = rsrvInfoRepository;
    }

    @Override // 예약 번호 생성
    public long createRsrvNo() {
        // 예약 번호 2300000000 시작
        long basicNo = 2300000000L;

        Random random = new Random();
        int randomNo = random.nextInt(99999999);
        // 0일 경우 재생성
        while (randomNo == 0) {
            randomNo = random.nextInt(99999999);
            // 0이 아닐 경우 반복문 중단
            if (randomNo != 0) {
                break;
            }
        }
        // 예약 번호 return
        return basicNo + randomNo;
    }

    @Override // 예약 번호 중복 확인
    public boolean checkDuplicateRsrvNo(long rsrvNo) {
        boolean duplicate = false;

        // 저장소 예약 번호 불러오기
        for (long exRsrvNo : rsrvInfoRepository.rsrvNoInquiry()) {
            if (exRsrvNo == rsrvNo) {
                // 중복이면 true
                duplicate = true;
            } else {
            }
        }
        // 중복이 아니면 false
        return duplicate;
    }

    @Override // 예약 신청
    public void rsrvRequest(long rsrvNo, RsrvInfo rsrvInfo) {
        rsrvInfoRepository.saveRsrvInfo(rsrvNo,rsrvInfo);
    }
}
