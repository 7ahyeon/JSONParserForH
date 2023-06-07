package com.hanhwa.jsonparser.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
public class RsrvCnclRs {
    private Ds_PrcsResult dsPrcsResult;

    @Getter
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    private class Ds_PrcsResult {
        private String procDs;
        private String procCd;
        private String custNo;
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
}
