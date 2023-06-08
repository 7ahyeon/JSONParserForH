package com.hanhwa.jsonparser.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@NoArgsConstructor
public class RsrvCnclRs {
    private class data {
        private List<Ds_PrcsResult> ds_procsResult;
    }

    @Getter
    @NoArgsConstructor
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
