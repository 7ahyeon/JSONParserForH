package com.hanhwa.jsonparser.dto.rsrvreqrq;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
public class RsrvReqRq {
    @SerializedName("ds_rsrvInfo")
    private List<DsRsrvinfo> dsRsrvinfo;

    @Override
    public String toString() {
        return "RsrvReqRq{" +
                dsRsrvinfo +
                '}';
    }
}
