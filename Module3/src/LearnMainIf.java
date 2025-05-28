package by.epam.learn.flow;

public class LearnMainIf {
    public static void main(String[] args) {
    }

    public static double perimeter(double a, double b) {
        double result;
        if (a > 0 && b > 0) {
            result = 2 * (a + b);
        } else {
            result = -1;
        }
        return result;
    }
}
