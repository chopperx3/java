public class CodeBlockMain {
    public static void main(String[] args) {
        int a = 1;
        {
            a++;
            System.out.println("a = " + a);
        }
    }
}
