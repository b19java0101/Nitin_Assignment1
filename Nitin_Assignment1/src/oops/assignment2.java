package oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Studentt {
	int roll_no,i=1;
	String[] name=new String[5];
	char grade;
	int[] arr=new int[5];
	double eng_marks,maths_marks,Sci_marks,total_marks,average;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

Studentt() throws IOException {
	for(int i=1;i<=arr.length;i++) {
		System.out.println("enter the roll no=");
		arr[i]=Integer.getInteger(br.readLine());
		System.out.println("enter the name of "+ i+"Student");
		name[i]=br.readLine();
	System.out.println("enter the eng marks for");
eng_marks=Double.parseDouble(br.readLine());
System.out.println("enter the maths marks=");
maths_marks=Double.parseDouble(br.readLine());
System.out.println("enter the Sci marks=");
Sci_marks=Double.parseDouble(br.readLine());
	}
}
void cal_total() {
total_marks=eng_marks+maths_marks+Sci_marks;
System.out.println("total marks are="+total_marks);
}
void cal_average() {
	average=(total_marks)/3;
System.out.println("average marks="+average);
}
void find_grade() {
	
}
}

public class assignment2  {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	}

}
