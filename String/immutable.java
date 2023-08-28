public class immutable {
    public static void main(String[] args) {
        
        String s1 = "pw";
        String s2 = "pw"; // s1 and s2 are present in the SCP(String constant pool)
        System.out.println(s1 == s2); // duplicate values are not allowed in SCP 
        System.out.println(s1.equals(s2));

        String s3 = new String("Pwskills"); //by using new keyword we allocate s3 to heap memory
        String s4 = new String("Pwskills"); //s3 and s4 have their own memory
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}


