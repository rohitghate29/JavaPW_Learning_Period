public class PrintMultiples {

    //Function Definition
    public static void printTable(int n, int k){

        // 1. Base case condition
        if(k == 1){
            System.out.println(n);
            return;
        }

        // 2. Recursive function calls
        printTable(n,k-1);
        System.out.println(n * k);
    }

    public static void main(String[] args) {
        
        int n = 10;
        int k = 8;
        printTable(n,k);
        System.out.println();
    }
}
