public class reverseString {
    public static void main(String[] args) {
        String s = "WelcomePW";
        int len = s.length();
        String reversed = "";

        for (int i = len - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }
        System.out.print("Reverse of " + s + " is : " + reversed);

        // Using StringBuilder
        // StringBuilder sb = new StringBuilder(s);
        // System.out.println(sb.reverse());
    }
}
