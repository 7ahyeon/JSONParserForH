package com.hanhwa.jsonparser.dto.rsrvcnclrs;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class RsrvCnclRs {
    @SerializedName("ds_prcsResults")
    private List<DsPrcsResult> dsPrcsResults;

    @Override
    public String toString() {
        return "예약 삭제(응답) {" +
                dsPrcsResults +
                '}';
    }
}
