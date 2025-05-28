/// Since a simple program consists of one class, the scope of a global variable is the entire program.
class Scope {
    static int x = -1;

    public static void main(String[] args) {
        System.out.println("x = " + x);
    }
}