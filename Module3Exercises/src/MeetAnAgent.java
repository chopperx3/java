/// Please, proceed to MeetAnAgent class and write a program that:
///
/// asks for an input number,
/// if the input equals to the secret password number, prints "Hello, Agent",
/// otherwise, prints "Access denied".
/// Secret password is stored in final static int PASSWORD.
///
/// It is guaranteed that the input is not null.

package com.epam.rd.autotasks.meetanagent;

import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        scanner.close();
        int intPassword = Integer.parseInt(password);

        if (intPassword == PASSWORD) {
            System.out.println("Hello, Agent");
        }
        else {
            System.out.println("Access denied");
        }
    }
}