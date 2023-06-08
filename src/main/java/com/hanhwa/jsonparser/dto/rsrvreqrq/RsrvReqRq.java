package com.hanhwa.jsonparser.dto.rsrvreqrq;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class RsrvReqRq {
    @SerializedName("ds_rsrvInfo")
    private List<DsRsrvInfo> dsRsrvinfo;

    @Override
    public String toString() {
        return "예약 요청(요청) {" +
                dsRsrvinfo +
                '}';
    }
}
