package com.hanhwa.jsonparser.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
public class MessageHeader {
    private String msgPrcsRsltCd;
    private int msgDataSubRpttCnt;
    private String msgEtc;
    private MsgDataSub msgDataSub;

    @Getter
    @NoArgsConstructor
    public class MsgDataSub {
        private String msgIndcCd;
        private String msgCd;
        private String msgCtns;
    }
}
