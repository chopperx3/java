import org.w3c.dom.ls.LSOutput;

public class SwitchMain {
    public static void main(String[] args) {
        var number = 1000;
        int result = method(number);
        System.out.println(result);
    }

    static int method(int number) {
        return switch (number) {
            case 1, 2, 3 -> number *= 2;
            case 7 -> number *= 4;
            case 4 -> number *= 5;
            default -> {
                System.out.println("range");
                yield number += 100;
            }
        };
    }
}