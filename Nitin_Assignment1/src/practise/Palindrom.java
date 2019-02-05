package practise;
import java.util.Scanner;
import java.lang.Math;
public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the no for checking palindrome");
int a=s.nextInt();
int num=a,c=0,sum=0;
while(a>0){

a=a/10;
c++;
}
a=num;
while(a>0){
	int k=a%10;	
	a=a/10;
sum=sum+(int)Math.pow(10,c-1)*k;	
c--;
}
if(num==sum){
	System.out.println("no is palindrome");
}
else{
	System.out.println("no is not palindrome");
}
	}

}
