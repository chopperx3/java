/// While the conditional expression is "true", the statements of the loop body will be repeated.

class TestWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("Iteration: " + i);
            i++;
        }
    }
}