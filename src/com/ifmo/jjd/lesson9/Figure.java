package com.ifmo.jjd.lesson9;

import java.util.Arrays;

public class Figure {
    private Point[] points;

    public Figure(int pointsCount) {
        this.points = new Point[pointsCount];
    }

    public void addPoints(Point point) {
        for (int i = 0; i < points.length; i++) {
            if (points[i] == null) {
                points[i] = point;
                return;
            }

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Figure)) return false;
        Figure figure = (Figure) o;
        return Arrays.equals(points, figure.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }

    @Override
    protected Figure clone() {
        Figure copy = new Figure(points.length);
        copy.points = points.clone();
        return copy;
    }
}
