package com.hanhwa.jsonparser.dto.rsrvcalrq;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class RsrvCalRq {
    @SerializedName("ds_search")
    private List<DsSearch> dsSearch;

    @Override
    public String toString() {
        return "기간 조회(요청) {" +
                dsSearch +
                '}';
    }
}
