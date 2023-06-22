package com.hanhwa.jsonparser.rsrv.localserver.model.dto.req;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@Getter
@ToString
@NoArgsConstructor // 인수(Argument)가 없는 기본 생성자 생성
public class RsrvRq { // 한화 리조트로의 예약 관련 요청
    // @SerializedName : 객체 직렬화 및 역직렬화 시 Key 이름 값으로 사용
    @SerializedName("ds_rsrvInfo") // 예약 신청/수정 JSON Key
    private List<RsrvInfo> rsrvInfoList1;
    @SerializedName("ds_cnclInfo") // 예약 삭제 JSON Key
    private List<RsrvInfo> rsrvInfoList2;
    @SerializedName("ds_search") // 예약 기간 조회 JSON Key
    private List<RsrvInfo> rsrvInfoList3;
}