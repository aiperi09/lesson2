package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(weatherAge(30,25));
        System.out.println(weatherAge(100,50));
        System.out.println(weatherAge(15,35));
        System.out.println(weatherAge(15,15));
        System.out.println(weatherAge(15,95));
        System.out.println(weatherAge(65,15));



    }

    public static String weatherAge(int weather, int age) {
        if (age > 20 && age < 45 && weather >  - 20 && weather < 30) {
        return "Можно идти гулять";
        } else if (age < 20 && weather > 0 && weather < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && weather > -10 && weather < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}

