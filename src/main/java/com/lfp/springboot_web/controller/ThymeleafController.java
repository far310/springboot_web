package com.lfp.springboot_web.controller;

import com.lfp.springboot_web.model.Stu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {
    @RequestMapping("index.html")
    public String index(Model model){
        List<Stu> stus = new ArrayList<Stu>();
        for (int i=0;i<10;i++){
            Stu stu = new Stu();
            stu.setId(i);
            stu.setName("略略略"+i);
            stus.add(stu);
        }

        model.addAttribute("stus",stus);
        model.addAttribute("msg","集成成功");
        return "index";
    }
}
