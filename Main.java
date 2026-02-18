import java.util.*;

class Student {
    int rollNo;
    String name;
    int age;
    String batch;
    int marks;
 Student(int r, String n, int a, String b, int m) {
        rollNo = r;
        name = n;
        age = a;
        batch = b;
        marks = m;
    }
void display() {
        System.out.println("Student Details:");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Batch   : " + batch);
        System.out.println("Marks   : " + marks);
        if (marks >= 80) {
            System.out.println("Result  : Topper");
        } else {
            System.out.println("Result  : Average");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int r = s.nextInt();
        s.nextLine();
        System.out.print("Enter Name: ");
        String n = s.nextLine();
        System.out.print("Enter Age: ");
        int a = s.nextInt();
        s.nextLine();
        System.out.print("Enter Batch Name: ");
        String b = s.nextLine();
        System.out.print("Enter Marks: ");
        int m = s.nextInt();
        Student st = new Student(r, n, a, b, m);
        st.display();
        s.close();
    }
}