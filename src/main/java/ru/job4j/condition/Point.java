package ru.job4j.condition;

public class Point {
        public static double distance(int x1, int y1, int x2, int y2) {
            double onestp = x2 - x1;
            double twostp = y2 - y1;
            double threestp = Math.pow(onestp, 2);
            double fourstp = Math.pow(twostp, 2);
            double fivestp = threestp + fourstp;
            double sixstp = Math.sqrt(fivestp);
            return sixstp;

        }

        public static void main(String[] args) {
            double result = Point.distance(0, 0, 2, 0);
            System.out.println("result (0, 0) to (2, 0) " + result);
            double result1 = Point.distance(0, 2, 3, 3);
            System.out.println("result (0, 2) to (3, 3) " + result1);
            double result2 = Point.distance(0, 0, 5, 0);
            System.out.println("result (0, 0) to (5, 0) " + result2);
            double result3 = Point.distance(2, 0, 3, 5);
            System.out.println("result (2, 0) to (3, 5) " + result3);
        }
}
