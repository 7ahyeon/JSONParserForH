package com.hanhwa.jsonparser.rsrv.hserver.model.request.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

// Spring : JsonInclude(JsonInclude.Include.NON_NULL) : null값 제외 처리 가능
@ToString
@Setter
@Getter
@NoArgsConstructor
public class RsrvRequestInfo { // 한화 리조트로의 예약 요청 정보
    // @Expose : 직렬화 및 역직렬화시 필드 포함 여부 결정(true/false)
    // 처리 일시
    @Expose(serialize = false, deserialize = true)
    @SerializedName("PROC_DS")
    private LocalDateTime procDs;
    // 처리 코드
    @Expose(serialize = false, deserialize = true)
    @SerializedName("PROC_CD")
    private String procCd;
    // 고객 번호(교직원공제회 0000000002 고정)
    @Expose(serialize = true, deserialize = true)
    @SerializedName("CUST_NO")
    private String custNo;
    // 회원 번호
    @Expose(serialize = true, deserialize = true)
    @SerializedName("MEMB_NO")
    private String membNo;
    // 고객 식별 번호
    @Expose(serialize = true, deserialize = false)
    @SerializedName("CUST_IDNT_NO")
    private String custIdntNo;
    // 예약 번호
    @Expose(serialize = false, deserialize = true)
    @SerializedName("RSRV_NO")
    private long rsrvNo;
    // 계약 번호
    @Expose(serialize = true, deserialize = false)
    @SerializedName("CONT_NO")
    private String contNo;
    // 패키지 번호
    @Expose(serialize = true, deserialize = false)
    @SerializedName("PAKG_NO")
    private String pakgNo;
    // 쿠폰 번호
    @Expose(serialize = true, deserialize = false)
    @SerializedName("CPON_NO")
    private String cponNo;
    // 객장 코드
    @Expose(serialize = true, deserialize = false)
    @SerializedName("LOC_CD")
    private String locCd;
    // 객실 타입 코드
    @Expose(serialize = true, deserialize = false)
    @SerializedName("ROOM_TYPE_CD")
    private String roomTypeCd;
    // 객장 코드 분류 Special/Common
    @Expose(serialize = true, deserialize = false)
    @SerializedName("RSRV_LOC_DIV_CD")
    private String rsrvLocDivCd;
    // 예약 날짜(도착 일자)
    @Expose(serialize = true, deserialize = false)
    @SerializedName("ARRV_DATE")
    private LocalDate arrvDate;
    // 예약 객실 수
    @Expose(serialize = true, deserialize = false)
    @SerializedName("RSRV_ROOM_CNT")
    private String rsrvRoomCnt;
    // 박수
    @Expose(serialize = true, deserialize = false)
    @SerializedName("OVNT_CNT")
    private String ovntCnt;
    // 투숙 고객명
    @Expose(serialize = true, deserialize = false)
    @SerializedName("INHS_CUST_NM")
    private String inhsCustNm;
    // 투숙 고객 전화번호 2
    @Expose(serialize = true, deserialize = false)
    @SerializedName("INHS_CUST_TEL_NO2")
    private String inhsCustTelNo2;
    // 투숙 고객 전화번호 3
    @Expose(serialize = true, deserialize = false)
    @SerializedName("INHS_CUST_TEL_NO3")
    private String inhsCustTelNo3;
    // 투숙 고객 전화번호 4
    @Expose(serialize = true, deserialize = false)
    @SerializedName("INHS_CUST_TEL_NO4")
    private String inhsCustTelNo4;
    // 예약자명
    @Expose(serialize = true, deserialize = false)
    @SerializedName("RSRV_CUST_NM")
    private String rsrvCustNm;
    // 예약자 전화번호 2
    @Expose(serialize = true, deserialize = false)
    @SerializedName("RSRV_CUST_TEL_NO2")
    private String rsrvCustTelNo2;
    // 예약자 전화번호 3
    @Expose(serialize = true, deserialize = false)
    @SerializedName("RSRV_CUST_TEL_NO3")
    private String rsrvCustTelNo3;
    // 예약자 전화번호 4
    @Expose(serialize = true, deserialize = false)
    @SerializedName("RSRV_CUST_TEL_NO4")
    private String rsrvCustTelNo4;
    // 리프레쉬 여부
    @Expose(serialize = true, deserialize = false)
    @SerializedName("REFRESH_YN")
    private String refreshYn;
    // 객실료
    @Expose(serialize = false, deserialize = true)
    @SerializedName("ROOM_RATE")
    private String roomRate;
}
