package com.hanhwa.jsonparser.dto.rsrvcalrs;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class DsRoomStatus {
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
