package com.thomaspowell.geometry_code;
import java.util.HashMap;
import java.util.Vector;
public class Triangle {
    private Vector<Point> points;
    private HashMap<Integer, Double> sideLengths;
    private Double perimeter;
    private Double area;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
       points = new Vector<Point>();
       sideLengths = new HashMap<Integer, Double>();
       perimeter = null;
       area = null;

       points.add(new Point(x1, y1));
       points.add(new Point(x2, y2));
       points.add(new Point(x3, y3));
    }

    private double sideLength(int a, int b) {
        int cacheKey = a * 3 + b; // arbitrary index
        double length;
        if (sideLengths.containsKey(cacheKey)) {
            length = sideLengths.get(cacheKey);
        } else {
            length = points.get(a).distanceTo(points.get(b));
            sideLengths.put(cacheKey, length);
        }
        return length;
    }
    private double calculatePerimeter() {
        return sideLength(0,1) +
                sideLength(1,2) +
                sideLength(2,0);
    }
    public double perimeter() {
        if  (perimeter != null) {
            return perimeter;
        }
        perimeter = calculatePerimeter();
        return perimeter;
    }
    public double area() {
        if (area != null) {
            return area;
        }
        double s = perimeter() / 2;
        area = Math.sqrt(s * (s - sideLength(0,1)) * (s - sideLength(1,2)) * (s - sideLength(2,0)));
        return area;
    }

    public boolean pointInTriangle(Point p) {
        for(Point point : points) {
            if (point.equals(p)) {
                return true;
            }
        }
        return false;
    }
}
