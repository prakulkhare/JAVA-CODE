import java.util.Scanner;
class Student{
    String name;
    int rollNumber;
    float marks;
    Student(String name,int rollNumber,float marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    } 

    void display_student_details(){
    System.out.println("Name:"+name);
    System.out.println("Roll Number:"+rollNumber);
    System.out.println("Marks:"+marks);
    }
    
    void grade(){
        if(marks >=90){
            System.out.println("A");
        }
        else if(marks >=80){
        System.out.println("B");
        }
        else if(marks >=60){
        System.out.println("C");
        }
        else if(marks >=40){
        System.out.println("D");
        }
        else{
        System.out.println("F");
        }
    }
}
public class pq7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the rollNumber: ");
        int rollNumber = sc.nextInt();
        System.out.println("Enter the marks: ");
        float marks = sc.nextFloat();
        
        Student std = new Student(name,rollNumber,marks);
        std.display_student_details();
        std.grade(); 
    }
}
