


public class palindrome {
    public static void main(String[] args) {
        String s = "Radar";
        String empty = "";
        for(int i=(s.length()-1); i>=0; i--) {
            empty = empty + s.charAt(i);
        }

        if(empty.toLowerCase().equals(s.toLowerCase())){
            System.out.println("Given String is Palindrome.");
        }
        else{
            System.out.println("Given String is not Palindrome.");
        }
    }
}
