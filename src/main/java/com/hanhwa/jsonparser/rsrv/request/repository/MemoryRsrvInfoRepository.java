package com.hanhwa.jsonparser.rsrv.request.repository;

import com.hanhwa.jsonparser.rsrv.localserver.model.dto.req.RsrvInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryRsrvInfoRepository implements RsrvInfoRepository {

    // DB 대체 저장소 생성 (static 변수 : 프로그램이 실행되어 메모리에 올라갔을 때 딱 한 번 메모리 공간이 할당되며 모든 인스턴스가 그 값 공유함)
    private static Map<Long, RsrvInfo> rsrvInfoStore = new HashMap<>();

    @Override // 예약 정보 저장
    public void saveRsrvInfo(long rsrvNo, RsrvInfo rsrvInfo) {
        // 예약 정보 저장
        rsrvInfoStore.put(rsrvNo, rsrvInfo);
    }

    @Override // 예약 번호 조회
    public List<Long> rsrvNoInquiry() {
        List<Long> rsrvNoList = new ArrayList<>();
        for (long exRsrvNo : rsrvInfoStore.keySet()) {
            rsrvNoList.add(exRsrvNo);
        }
        return rsrvNoList;
    }

    @Override  // 예약 정보 조회(예약 번호로 찾기)
    public RsrvInfo findByNo(long rsrvNo) { // 예약 정보 조회(예약 번호로 찾기)
        return rsrvInfoStore.get(rsrvNo);
    }
}
