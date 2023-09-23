package com.thomaspowell.geometry_code;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public Point(double x, double y) {
       this.x = x;
       this.y = y;
    }

    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(other.getX() - x, 2) + Math.pow(other.getY() - y, 2));
    }
}
