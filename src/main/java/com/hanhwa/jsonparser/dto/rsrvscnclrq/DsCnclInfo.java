package com.hanhwa.jsonparser.dto.rsrvscnclrq;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class DsCnclInfo {
    @SerializedName("CUST_NO")
    private String custNo;
    @SerializedName("RSRV_NO")
    private String rsrvNo;
}
