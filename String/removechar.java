
public class removechar {
    public static void main(String[] args) {
        String input = "Hello World!";
        System.out.println(removeCharAt(input, 4));
	}   
    
	public static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos + 1);
	}
}
