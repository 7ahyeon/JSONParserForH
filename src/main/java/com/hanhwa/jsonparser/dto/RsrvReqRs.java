package com.hanhwa.jsonparser.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
public class RsrvReqRs {
    private Ds_PrcsResult dsPrcsResult;

    @Getter
    @NoArgsConstructor
    private class Ds_PrcsResult {
        private String procDs;
        private String procCd;
        private String custNo;
        private String membNo;
        private String roomRate;
    }
}
