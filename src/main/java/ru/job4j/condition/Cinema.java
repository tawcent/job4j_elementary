package ru.job4j.condition;

public class Cinema {
    public static void acces(int age) {
        System.out.println("The age of the customer is : " + age);
        if (age >= 18) {
            System.out.println("Welcone to the cinema!");
        } else {
            System.out.println("It is not for you");
        }
    }

    public static void main(String[] args) {
        Cinema.acces(18);
        Cinema.acces(16);
        Cinema.acces(25);
    }
}
