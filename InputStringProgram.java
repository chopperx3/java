import java.util.Scanner;

public class InputStringProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a string: ");
        String s = sc.nextLine();
        System.out.println("You wrote: " + s);
    }
}
