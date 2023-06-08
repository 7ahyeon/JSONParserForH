package com.hanhwa.jsonparser.dto.rsrvmodrq;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class DsRsrvInfo {
    @SerializedName("CUST_NO")
    private String custNo;
    @SerializedName("CUST_IDNT_NO")
    private String custIdntNo;
    @SerializedName("RSRV_NO")
    private String rsrvNo;
    @SerializedName("ARRV_DATE")
    private String arrvDate;
    @SerializedName("OVNT_CNT")
    private String ovntCnt;
    @SerializedName("INHS_CUST_NM")
    private String inhsCustNm;
    @SerializedName("INHS_CUST_TEL_NO2")
    private String inhsCustTelNo2;
    @SerializedName("INHS_CUST_TEL_NO3")
    private String inhsCustTelNo3;
    @SerializedName("INHS_CUST_TEL_NO4")
    private String inhsCustTelNo4;
    @SerializedName("RSRV_CUST_NM")
    private String rsrvCustNm;
    @SerializedName("RSRV_CUST_TEL_NO2")
    private String rsrvCustTelNo2;
    @SerializedName("RSRV_CUST_TEL_NO3")
    private String rsrvCustTelNo3;
    @SerializedName("RSRV_CUST_TEL_NO4")
    private String rsrvCustTelNo4;

}
