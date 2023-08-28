class Typecasting {
    public static void main(String []args) {
        int a=45; //int= 4byte space
        double b; //double= 8byte space
        b=a; //TypeCasting
        System.out.println(b);

        double num1=66.9;
        int num2;
        num2=(int)num1; //Explicit TypeCasting
        System.out.println(num2);

        int n1=12;
        int n2=5;
        float res = n1/n2; 
        System.out.println(res);
    }    
}


