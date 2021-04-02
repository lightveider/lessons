package com.ifmo.jjd.lesson9;

import com.ifmo.jjd.lesson6.Climber;

public class Application {
    public static void main(String[]args){
        Object  o = new Climber();

        Point a = new Point(45,12);
        Point b = new Point(45,12);
        System.out.println(a.equals(b)); // false

        Point c = a.clone();
        System.out.println(c == a);
        System.out.println(c.equals(a));

        Figure first = new Figure(2);
        first.addPoints(a);
        first.addPoints(b);

        Figure second = first.clone();

    }
}
