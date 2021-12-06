package com.company;
public class Main {

    public static void main(String[] args) {

        generateRandomAge();

    }

    public static int generateRandomAge(){
        int min = 1;
        int max = 100;
        System.out.println("Random age between about "+ min+"to"+max+":");
        int b = (int) (Math.random()*(max-min+ min)+min);
        System.out.println(b);
        return b;
    }
}


