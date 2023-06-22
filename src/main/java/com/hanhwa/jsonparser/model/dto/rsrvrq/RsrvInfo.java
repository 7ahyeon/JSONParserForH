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
    // Long : 참조 타입 (Reference Type)
    // long : 원시 타입 (Primitive Type)
    // 원시 타입 : null 할당 불가 / 'Stack' 영역에 값 존재
    // 참조 타입 : null 할당 가능 / 'Stack' 영역에 참조 주소 정보 존재 및 'Heap' 영역에 실제 데이터 존재
    // 원시 타입이 참조 타입보다 값 가져오는 속도가 빠르고 메모리를 덜 사용함(not null 보장시 원시 타입 사용 권장)
    // 원시 타입과 참조 타입 혼용은 지양하는 것이 좋다(성능 차이)
    // 예약 번호
    @SerializedName("RSRV_NO")
    private long rsrvNo;
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
    private Date strtDate;
    // 끝 날짜
    @SerializedName("END_DATE")
    private Date endDate;
}
