import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student 
{
    int marks;
    int age;
    String name;
    public Student(int marks, int age, String name)
    {
        this.marks = marks;
        this.age = age; 
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String toString()
    {
        return ""+ marks + "-" + age + "-" + name;
    }
    
}

// Traditional Method 

// class Alpha implements Comparator<Student>
// {
//     public int compare(Student a, Student b)
//     {
//         if(a.age > b.age)
//         return 1;
//         else
//         return -1;
//     }
// }


public class collectionsMethod {
    public static void main(String[] args) {
        
        Student s1 = new Student(44,19,"golu");
        Student s2 = new Student(53,18,"bholu");
        Student s3 = new Student(34,20,"chomu");

        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        System.out.println(al);

        // Collections.sort(al);
        // Alpha a = new Alpha();
        // Collections.sort(al,a);
        // System.out.println(al);

        // Using Lamda Expression 
        Comparator<Student> com= (Student a, Student b)->{
            if(a.marks > b.marks)
            return 1;
            else
            return -1;
        };

        Collections.sort(al,com);
        System.out.println(al);

    }
}
