package com.hanhwa.jsonparser.model.repository;

import com.hanhwa.jsonparser.model.dto.rsrvrq.RsrvInfo;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MemoryRsrvInfoRepository implements RsrvInfoRepository {

    // DB 대체 저장소 생성 (static 변수 : 프로그램이 실행되어 메모리에 올라갔을 때 딱 한 번 메모리 공간이 할당되며 모든 인스턴스가 그 값 공유함)
    private static Map<Long, RsrvInfo> store = new HashMap<>();
    // 예약 번호 2300000000 시작
    private long basicNo = 2300000000L;
    private int randomNo;
    private boolean duplicate;

    @Override
    public long createRsrvNo() { // 예약 번호 생성
        Random random = new Random();
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

    @Override
    public boolean checkDuplicateRsrvNo(long rsrvNo) { // 예약 번호 중복 확인
        // 저장소 예약 번호 불러오기
        for (long exRsrvNo : store.keySet()) {
            if (exRsrvNo == rsrvNo) {
                // 중복이면 true
                duplicate = true;
            } else {
            }
        }
        // 중복이 아니면 false
        return duplicate;
    }

    @Override
    public void saveRsrvInfo(RsrvInfo rsrvInfo) { // 예약 정보 저장
        long rsrvNo = createRsrvNo();
        // 중복이면 재생성
        while (checkDuplicateRsrvNo(rsrvNo)) {
            rsrvNo = createRsrvNo();
        }
        // 예약 정보 저장
        store.put(rsrvNo, rsrvInfo);
    }

    @Override
    public RsrvInfo findByNo(Long rsrvNo) { // 예약 정보 조회(예약 번호로 찾기)
        return store.get(rsrvNo);
    }
}
