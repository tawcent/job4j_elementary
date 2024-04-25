package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float resultdol = value / 60;
        return resultdol;

    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(240);
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output; /* test euro */
        float input1 = 240;
        float expected1 = 4;
        float output1 = Converter.rubleToDollar(input1);
        boolean passed1 = expected1 == output1; /* test dollar */
        System.out.println("140 rubles are " + euro + " euro. Test result : " + passed);
        System.out.println("180 dollars are " + dollar + " dollars. Test result : " + passed1);


    }

}
