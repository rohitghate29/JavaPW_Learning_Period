public class lambda2 {
    public static void main(String[] args) {
        // A a = a -> a.length();
        // A x = y -> {return y;};
        // A s = "2" -> Integer.parseInt(s);
        // A b = (String s) -> 1;

        try
        {
            int a, b;
            b = 0;
            a = 5 / b;
            System.out.print("A");
        }
        catch (ArithmeticException e)
        {
            System.out.print("B");
        }
    }
}
