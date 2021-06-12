package cn.objectspace.webssh.controller;

import cn.objectspace.webssh.websocket.WebSSHWebSocketHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouterController {

    @Autowired
    WebSSHWebSocketHandler webSSHWebSocketHandler;

    @RequestMapping("/websshpage")
    public String websshpage(){
        return "webssh";
    }

    @RequestMapping({"/","/index"})
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/toReady")
    public String toReady(){
        return "ready";
    }

    @RequestMapping("/toDoctorsReady")
    public String toDoctorsReady(){
        return "doctors_ready";
    }

    @RequestMapping("/toSegment")
    public String toSegment(){
        return "segment";
    }

    @RequestMapping("/tologin")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("/toPatient")
    public String toPatient(){
        return "patient";
    }

}
