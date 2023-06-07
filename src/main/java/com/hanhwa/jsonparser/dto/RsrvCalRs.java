package com.hanhwa.jsonparser.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
public class RsrvCalRs {
    private Ds_Result ds_result;
    private Ds_RoomStatus ds_roomStatus;

    @Getter
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    private class Ds_Result {
        private String procDs;
        private String locCd;
        private String strtDate;
        private String endDate;
    }

    @Getter
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    private class Ds_RoomStatus {
        private String msg;
        private String roomTypeCd;
        private String locCd;
        private String sesnDate;
        private String sesnNm;
        private String allcRoomCnt;
        private String rsrvLocDivCd;
        private String rsrvPosblCnt;
    }
}