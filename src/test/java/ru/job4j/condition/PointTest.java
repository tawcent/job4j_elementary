package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2.0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when02to33then3dot16() {
        double expected = 3.16;
        Point a = new Point(0, 2);
        Point b = new Point(3, 3);
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(expected, withPrecision(0.01));

    }

    @Test
    void when00to50then5() {
        double expected = 5;
        Point a = new Point(0, 0);
        Point b = new Point(5, 0);
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(expected, withPrecision(0.01));

    }

    @Test
    void when20to35then5dot09() {
        double expected = 5.09;
        Point a = new Point(2, 0);
        Point b = new Point(3, 5);
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(expected, withPrecision(0.01));

    }

}