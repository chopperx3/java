public class LearnMainWhile {
    public static void main(String[] args) {
        int value = 42;
        while (value < 50) {
            value++;
            if (value > 44 && value < 48) {
                continue;
            }
            System.out.println("i = " + value);
        }
    }
}
