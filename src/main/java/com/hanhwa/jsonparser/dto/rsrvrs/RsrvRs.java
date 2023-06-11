package com.hanhwa.jsonparser.dto.rsrvrs;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@NoArgsConstructor
public class RsrvRs { // 한화 리조트에서의 예약 관련 응답
    @SerializedName("ds_prcsResults")
    private List<RsrvInfo> rsrvInfoList1;
    @SerializedName("ds_prcsResult")
    private List<RsrvInfo> rsrvInfoList2;
    @SerializedName("ds_roomStatus")
    private List<RsrvRoomInfo> rsrvRoomInfoList;
}
