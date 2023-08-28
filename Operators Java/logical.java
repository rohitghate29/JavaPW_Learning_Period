public class logical {
    public static void main(String[] args) {
        // And = &&
        // OR = ||
        // Not = !

        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(a == b && b == c && c == a);
        System.out.println(a < b && b < c && c >= a);
        System.out.println(a == b || a < b || a > c);
        System.out.println(!true);
    }
}
