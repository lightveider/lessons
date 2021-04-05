package com.ifmo.jjd.lesson10;

public enum Operation {
    SUM {
        @Override
        public int action(int a, int b) {
            return a + b;
        }
    },
    MULTI {
        @Override
        public int action(int a, int b) {
            return a * b;
        }
    };


    public abstract int action(int a, int b);


}
