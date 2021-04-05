package com.ifmo.jjd.lesson10;

public enum Priority {
    HIGH(10), MIDDLE(5), LOW(1);

    private int code;

    Priority(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
