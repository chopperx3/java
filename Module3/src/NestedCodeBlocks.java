/// Variables declared in the outer code block are also accessible in the nested/inner blocks.
public class NestedCodeBlocks {
    public static void main(String[] args) {
        int counter = 1;
        {
            int valuelnt = 2 + counter++;
            System.out.println("counter = " + counter + "; valuelnt = " + valuelnt);
        }
    }
}
