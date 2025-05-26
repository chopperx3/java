import java.util.Scanner;

public class InputStringProgram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        String s;
        System.out.println("Write a number: ");
        number = sc.nextInt();
        System.out.println("Write a string: ");
        s = sc.next();
        System.out.println("You wrote: " + number + " " + s);
    }
}
