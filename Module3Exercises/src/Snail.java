/// Snail
/// The purpose of this exercise is to train you in usage of simple integer operations.
///
/// Estimated workload of this exercise is 30 min.
///
/// Description
/// Consider a snail travels up a tree a feet each day. Then snail slides down b feet each night. Height of the tree is h feet.
///
/// Please, proceed to Snail class and write a program that prints number of days for the snail to reach the top of the tree.
///
/// Program reads a, b, h line by line. Input values are guaranteed to be positive integers.
///
/// If the snail cannot reach the top of the tree, print the message Impossible.

package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String h = scanner.nextLine();
        int climb = Integer.parseInt(a);
        int slide = Integer.parseInt(b);
        int height = Integer.parseInt(h);
        int days = 0;
        if (slide >= climb && slide < height) {
            System.out.println("Impossible");
        } else {
            int position = 0;
            while (true) {
                days++;
                position += climb;
                if (position >= height) {
                    break;
                }
                position -= slide;
            }
            System.out.println(days);
        }
    }
}
