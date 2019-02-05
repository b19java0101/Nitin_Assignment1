package practise;
import java.util.Scanner;
public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the no ");
int a=s.nextInt();
int len=0;
while(a>0)
{
	len=len+1;
	a=a/10;
	
}
System.out.println(len);
	
	}

}
