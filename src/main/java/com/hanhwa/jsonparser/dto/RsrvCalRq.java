package com.hanhwa.jsonparser.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
public class RsrvCalRq {
    private Ds_Search dsSearch;

    @Getter
    @NoArgsConstructor
    private class Ds_Search {
        private String custNo;
        private String contNo;
        private String pakgNo;
        private String cponNo;
        private String locCd;
        private String roomTypeCd;
        private String strtDate;
        private String endDate;
    }

}
