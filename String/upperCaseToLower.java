

public class upperCaseToLower {
    public static void main(String[] args) {
        String s = "LOWERCASE tO uppercase";

        String convertedString = convert(s);
        System.out.println(convertedString);
    }

    public static String convert(String s) {
        StringBuilder result = new StringBuilder();
        
        for(char c : s.toCharArray()) {
            if(Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if(Character.isLowerCase(c)){
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
