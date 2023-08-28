

public class stringDemo {
    public static void main(String[] args) {
        String s = "umbrella";
        char target = 'e';
        boolean present = false;
    
        for(int i=0; i<s.length(); i++){
            
            if(target == s.charAt(i)){
                present = true;
                break;
            }
        }

        if(present) {
            System.out.println(target + " is present in " + s);
        }
        else {
            System.out.println(target + " is not present in " + s);

        }
    }
}
