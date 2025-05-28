public class LearnMainFor {
    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 10 && j > -10; i++, j--) {
            if (i == 5) {
                break;
            }
            System.out.println("i = " + i + " j = " + j);
        }
        System.out.println("--------------------------------");
        for (int i = 0, j = 0; i < 10 && j > -10; i++, j--) {
            if (i == 5) {
                continue;
            }
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
