package Constructor;

class student {
    private int age;
    private String name;

    // Constructor 
    student(String name, int age)
    {
        this.name=name;
        this.age=age;

    }
    // Getters
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    // // Setters
    // public void setAge(int age){
        
    //     this.age = age; 
    // }
    // public void setName(String name ){

    //     this.name = name;
    // }

    // public void show(){
    //     System.out.println(name + "," + age);
    // }
}

public class encapsulation {
    public static void main(String[] args) {
        

        student obj = new student("Rohit", 21);
        // student obj1 = new student();

        String name=obj.getName();
        System.out.println(name);

        int age = obj.getAge();
        System.out.println(age);
        // obj.setAge(18);
        // obj1.setAge(22);
        // obj.setName("Rohit");
        // obj1.setName("Sonu");
        // obj.show();
        // obj1.show();
    }
}

// Asg Q3. Ans : 

// class person {
//     private int age;
//     private String name;

//     public void setAge(int age) {
//         this.age=age;
//     }
//     public void setName(String name) {
//         this.name=name;
//     }

//     public int getAge(int age){
//         return age;
//     }
//     public String getName(String name){
//         return name;
//     }
// }