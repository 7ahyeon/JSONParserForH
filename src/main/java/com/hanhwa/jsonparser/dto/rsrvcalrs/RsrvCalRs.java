package com.hanhwa.jsonparser.dto.rsrvcalrs;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class RsrvCalRs {
    @SerializedName("ds_result")
    private List<DsResult> dsResult;
    private List<DsRoomStatus> dsRoomStatus;

    @Override
    public String toString() {
        return "기간 조회(응답) {" +
                dsResult +
                ", " + dsRoomStatus +
                '}';
    }
}
