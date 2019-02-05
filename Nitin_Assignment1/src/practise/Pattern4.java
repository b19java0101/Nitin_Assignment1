package practise;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x;
		for(int i=1;i<=3;i++)
		{
			x=97;
			for(int k=2;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)x);
				x++;
			}
			
			for (int b=1;b<=i-1;b++)
			{
				x=x-2;
				System.out.print((char)x);
				x++;
				}
				
			
				System.out.println();
		}
	}
	}

			