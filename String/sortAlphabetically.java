import java.util.Arrays;

public class sortAlphabetically {
    public static void main(String[] args) {
        String unsorted = "";
        String sorted = sorted(unsorted);
        System.out.println(sorted);
       
    }

    public static String sorted(String unsorted) {
        char ch []= unsorted.toCharArray();
        Arrays.sort(ch);
        return new String(ch); 
    }
}
