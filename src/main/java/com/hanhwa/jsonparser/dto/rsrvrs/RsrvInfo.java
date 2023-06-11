package com.hanhwa.jsonparser.dto.rsrvrs;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;
// Spring : JsonInclude(JsonInclude.Include.NON_NULL) : null값 제외 처리 가능
@ToString
@Getter
public class RsrvInfo {
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
    @SerializedName("LOC_CD")
    private String locCd;
    @SerializedName("ARRV_DATE")
    private String arrvDate;
    @SerializedName("OVNT_CNT")
    private String ovntCnt;
    @SerializedName("CHKOT_EXPT_DATE")
    private String chkotExptDate;
    @SerializedName("RSRV_CUST_NM")
    private String rsrvCustNm;
    @SerializedName("RSRV_CUST_TEL_NO2")
    private String rsrvCustTelNo2;
    @SerializedName("RSRV_CUST_TEL_NO3")
    private String rsrvCustTelNo3;
    @SerializedName("RSRV_CUST_TEL_NO4")
    private String rsrvCustTelNo4;
    @SerializedName("INHS_CUST_NM")
    private String inhsCustNm;
    @SerializedName("INHS_CUST_TEL_NO2")
    private String inhsCustTelNo2;
    @SerializedName("INHS_CUST_TEL_NO3")
    private String inhsCustTelNo3;
    @SerializedName("INHS_CUST_TEL_NO4")
    private String inhsCustTelNo4;
    @SerializedName("RSRV_DATE")
    private String rsrvDate;
    @SerializedName("CUST_IDNT_NO")
    private String custIdntNo;
    @SerializedName("STRT_DATE")
    private String strtDate;
    @SerializedName("END_DATE")
    private String endDate;
}
