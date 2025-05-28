/// One or several iterative variables are initialized before the looping statement.
/// The loop body is executed where the values of one or several iterative variables have to be changed.
/// The "conditional expression" is calculated and if its value is "true," the loop body is executed again.
/// Otherwise, the loop is exited. Unlike the loop while, this loop will be executed at least once, while the body of the while loop might not be executed at all.

class TestDoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i > 5 && i < 10);
    }
}