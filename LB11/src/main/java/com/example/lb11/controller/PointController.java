package com.example.lb11.controller;

import org.springframework.ui.Model;
import com.example.lb11.date.Logic;
import com.example.lb11.service.Point;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PointController {
    private double start;
    private double end;
    private  double step;
    private double a;
    private double b;
    private  double c;



}
