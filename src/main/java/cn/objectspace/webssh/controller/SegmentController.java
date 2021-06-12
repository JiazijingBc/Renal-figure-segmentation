package cn.objectspace.webssh.controller;


import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

@RestController
public class SegmentController {

    @RequestMapping("/segment")
    public String segment(int Id) throws IOException {
        Process process = Runtime.getRuntime().exec("python /Data0/master/jzj/Unet-Project-2Class/kidneymapcloud/img_controller.py "+Id);

        InputStream is = process.getInputStream();

        byte[] buffer = new byte[1024];
        int i = 0;
        //如果没有数据来，线程会一直阻塞在这个地方等待数据。
        while ((i = is.read(buffer)) != -1) {
            System.out.println(new String(buffer));
        }
        return "图片分割已经完成";
    }


    @Test
    public void test() throws IOException {
//        String exe = "python";
//        String command = "/Users/huolingfeng/Documents/TencentMeeting/main.py " + 1;
//        System.out.println(command);
//        String[] cmdArr = new String[] {exe,command};
        Process process = Runtime.getRuntime().exec("python /Users/huolingfeng/Documents/TencentMeeting/main.py 1");

        InputStream is = process.getInputStream();

        byte[] buffer = new byte[1024];
        int i = 0;
        //如果没有数据来，线程会一直阻塞在这个地方等待数据。
        while ((i = is.read(buffer)) != -1) {
            System.out.println(new String(buffer));
        }
    }

}
