/// You can declare two or more local variables with the same identifier in different code blocks.
public class IndependendCodeBlocks {
    public static void main(String[] args) {
        {
            int x = 10;
            int y = -10;
            System.out.println("(" + x + "; " + y + ")");
        }
        {
            double x = 0.1;
            double y = -0.1;
            System.out.println("(" + x + "; " + y + ")");
        }
    }
}
