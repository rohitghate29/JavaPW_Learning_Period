class conditionals {
    public static void main(String[] args) {
        int age = 18;

        if(age>=18 && age<60) 
        {
            if(age>=20 && age<30)
            {
                System.out.println("You're in 20's");
            }
            else if(age>=30 && age<40) 
            {
                System.out.println("You're in 30's");
            }
            else{
                System.out.println("You're still kid");
            }
        }
        else if(age>60)
        {
            System.out.println("You're an old man");
        }
        else if(age>=16 && age<18)
        {
            System.out.println("You're an teen ager");
        }
        else {
            System.out.println("You're a kid");
        }   
        
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }   
            System.out.print(i + " ");
        }
        
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
        
                System.out.print(j + " ");
        
            }
        
            System.out.println();
        
        }
    }
}
