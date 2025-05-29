/// Please, proceed to HelloStrangers class and write a program that:
///
/// asks for a number - amount of strangers to meet,
/// then reads stranger names line by line
/// and, finally, prints line by line "Hello, stranger name" for each stranger.
/// It is guaranteed that the input is not null. It is guaranteed that the input of strangers count is int number.
///
/// Consider special cases:
///
/// If strangers count is zero, then program must print "Oh, it looks like there is no one here".
/// If strangers count is negative, then program must print "Seriously? Why so negative?".
/// Hint: In case you use the Scanner class, it might be helpful sure to check strings it reads be non-empty.

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int intNumber = Integer.parseInt(number);
        if (intNumber == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else if (intNumber < 0) {
            System.out.println("Seriously? Why so negative?");
        } else {
            for (int i = 0; i < intNumber; i++) {
                String name = scanner.nextLine();
                System.out.println("Hello, " + name);
            }
        }
        scanner.close();
    }
}