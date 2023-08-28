public class ternary {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 30;
        int res = (a < b) ? a : b;
        System.out.println(res);

        // If the condition is true, part before the Colon will be executed
        // else the part after the colon will be executed
        String result = (a < b) ? "a is less" : "b is less";
        System.out.println(result);

        int num = (a < b) ? (a < c ? a : b) : (b < c ? b : c);
        System.out.println(num);

        String add = (a<b) ? "true":"false"; 
        System.out.println(add);


    }
}
