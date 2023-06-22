package com.hanhwa.jsonparser.rsrv.model.dto.req;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

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
    // 예약 날짜
    @SerializedName("ARRV_DATE")
    private LocalDate arrvDate;
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
    // Thread safe : 여러 스레드가 어떤 객체에 접근할 때 항상 정확하게 동작함
    // 항상 정확하게 동작함 : 개발자가 생각하는 클래스 명세에 항상 부합
    // 클래스 명세 : 불변 조건 invariants (객체 상태 제약) / 후조건 postcondition (연산 수행 후 효과 기술)
    // 클래스 명세를 통하여 코드 신뢰도(code confidence) 얻음
    // race condition : 여러 스레드나 프로세스가 접근하여 조작할 때 어떤 순서로 접근하냐에 따라 실행결과 달라짐

    // util.Date : 가변(mutable) / thread safe하지 못함
    // 시작 날짜
    @SerializedName("STRT_DATE")
    private LocalDate strtDate;
    // 끝 날짜
    @SerializedName("END_DATE")
    private LocalDate endDate;
}
