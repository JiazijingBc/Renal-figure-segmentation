package cn.objectspace.webssh.mapper;

import cn.objectspace.webssh.pojo.patientImg.CurveImg;
import cn.objectspace.webssh.pojo.patientImg.OriginImg;
import cn.objectspace.webssh.pojo.patientImg.SegmentImg;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PatientImgMapper {

    OriginImg getLastPatientOriginImg();
    CurveImg getLastPatientCurveImg();
    SegmentImg getLastPatientSegmentImg();
    Integer count();
}
