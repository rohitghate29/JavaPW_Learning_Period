import java.util.*;

public class switchCaseCalci {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers.");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Enter 1,2,3 or 4 to perform Operation");
            int button = sc.nextInt();
            switch(button)
            {
                case 1: System.out.println(a + b);
                break;
                case 2: System.out.println(a - b);
                break;
                case 3: System.out.println(a * b);
                break;
                case 4: System.out.println(a/b);
                break;
                default: System.out.println("Invalid Input");
            }
        }
    }
}
