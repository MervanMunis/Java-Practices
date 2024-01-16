public class Overloading {
    public static void printString(String s) {
        System.out.println(s);
    }

    public static void printString(String s, int count) {
        while (count > 0) {
            System.out.println(s);
            count--;
        }
    }
}
