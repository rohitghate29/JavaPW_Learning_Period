public class MergeSort {

    public static void mergeProecdure(int [] arr, int l, int mid, int r){
        int i,j,k;
        // n1-size of left subarray 
        // n2-size of right subarray 
        int n1= mid-l+1;
        int n2= r-mid;

        //create a left and right subarray
        int [] leftSubArray = new int [n1];
        int [] rightSubArray = new int [n2];

        //copy the elements into left and right subarray
        for(i=0 ; i<n1 ; i++){
            leftSubArray[i] = arr[l+i];
        }

        for(j=0 ; j<n2 ; j++){
            rightSubArray[j] = arr[mid+1+j];
        }

        //comparisons among the element in the left and right subarray
        i=0;
        j=0;
        k=l;

        while(i<n1 && j<n2) {
            if(leftSubArray[i] <= rightSubArray[j]){
                arr[k] = leftSubArray[i];
                i=i+1;
            } 
            else {
                arr[k] = rightSubArray[j];
                j=j+1;
            }
            k=k+1;
        }

        //copy the remaining elements from left sbarray
        while(i < n1){
            arr[k] = leftSubArray[i];
            i=i+1;
            k=k+1;
        }

        //copy the remaining elements from right subarray
        while(j < n2){
            arr[k] = rightSubArray[j];
            j=j+1;
            k=k+1;
        }
    }

    //function to do mergesort
    public static void mergeSort(int [] arr, int l, int r){
        if(l<r){
            //1.Divide array into two subproblems
            int mid= l+(r-l)/2;
            //2. Conquer the subproblems via recursion'
            //left subarray recursive call
            mergeSort(arr, l, mid);
            //right subarray recursive call
            mergeSort(arr, mid+1, r);

            //3. Combine - mergeProecdure
            mergeProecdure(arr, l, mid, r);
        }
    }

    public static void printArr(int []arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String []args){
        int arr [] = {50,20,40,90,88,11,13};
        int n = arr.length;

        System.out.println("Array before sorting is:  ");
        printArr(arr,n);
        
        mergeSort(arr,0,n-1);
        System.out.println();

        System.out.println("Array after sorting is:  ");
        printArr(arr,n);
    }
}

