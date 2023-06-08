package com.hanhwa.jsonparser.dto.rsrvscnclrq;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class RsrvCnclRq {
    @SerializedName("ds_cnclInfo")
    private List<DsCnclInfo> dsclcnInfo;

    @Override
    public String toString() {
        return "예약 삭제(요청) {" +
                dsclcnInfo +
                '}';
    }
}
