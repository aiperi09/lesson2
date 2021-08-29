package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        System.out.println(weatherAge(generateRandomAge(),15));
        System.out.println(weatherAge(generateRandomAge(),13));
        System.out.println(weatherAge(generateRandomAge(),25));
        System.out.println(weatherAge(generateRandomAge(),45));
        System.out.println(weatherAge(generateRandomAge(),25));

    }
    public static String weatherAge(int age,int weather) {

        if (age > 20 && age < 45 && weather > -20 && weather < 30) {
            return "можно идти гулять";


        } else if (age < 20 && weather > 0 && weather < 28) {
            return "можно идти гулять";
        }else if (age > 45 && weather >- 10 && weather < 25){
            return "можно идти гулять";


        }else {
            return "оставайтесь дома";

        }

    }
    public static int generateRandomAge(){

        Random random = new Random();
        int book = random.nextInt(50)+1;
        return book;

    }



}





