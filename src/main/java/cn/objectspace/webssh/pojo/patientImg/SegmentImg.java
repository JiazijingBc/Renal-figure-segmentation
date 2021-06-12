package cn.objectspace.webssh.pojo.patientImg;

import lombok.Data;

@Data
public class SegmentImg {
    private Integer patientId;
    private byte[] segImg;
}
