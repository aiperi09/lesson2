package com.company;

public class Main {

    public static void main(String[] args) {
    String method = "Можно идти гулять";
    String method2 = "Оставайтесь дома";
        System.out.println(weatherAge(40,25,method,method2));
        System.out.println(weatherAge(100,50,method,method2));
        System.out.println(weatherAge(15,35,method,method2));
        System.out.println(weatherAge(15,15,method,method2));
        System.out.println(weatherAge(15,95,method,method2));
        System.out.println(weatherAge(65,15,method,method2));



    }

    public static String weatherAge(int weather, int age,String text,String text2) {
        if (age > 20 && age < 45 && weather > -20 && weather < 30) {
        return text;
        } else if (age < 20 && weather > 0 && weather < 28) {
        return text;
        } else if (age > 45 && weather > -10 && weather < 25) {
            return text;
        } else {
            return text2;
        }
    }
}

