package com.example.lb11.controller;

import com.example.lb11.date.Logic;
import com.example.lb11.service.Point;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    private Logic logic;
    @PostMapping("/create_list")
    public String reduce(
            @RequestParam("start") double start,
            @RequestParam("end") double end,
            @RequestParam("step") double step,
            @RequestParam("a") double a,
            @RequestParam("b") double b,
            @RequestParam("c") double c ){
        logic.createList(start,end,step,a,b,c);
        return "run";
    }

}
