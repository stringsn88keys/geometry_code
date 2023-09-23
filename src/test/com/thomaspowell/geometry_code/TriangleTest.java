package com.thomaspowell.geometry_code;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    public Triangle UnitRightTriangle() {
        return new Triangle(0, 0, 1, 0, 0, 1);
    }
    @Test
    public void UnitRightTriangleArea() {
        assertEquals(0.5, UnitRightTriangle().area());
    }

    @Test
    public void UnitRightTrianglePerimeter() {
        assertEquals(2 + Math.sqrt(2), UnitRightTriangle().perimeter());
    }
}