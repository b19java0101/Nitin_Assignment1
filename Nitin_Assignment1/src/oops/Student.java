package oops;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Student {

	int roll_no;//instance variables
    String name;
    float marks;
    static int i=1;
    static final String trainer_nm="Shikhi";
    //InputStreamReader b=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Student()throws IOException
    {
        System.out.println("Enter data for Student " + i);
        i++;
        System.out.println("Enter your roll_no.");
        roll_no=Integer.parseInt(br.readLine());
        System.out.println("Enter your name");
        name=br.readLine();
        System.out.println("Enter your marks");
        marks=Float.parseFloat(br.readLine());
    }
    void display()//instance method
    {
        System.out.println(roll_no+" "+ name+" "+marks);
    }
    
    public static void main(String[] args)throws IOException {
        Student s1=new Student();
        Student s2=new Student();
        s1.display();
        s2.display();
    
    }
}

