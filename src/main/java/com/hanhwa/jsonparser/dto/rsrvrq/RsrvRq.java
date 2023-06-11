package com.hanhwa.jsonparser.dto.rsrvrq;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@Getter
@ToString
@NoArgsConstructor
public class RsrvRq { // 한화 리조트로의 예약 관련 요청
    @SerializedName("ds_rsrvInfo")
    private List<RsrvInfo> rsrvInfoList;

}
