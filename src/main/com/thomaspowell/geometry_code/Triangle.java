package com.thomaspowell.geometry_code;
import java.util.Vector;
public class Triangle {
    private Vector<Point> points;
    private Double perimeter;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
       points = new Vector<Point>();
       points.add(new Point(x1, y1));
       points.add(new Point(x2, y2));
       points.add(new Point(x3, y3));
    }

    private double calculatePerimeter() {
        return points.get(0).distanceTo(points.get(1)) +
                points.get(1).distanceTo(points.get(2)) +
                points.get(2).distanceTo(points.get(0));
    }
    public double perimeter() {
        if  (perimeter != null) {
            return perimeter;
        }
        perimeter = Double.valueOf(calculatePerimeter());
        return perimeter;
    }
    public double area() {
        double s = perimeter() / 2;
    }
}
