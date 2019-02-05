package oops;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class employe {


	static int i=1; //instant variable 
  static int ID_no=101;
	String name;
	String profile;
	int salary;
	static final String company_nm="BeBo Technology";
	//InputStreamReader br=new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
   employe() throws IOException
 {
 System.out.println("Enter data for Employe :"+i);
 i++;
 
 System.out.println("alloted Employe ID_no :" );
//roll_no=Integer.parseInt(br.readLine());   //(if we do not print roll automatical and roll no does not declare static)
 
 System.out.println("Enter Employe name:");
 name=(br.readLine());
 
 System.out.println("Enter Employe profile:"); 
 profile=(br.readLine());
 
 System.out.println("Enter Student salary:");
 salary=Integer.parseInt(br.readLine());
 }
 
void display()
{
	System.out.println(ID_no+" "+name+" "+profile+" "+salary+" "+company_nm);
	ID_no++;
	}
	
	
public static void main(String[] args)throws IOException
	{
	/* (if we print only 1-3 then we use only constructor) 
	Employe s1=new Employe();
	Employe s2=new Employe();
		s1.display();
		s2.display();
		*/
		
	//(we use array for multiple object printed)
	int i;
	employe[]s=new employe[4];
	for(i=0;i<s.length;i++)
	{
	s[i]=new employe();
	}
       for(i=0;i<s.length;i++)
       {
    	s[i].display();   
       }
       }
     
}

