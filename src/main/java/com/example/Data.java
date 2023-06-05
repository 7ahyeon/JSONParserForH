package com.example;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
public class Data {
    private Ds_RsrvInfo dsRsrvInfo;
    private Ds_PrcsResult dsPrcsResult;
    private Ds_cnclinfo dsCnclinfo;

    @Getter
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public class Ds_RsrvInfo {
        private String custNo;
        private String membNo;
        private String custIdntNo;
        private String contNo;
        private String pakgNo;
        private String cponNo;
        private String locCd;
        private String roomTypeCd;
        private String rsrvLocDivCd;
        private String arrvDate;
        private String rsrvRoomCnt;
        private String ovntCnt;
        private String inhsCustNm;
        private String inhsCustTelNo2;
        private String inhsCustTelNo3;
        private String inhsCustTelNo4;
        private String rsrvCustNm;
        private String rsrvCustTelNo2;
        private String rsrvCustTelNo3;
        private String rsrvCustTelNo4;
        private String refreshYn;
        private String rsrvNo;
    }

    @Getter
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public class Ds_PrcsResult {
        private String procDs;
        private String procCd;
        private String custNo;
        private String membNo;
        private String rsrvNo;
        private String roomRate;
        private String locCd;
        private String arrvDate;
        private String ovntCnt;
        private String chkotExptDate;
        private String rsrvCustNm;
        private String rsrvCustTelNo2;
        private String rsrvCustTelNo3;
        private String rsrvCustTelNo4;
        private String inhsCustNm;
        private String inhsCustTelNo2;
        private String inhsCustTelNo3;
        private String inhsCustTelNo4;
        private String rsrvDate;
        private String custIdntNo;
    }

    @Getter
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public class Ds_cnclinfo {
        private String custNo;
        private String rsrvNo;
    }
}
