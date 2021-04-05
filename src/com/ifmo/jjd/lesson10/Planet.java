package com.ifmo.jjd.lesson10;

public enum Planet {
    MERKURY(1,1),
    VENUS(2,2),
    EARTH(3,3),
    MARS(4,4),
    JUPITER(5,5),
    SATURN(6,6),
    URANUS(7,7),
    NEPTUN(8,8);

    private int mass;
    private int radius;

    Planet(int mass, int radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public int getMass() {
        return mass;
    }

    public int getRadius() {
        return radius;
    }
}
