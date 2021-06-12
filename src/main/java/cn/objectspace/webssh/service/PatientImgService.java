package cn.objectspace.webssh.service;

import cn.objectspace.webssh.pojo.patientImg.CurveImg;
import cn.objectspace.webssh.pojo.patientImg.OriginImg;
import cn.objectspace.webssh.pojo.patientImg.SegmentImg;

public interface PatientImgService {
    OriginImg getLastPatientOriginImg();
    CurveImg getLastPatientCurveImg();
    SegmentImg getLastPatientSegmentImg();
}
