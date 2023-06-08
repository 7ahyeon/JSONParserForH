package com.hanhwa.jsonparser.dto.rsrvcalrs;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class DsResult {
    @SerializedName("PROC_DS")
    private String procDs;
    @SerializedName("LOC_CD")
    private String locCd;
    @SerializedName("STRT_DATE")
    private String strtDate;
    @SerializedName("END_DATE")
    private String endDate;
}
