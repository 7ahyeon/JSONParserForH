package com.hanhwa.jsonparser.dto.rsrvcalrq;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class DsSearch {
    @SerializedName("CUST_NO")
    private String custNo;
    @SerializedName("CONT_NO")
    private String contNo;
    @SerializedName("PAKG_NO")
    private String pakgNo;
    @SerializedName("CPON_NO")
    private String cponNo;
    @SerializedName("LOC_CD")
    private String locCd;
    @SerializedName("ROOM_TYPE_CD")
    private String roomTypeCd;
    @SerializedName("STRT_DATE")
    private String strtDate;
    @SerializedName("END_DATE")
    private String endDate;
}
