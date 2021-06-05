package cn.objectspace.webssh.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

@RestController
public class TestController {

    @RequestMapping("/segment")
    public String segment() throws IOException {
        String exe = "python";
        String command = "/Data0/master/jzj/Unet-Project-2Class/kidneymapcloud/img_controller.py";

        String[] cmdArr = new String[] {exe,command};

        Process process = Runtime.getRuntime().exec(cmdArr);

        InputStream is = process.getInputStream();

        byte[] buffer = new byte[1024];
        int i = 0;
        //如果没有数据来，线程会一直阻塞在这个地方等待数据。
        while ((i = is.read(buffer)) != -1) {
            System.out.println(new String(buffer));
        }
        return "图片分割已经完成";
    }

    @RequestMapping("/curves")
    public String curves() throws IOException {
        String exe = "python";
        String command = "/Data0/master/jzj/Unet-Project-2Class/kidneymapcloud/BCcurves.py";

        String[] cmdArr = new String[] {exe,command};

        Process process = Runtime.getRuntime().exec(cmdArr);

        InputStream is = process.getInputStream();

        byte[] buffer = new byte[1024];
        int i = 0;
        //如果没有数据来，线程会一直阻塞在这个地方等待数据。
        while ((i = is.read(buffer)) != -1) {
            System.out.println(new String(buffer));
        }
        return "曲线绘制完成";
    }
}
