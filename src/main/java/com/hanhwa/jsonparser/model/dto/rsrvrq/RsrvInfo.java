package com.hanhwa.jsonparser.model.dto.rsrvrq;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

// Spring : JsonInclude(JsonInclude.Include.NON_NULL) : null값 제외 처리 가능
@ToString
@Getter
public class RsrvInfo { // 한화 리조트로의 예약 요청 정보
    @SerializedName("CUST_NO")
    private String custNo;
    @SerializedName("MEMB_NO")
    private String membNo;
    @SerializedName("CUST_IDNT_NO")
    private String custIdntNo;
    // 예약 번호
    @SerializedName("RSRV_NO")
    private Long rsrvNo;
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
    @SerializedName("RSRV_LOC_DIV_CD")
    private String rsrvLocDivCd;
    @SerializedName("ARRV_DATE")
    private Date arrvDate;
    @SerializedName("RSRV_ROOM_CNT")
    private String rsrvRoomCnt;
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
    @SerializedName("REFRESH_YN")
    private String refreshYn;
    // 시작 날짜
    @SerializedName("STRT_DATE")
    private Long strtDate;
    // 끝 날짜
    @SerializedName("END_DATE")
    private Long endDate;
}
