///proceed to the class MeetAStranger. The program must read a string from System.in and print a message "Hello, input".
///Note that when entering an input string consisting of several words, the entire input must be printed.
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class MeetAStranger {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(in)) {
            out.println("Hello, " + scanner.nextLine());
        }
    }
}