package com.ifmo.jjd.lesson7;

public interface RestAble {
    void rest();


    default void runFromField() {
        System.out.println("RestAble runFromField");
    }

    ;

}
