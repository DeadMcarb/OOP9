package com.example.oop9.tabulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class FunctionsTest {


    Functions proces;

    double EPS = 0.000001;

    @BeforeEach
    void setUp() {
        proces = new Functions();
    }

    @ParameterizedTest
    @CsvSource({"2, 13.8",
            "0.6, 15.76",
            "0.3, 3.148703"})
    void testF(double x, double expected) {
        assertEquals(expected, proces.f(x),EPS);
    }


    @ParameterizedTest
    @CsvSource({"0.2, 2.8, 0.002, 1301",
            "0, 1, 0.1, 11"})
    void testCountSteps(double x1, double x2, double step, int expected) {
        assertEquals(expected, proces.countSteps(x1, x2, step));
    }

    public double sumArr(List<Point> array) {
        double sum = 0;
        for (Point point : array) {
            sum += point.getY();
        }
        return sum;
    }
    @Test
    void testSumElements() {
        double expected = 46.35204;
        List<Point> array = createTestArray();

        assertEquals(expected, proces.sumArr(array),1e-5);
    }

    private static List<Point> createTestArray() {
        List<Point> array = new ArrayList<>();
        array.add(new Point(0,1));
        array.add(new Point(2,2.5));
        array.add(new Point(3,3.425));
        array.add(new Point(4,4.097));
        array.add(new Point(5,5));
        array.add(new Point(6,6.32));
        array.add(new Point(7,7));
        array.add(new Point(8,8.01));
        array.add(new Point(9,9));
        array.add(new Point(10,0.00004));
        return array;
    }

    @Test
    void testArifSumElements() {
        double expected = 4.635204;
        List<Point> array = createTestArray();
        assertEquals(expected, proces.averArifm(array));
    }


    @Test
    void TestGetIndexOfMax() {
        int expected = 8;
        List<Point> array = createTestArray();
        assertEquals(expected, proces.getIndexOfMax(array));
    }


    @Test
    void TestGetIndexOfMin() {
        int expected = 9;
        List<Point> array = createTestArray();
        assertEquals(expected, proces.getIndexOfMin(array));
    }


}
