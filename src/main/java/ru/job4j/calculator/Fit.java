package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short heightMan) {
        if (heightMan <= 100) {
            throw new IllegalArgumentException("Рост мужчины должен быть больше 100 см");
        }
        double result = (heightMan - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short heightWoman) {
        if (heightWoman <= 110) {
            throw new IllegalArgumentException("Рост женщины должен быть больше 110 см");
        }
        double result = (heightWoman - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 165;
        double man = Fit.manWeight(heightMan);
        System.out.println("Man 187 is " + man);
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Woman 165 is " + woman);
    }

}
