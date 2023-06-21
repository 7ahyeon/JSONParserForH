package com.hanhwa.jsonparser.model.dto.rsrvrs;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;
// Spring : JsonInclude(JsonInclude.Include.NON_NULL) : null값 제외 처리 가능
@ToString
@Getter
public class RsrvPeriodInfo { // 한화 리조트에서의 예약 기간 정보
    @SerializedName("MSG")
    private String msg;
    @SerializedName("ROOM_TYPE_CD")
    private String roomTypeCd;
    @SerializedName("LOC_CD")
    private String locCd;
    @SerializedName("SESN_DATE")
    private String sesnDate;
    @SerializedName("SESN_NM")
    private String sesnNm;
    @SerializedName("ALLC_ROOM_CNT")
    private String allcRoomCnt;
    @SerializedName("RSRV_LOC_DIV_CD")
    private String rsrvLocDivCd;
    @SerializedName("RSRV_POSBL_CNT")
    private String rsrvPosblCnt;
}
