package com.hanhwa.jsonparser.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
public class RsrvModRs {
    private Ds_PrcsResult dsPrcsResult;

    @Getter
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    private class Ds_PrcsResult {
        private String procDs;
        private String procCd;
        private String custNo;
        private String membNo;
        private String rsrvNo;
        private String roomRate;
    }
}
