package oops;
class A  //super/parent/base
{
 /*A()
 {
 System.out.println("in parent class default constructor");
 }
A(int x)
{
System.out.println("in parent class overloaded constructor");
}*/
void sum(int x, int y)
{
System.out.println("Parent class method");
System.out.println(x+y);
}
void show()
{
System.out.println("hello");
}
}




class B extends A//sub/child/derived
{
B()
{
System.out.println("in Child class constructor");
}
B(String y)

{
    //hidden super() call to parent's default constructor
System.out.println("in Child class overloaded constructor");
super.show();
}
void show()
{
System.out.println("hi");

}
}
public class InheritanceDemo {

public static void main(String s[])
{
B a1=new B("hello");

a1.sum(10,20);
a1.show();//B's method
//a1.disp();

}
}