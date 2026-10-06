public class Code {
    public static void main(String[] args) {
        // Integers --> byte, short, int, long
        byte b = 5; // 1 byte
        short s = 10; // 2 bytes
        int i = 4000; // 4 bytes
        long l = 100000; // 8 bytes

        // Real numbers --> float, double
        float f = 5.5f; // 4 bytes single precision
        // double d = 10.5; // 8 bytes
        double d = 6.022E23; // 8 bytes double precision

        // Character --> char
        char c = 'A'; // 2 bytes

        //Boolean
        boolean bool = false; 

        System.out.println("Integer values -->" + b + " " + s + " " + i + " " + l);
        System.out.println("Real numbers -->" + f + " " + d);
        System.out.println("Character value -->" + c);
        System.out.println("Boolean value -->" + bool);
    }
}