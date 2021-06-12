package cn.objectspace.webssh.service.impl;

import cn.objectspace.webssh.mapper.PatientImgMapper;
import cn.objectspace.webssh.pojo.patientImg.CurveImg;
import cn.objectspace.webssh.pojo.patientImg.OriginImg;
import cn.objectspace.webssh.pojo.patientImg.SegmentImg;
import cn.objectspace.webssh.service.PatientImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientImgServiceImpl implements PatientImgService {
    @Autowired
    PatientImgMapper patientImgMapper;
    @Override
    public OriginImg getLastPatientOriginImg() {
        return patientImgMapper.getLastPatientOriginImg();
    }

    @Override
    public CurveImg getLastPatientCurveImg() {
        return patientImgMapper.getLastPatientCurveImg();
    }

    @Override
    public SegmentImg getLastPatientSegmentImg() {
        return patientImgMapper.getLastPatientSegmentImg();
    }

    public Integer count(){
        return patientImgMapper.count();
    }
}
