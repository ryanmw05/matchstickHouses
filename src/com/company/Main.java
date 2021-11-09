package com.company;

import java.util.Scanner;

public class Main {

    public static int getIntInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many houses");
        return input.nextInt();
    }

    public static int houses(){
        int house = (((getIntInput() - 1) * 5) + 6);
        return house;
    }

    public static void main(String[] args) {
        System.out.println("You need " + houses() + " matchsticks");
    }
}
