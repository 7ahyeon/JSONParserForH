package com.hanhwa.jsonparser.dto.rsrvmodrs;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class DsPrcsResult {
    @SerializedName("PROC_DS")
    private String procDs;
    @SerializedName("PROC_CD")
    private String procCd;
    @SerializedName("CUST_NO")
    private String custNo;
    @SerializedName("MEMB_NO")
    private String membNo;
    @SerializedName("RSRV_NO")
    private String rsrvNo;
    @SerializedName("ROOM_RATE")
    private String roomRate;
}
