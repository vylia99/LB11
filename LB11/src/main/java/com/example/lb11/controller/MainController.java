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

    @RequestMapping("/create_list")
    public String reduce(
            @RequestParam  double start,
            @RequestParam double end,
            @RequestParam double step,
            @RequestParam double a,
            @RequestParam double b,
            @RequestParam double c , Model model){
       Logic logic = new Logic(start,end,step,a,b,c, 1.e-8);
        List<Point> points = logic.createList(start, end, step, a, b, c);
        model.addAttribute("logic",logic);
        model.addAttribute("points",points);
        return "logic";
    }

}
