package com.gunner2501;

import java.awt.*;
import java.util.Scanner;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scanner.nextInt();
        if (number % 3 == 0 && number % 5 == 0){
            System.out.println("BizzBuzz");
        }
        else if (number % 3 ==0){
            System.out.print("BUZZ");
        }
        else if (number % 5==0){
            System.out.print("Bizz");
        }
        else{
            System.out.print(number);
        }
    }
}