import java.util.HashMap;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Size of array
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        //getting array elements
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //target value
        System.out.println("Enter the target value");
        int target = sc.nextInt();

        //create Hashmap
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],i);
        }

        int result []= new int[2];

        //if current element is equal to target
        for(int i=0;i<n;i++){
            if(arr[i] == target && map.containsKey(0)){
                result[0] = arr[i];
                result[1] = map.get(0);
                break;
            }
            else if(map.containsKey(target - arr[i])){
                //if the element is non repeatable
                if(map.get(target - arr[i]) > i){
                    result[0] = i;
                    result[1] = map.get(target - arr[i]);
                    break;
                }
            }
            else {
                result[0] = -1;
                result[1] = -1;
            }
        }

        //display the final result
        System.out.println("The resultant array index is: ["+result[0]+ ","+result[1]+"]" );
    }
}
