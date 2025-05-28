//Proceed to ElectronicWatch class. The program must print an electronic watch screen output for a given value of seconds since midnight.
//
//Input value is given via System.in. Output value must be printed to System.out
//
//It is guaranteed that the input number is non-negative.
//
//Output format is h:mm:ss (possible values: [0:00:00; 23:59:59]).
//
//Extra challenge: try to solve the task without using if statements or cycles.
//
//Example:
//
//Input: 3601
//Output: 1:00:01
//
//Input: 86460
//Output: 0:01:00
//
//package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        scanner.close();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secondsInMinutes = seconds % 60;
        hours = (hours > 23) ? 0 : hours;
        System.out.printf("%d:%02d:%02d ", hours, minutes, secondsInMinutes);
    }
}