public class twoDarrays {
    public static void main(String[] args) {

        // int nums[][] = new int[3][2];

        // nums[0][0]=2;
        // nums[0][1]=6;
        // nums[1][0]=5;
        // nums[1][1]=1;
        // nums[2][0]=7;
        // nums[2][1]=9;

        int nums [][] = {
                            {2,6,2,5}, 
                            {5,1,6,3}, 
                            {7,9,6,9}
                        };
        System.out.println(nums.length); //This length is a property

        String a = "Rabbit";
        System.out.println(a.length()); //This length() is a method
        // Traditional ForLoop 
        // for(int i=0; i<=2;i++)
        // {
        //     for(int j=0;j<=1;j++)
        //     {
        //         System.out.print(nums[i][j]+ " ");
        //     }
        //     System.out.println();
        // }

        // Enhanced ForLoop 
        // for(int a[] : nums)
        // {
        //     for(int b : a)
        //     {
        //         System.out.print(b + " ");
        //     }
        //     System.out.println();
        // }
    }
}
