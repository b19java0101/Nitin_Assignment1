package practise;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x;
		for(int i=1;i<=3;i++)
		{
		 x=97;
		 for(int j=2;j>=i;j--)
		 {
			 System.out.print(" ");
		 }
		 for(int k=1;k<=(2*i-1);k++)
		 {
			 System.out.print((char)x);
			 x++;
		 }
		 
		System.out.println();
		}
	}

}
