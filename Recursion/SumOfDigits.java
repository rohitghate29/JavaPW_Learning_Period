public class SumOfDigits {

    static int sumOfDigits(int num){
        //Base case Condition
        if (num == 0){
            return 0;
        }
        //Recursive function call 
        return (num % 10) + sumOfDigits(num/10);
    }
    public static void main(String[] args) {
        
        int num = 12345;
        //function calling
        int result = sumOfDigits(num);
        System.out.println("Sum of all digits is: " + result);
    }
}
