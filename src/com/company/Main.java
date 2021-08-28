package com.company;

public class Main {

    public static void main(String[] args) {
    weatherAge(45,15);
    weatherAge(25,15);
    weatherAge(15,35);
    weatherAge(15,15);
    weatherAge(15,95);
    weatherAge(65,15);

    }

    public static void weatherAge(int weather, int age ) {
        if (age > 20 && age < 45 && weather > -20 && weather < 30) {
            System.out.println("можно идти гулять");

        } else if (age < 20 && weather > 0 && weather < 28) {
            System.out.println("можно идти гулять");

        } else if (age > 45 && weather > -10 && weather < 25) {
            System.out.println("можно идти гулять");

        } else {
            System.out.println("оставайтесь дома");

        }
    }
}

