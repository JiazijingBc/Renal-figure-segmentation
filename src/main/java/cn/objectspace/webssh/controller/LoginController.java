package cn.objectspace.webssh.controller;

import cn.objectspace.webssh.pojo.User;
import cn.objectspace.webssh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    UserService userService;



    @PostMapping("/login")
    public String login(String username, String password, Model model, RedirectAttributes attributes){
        User user = userService.checkIn(username, password);
        if (user !=null){
            user.setPassword(null);
            System.out.println(user.getUsername()+"登录了");
            model.addAttribute("userId",user.getId());
            return "index";
        }
        else {
            System.out.println("账号密码错误");
            attributes.addFlashAttribute("msg","用户名或密码错误");
            return "redirect:/tologin";
        }
    }
}
