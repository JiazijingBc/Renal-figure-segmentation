package cn.objectspace.webssh.controller;

import cn.objectspace.webssh.pojo.patientImg.CurveImg;
import cn.objectspace.webssh.pojo.patientImg.OriginImg;
import cn.objectspace.webssh.pojo.patientImg.SegmentImg;
import cn.objectspace.webssh.service.PatientImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Encoder;

@RestController
public class PictureController {
    @Autowired
    PatientImgService patientImgService;


    @GetMapping("/getOriginPic")
    public String getOriPic(){
        OriginImg img = patientImgService.getLastPatientOriginImg();
        byte[] oriImg = img.getOriImg();
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(oriImg);
    }
    @GetMapping("/getSegmentPic")
    public String getSegPic(){
        SegmentImg img = patientImgService.getLastPatientSegmentImg();
        byte[] segImg = img.getSegImg();
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(segImg);
    }
    @GetMapping("/getCurvePic")
    public String getCurPic(){
        CurveImg img = patientImgService.getLastPatientCurveImg();
        byte[] curImg = img.getCurImg();
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(curImg);
    }



}
