package oops;	
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Employee
{
	int empId;
	String empName;
	int total_leaves=5;
	double total_salary;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Employee() throws IOException
	{
		
		
		System.out.println("Please Enter employee Id = ");
		empId=Integer.parseInt(br.readLine());
		System.out.println("Enter your name = ");
		empName=br.readLine();
		
	}
void print_leave_details()
{
	
}
	
	void calculate_balance_leaves()
	{
		
	}
	boolean avail_leave(int no_of_leaves, char type_of_leave)
	{
		return false;
		
	}
	void calculate_salary() 
	{
		
	}
}
class Permanent_employe extends Employee 
{

	int paid_leave,sick_leave,casual_leave;
	double basic, hra,pfa,deduction;
	boolean flag=false;
	Permanent_employe() throws IOException
	{
		System.out.println("Please Enter your basic salary = ");
		basic=Double.parseDouble(br.readLine());
		paid_leave=5;//no salary deduct
		sick_leave=3;// salary deduct
		casual_leave=2;//salary deduct
		
	}
	void print_leave_details()
	{
		System.out.println("Total Leaves Detail:-");
		System.out.println("Paid leave=" + paid_leave );
		System.out.println("Sick Leave=" + sick_leave);
		System.out.println("casual Leave=" + casual_leave );
		
	}
	void calculate_balance_leaves()
	{
		
		System.out.println("Balance Leave Detail:-");
		total_leaves=paid_leave+sick_leave+casual_leave;
		System.out.println("Total leaves"+total_leaves);
	}
	boolean avail_leave(int no_of_leaves, char leaveType) 
	{
		if(leaveType=='p') 
		{	
			
			if(no_of_leaves<=paid_leave)
			{
				flag=true;
				paid_leave=paid_leave-no_of_leaves;
			}
			else 
			{
				flag=false;
			}
			
		}
		else if(leaveType=='s') 
		{	
			
			if(no_of_leaves<=sick_leave)
			{
				flag=true;
				sick_leave=sick_leave-no_of_leaves;
			}
			else 
			{
				flag=false;
			}
			
		}
		else if(leaveType=='c') 
		{	
			
			if(no_of_leaves<=casual_leave)
			{
				flag=true;
				casual_leave=casual_leave-no_of_leaves;
			}
			else 
			{
				flag=false;
			}
		}
		
		return flag;
	}
	void calculate_salary()
	{
		//Deduction=basic_salary
		pfa = (12/100)*basic;
		hra = (50/100)*basic;
		total_salary=basic+hra-pfa;
	System.out.println(total_salary);

	}

}
class Temporary_employe extends Employee
{
	boolean flag;
	Temporary_employe()throws IOException
	{
		
		System.out.println("Please Enter your salary = ");
		total_salary=Double.parseDouble(br.readLine());
	}
	
	void calculate_balance_leaves()
	{
		System.out.println("\n\n\t\t Balance Leave Detail \n\n");
		
		System.out.println("Total leaves"+total_leaves);
	}
	boolean avail_leave(int no_of_leaves, char type_of_leave)
	{
		if(no_of_leaves<=total_leaves)
		{
			flag=true;
			total_leaves=total_leaves-no_of_leaves;
		}
		else 
		{
			flag=false;
		}
		
		return flag;
		
	}
	void calculate_salary() 
	{
		System.out.println(total_salary);
	}

}

public class assignment1 {
public static void main(String args[]) throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int choice,no_of_leaves;
char leaveType,emptype;
Employee p;
System.out.println("Enter the type of employer=");
emptype=br.readLine().charAt(0);
if(emptype=='p')
{
	p=new Permanent_employe();
	do
	{
	System.out.println("Enter 1 if you want to print leave details");
	System.out.println("Enter 2 if you want to check balance leave");
	System.out.println("Enter 3 if you want to avail leave ");
	System.out.println("Enter 4 if you want to calculate salary");
	System.out.println("Enter 5 if you want to exit");
	choice=Integer.parseInt(br.readLine());
	switch(choice)
	{
	case 1:
			p.print_leave_details();
			break;
	case 2:
		p.calculate_balance_leaves();
		break;
	case 3:
		System.out.println("Please enter the number of leaves=");
		no_of_leaves=Integer.parseInt(br.readLine());
		System.out.println("Please enter the type of leave");
		leaveType=br.readLine().charAt(0);
		boolean flag=p.avail_leave(no_of_leaves,leaveType);
		if(flag==true)
		{
			System.out.println("leave Granted!!");
		}
		else
		{
			System.out.println("Sorry leave balance not available");
		}
		break;
	case 4:
		p.calculate_salary();
		break;
	case 5:
		System.exit(0);
		break;
	default:
		System.out.println("please enter right choice\n\n");
	}
	}while(choice!=5);
	
}
else
{
	p=new Temporary_employe();
	do
	{
	System.out.println("Enter 1 if you want to check balance leave");
	System.out.println("Enter 2 if you want to avail leave ");
	System.out.println("Enter 3 if you want to calculate salary");
	System.out.println("Enter 4 if you want to exit");
	choice=Integer.parseInt(br.readLine());
	switch(choice)
	{
	case 1:
		p.calculate_balance_leaves();
		break;
	case 2:
		System.out.println("Please enter the number of leaves=");
		no_of_leaves=Integer.parseInt(br.readLine());
		System.out.println("Please enter the type of leave");
		leaveType=br.readLine().charAt(0);
		boolean flag=p.avail_leave(no_of_leaves,leaveType);
		if(flag==true)
		{
			System.out.println("leave Granted!!");
		}
		else
		{
			System.out.println("Sorry leave balance not available");
		}
		break;
	case 3:
		p.calculate_salary();
		break;
	case 4:
		System.exit(0);
		break;
	default:
		System.out.println("please enter right choice\n\n");
	}
	}while(choice!=4);
//TemporaryEmp t=new TemporaryEmp();
}
}
}
