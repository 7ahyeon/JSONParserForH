package com.example;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MessageHeaderDTO {
    private String msgPrcsRsltCd;
    private int msgDataSubRpttCnt;
    private String msgEtc;
    private MsgDataSub msgDataSub;

    @Getter
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public class MsgDataSub {
        private String msgIndcCd;
    }


}
