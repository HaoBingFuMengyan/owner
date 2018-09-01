package com.owner.master.web.sys;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/")
@Slf4j
public class AdminController {
    @GetMapping(value="login.html")
    public String login(Model model){
        model.addAttribute("debug","");
        log.info("欢迎使用企业微信点餐系统后台管理");
        return "sys/index";
    }
}
