package com.example.demo01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo01Controller {
    @RequestMapping("/")
    String index(){
        return "index";//index.htmlを編集して返す
    }

    @RequestMapping("/about")
    String about(){
        return "about";
    }
}
