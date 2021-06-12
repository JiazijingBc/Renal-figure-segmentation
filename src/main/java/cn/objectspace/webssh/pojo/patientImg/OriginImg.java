package cn.objectspace.webssh.pojo.patientImg;

import lombok.Data;

@Data
public class OriginImg {
    private Integer patientId;
    private byte[] oriImg;
}
