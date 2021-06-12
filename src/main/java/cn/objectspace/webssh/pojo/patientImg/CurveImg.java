package cn.objectspace.webssh.pojo.patientImg;

import lombok.Data;

@Data
public class CurveImg {
    private Integer patientId;
    private byte[] curImg;
}
