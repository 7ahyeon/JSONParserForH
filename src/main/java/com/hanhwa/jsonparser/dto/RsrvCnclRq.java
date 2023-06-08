package com.hanhwa.jsonparser.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
public class RsrvCnclRq {
    private Ds_cnclinfo dsCnclinfo;

    @Getter
    @NoArgsConstructor
    private class Ds_cnclinfo {
        private String custNo;
        private String rsrvNo;
    }
}
