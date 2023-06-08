package com.hanhwa.jsonparser.dto.rsrvreqrs;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class RsrvReqRs {
    @SerializedName("ds_prcsResults")
    private List<DsPrcsResult> dsPrcsResults;

    @Override
    public String toString() {
        return "예약 요청(응답) {" +
                dsPrcsResults +
                '}';
    }
}
