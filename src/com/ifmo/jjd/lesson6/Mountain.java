package com.ifmo.jjd.lesson6;

public class Mountain implements Cloneable {
    private String name;
    private int height;

    public Mountain() {
        // вызов конструктора
        this("Гора по умолчанию", 300);
    }
    // конструктор

    public Mountain(String name, int height) {
        setName(name);
        setHeight(height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().length() < 2) {
            throw new IllegalArgumentException(" name < 2 ");
        }
        this.name = name;
    }

    public int getHeight() {
        if (height < 100) {
            throw new IllegalArgumentException("height < 100");
        }
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public Mountain clone() {
        try {
            return (Mountain) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
