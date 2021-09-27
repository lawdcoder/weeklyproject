package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner nums =new Scanner(System.in);
        System.out.println("Enter first Number");
        int num1 = nums.nextInt();

        System.out.println("Enter Second Number");
        int num2 = nums.nextInt();

        System.out.printf("Entered Numbers:%n%n",  num1,  num2);

        num1=num1+num2;
        num2 =num1-num2;
        num1 =num1-num2;

        System.out.printf("After Swapping: %n%n" + num1,  num2);
    }
}

