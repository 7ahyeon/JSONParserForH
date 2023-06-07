package com.hanhwa.jsonparser.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
public class RsrvReqRq {
    private Ds_RsrvInfo dsRsrvInfo;

    @Getter
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    private class Ds_RsrvInfo {
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
    }
}
