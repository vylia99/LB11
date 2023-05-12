package com.example.lb11.date;

import com.example.lb11.service.Point;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Logic {
   private double begin;
   private double end;
   private double h;
   private double a;
   private double b;
   private double c;
    private double eps=1.e-8;
    public double functionY(double a, double b, double c, double x){
        if (x<1.4-eps)
            return a*(x*x)+b*x+c;
        else
        if (abs(x-1.4)<eps)
            return (a/x)+Math.sqrt(x*x+1);

        return (a+b*x)/Math.sqrt(x*x+1);

    }
    public int count(){
        return (int)((end-begin)/h+1);

    }
    public int count(double begin, double end, double h){
        return (int)((end-begin)/h+1);

    }

    public List<Point> createList(double begin, double end, double h, double a, double b, double c){
        List <Point> points = new ArrayList<>();
        int q=count(begin, end, h);
        for (int i=0;i<q;i++){
            double x=begin+i*h;
            double y=functionY(a, b, c, x);
            points.add(new Point(x,y));
        }
        return points;
    }


    public double minY(List <Point> points) {
        double min=points.get(0).getY();
        for (int i = 0; i <points.size(); i++)
            if (min>points.get(i).getY()  )
                min = points.get(i).getY();
        return min;
    }
    public double maxY(List <Point> points) {
        double max=points.get(0).getY();
        for (int i = 0; i < points.size(); i++)
            if (max<points.get(i).getY())
                max = points.get(i).getY();
        return max;
    }
    public double sumY(List <Point> points) {
        double sum = 0;
        for (int i = 0; i < points.size(); i++)
            sum = sum + points.get(i).getY();
        return sum; }

    public double averageY(List <Point> points) {

        return sumY(points) / points.size();
    }

}
