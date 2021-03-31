package com.ifmo.jjd.lesson7.utils;

public class Randoms {
    public static int  getRandomInt(int min, int max){
        return (int) ((Math.random() * (max-min)) +min);

    }
    public  static  int getRandimInt(int max){
        return  (int) (Math.random()*max);

    }
}
