import java.util.*;
class AsciiValue {

    public static void main(String[] args) {
        char ch = 's';
        int ascii = ch;
        // casting char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}
