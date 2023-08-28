public class cocatination {
    public static void main(String[] args) {
        // String s1 = new String("Pw");
        // s1 =  s1.concat("Skills");
        // System.out.println(s1);

        String s1 = "PwJava";
        String s2 = s1.concat("Skills");
        String s3 = new String("PwJava");
        s3 = s3.concat("Skills");

        String s4 = "String" + 100 + 99 ;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
