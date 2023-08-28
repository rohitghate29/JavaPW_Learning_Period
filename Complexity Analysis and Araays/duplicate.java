public class duplicate {
    public static void main(String[] args) {
        
        int arr [] = {2,4,4,10,6,10};
        int n = arr.length;
        int flag =0;

        for(int i =0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println("Duplicate element is: " + arr[i]);
                    flag = 1;
                }
            }
        }
        if(flag !=1) {
            System.out.println("No duplicate elements found.");
        }
    }
}
