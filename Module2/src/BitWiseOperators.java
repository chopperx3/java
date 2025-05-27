public class BitWiseOperators {
    public static void main(String args[]) {
        int a = 60;
        int b = 13;
        System.out.println("a & b   = " + (a & b)); // 12  = ... 0000 1100
        System.out.println("a | b   = " + (a | b)); // 61  = ... 0011 1101
        System.out.println("a ^ b   = " + (a ^ b)); // 49  = ... 0011 0001
        System.out.println("~a      = " + ~a); // -61 = 1111 1111 1111 1111 1111 1111 1100 0011
        System.out.println("a << 2  = " + (a << 2)); // 240 = ... 1111 00006
        System.out.println("a >> 2  = " + (a >> 2)); // 15  = ... 0000 1111
        System.out.println("a >>> 2 = " + (a >>> 2)); // 15  = ... 0000 1111
    }
}
