package com.hanhwa.jsonparser.dto.rsrvmodrq;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class RsrvModRq {
    @SerializedName("ds_rsrvInfo")
    private List<DsRsrvInfo> dsRsrvinfo;

    @Override
    public String toString() {
        return "예약 수정(요청) {" +
                dsRsrvinfo +
                '}';
    }
}
