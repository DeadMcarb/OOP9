package com.example.oop9.tabulation;

import java.util.ArrayList;
import java.util.List;

public class Functions {
    static final double a = 2.3;

    public Functions() {
    }


    //        double x1 = 0.2;
//        double x2 = 2.8;
//        double step = 0.002;


    public int countSteps(double x1, double x2, double step) {
        return (int) (Math.round((x2 - x1)/step)+1);
    }
    public double f(double x) {
        if (x<=0.3+0.0000001) {
            double cos = Math.cos(x);
            return 1.5 * a * cos*cos;
        } else if (x>2.3+0.0000001) {
            return 3*a * Math.tan(x);
        }else {
            return (x-2)*(x-2) + 6*a;
        }
    }

    public List<Point> createPointList(double start, double finish, double step) {
        List<Point> points = new ArrayList<>();
        int n = countSteps(start, finish, step);

        for (int i=0; i <= n; i++){
            double x = start + i * step;
            double y = f(x);
            points.add(new Point(x ,y));
        }
        return points;
    }



    public double sumArr(List<Point> array) {
        double sum = 0;
        for (Point point : array) {
            sum += point.getY();
        }
        return sum;
    }

    public double averArifm(List<Point> array) {
        return sumArr(array)/array.size();
    }

    public int getIndexOfMax(List<Point> array) {
        double max = array.get(0).getY();
        int maxIndex = 0;

        for(int i = 1; i < array.size(); i++) {
            double y = array.get(i).getY();

            if(y > max) {
                max = y;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int getIndexOfMin(List<Point> array) {
        double min = array.get(0).getY();
        int minIndex = 0;

        for(int i = 1; i < array.size(); i++) {
            double y = array.get(i).getY();

            if(y < min) {
                min = y;
                minIndex = i;
            }
        }
        return minIndex;
    }
//    public void printMinAndMaxElement(int max, int min, double[] array){
//        System.out.println("Max: "+array[max] +
//                "\nMin: " + array[min]);
//    }
}
