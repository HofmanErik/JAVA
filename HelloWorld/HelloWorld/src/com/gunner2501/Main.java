package com.gunner2501;

import java.util.Scanner;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age: ");
        long age = scanner.nextByte();
        if (age < 100) {
            System.out.println("You are "+age);
        }else{
            System.out.println("You are to old");
        }
    }
}