package practise;

public class letter3 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		for(int m=1;m<=5;m++) {
			if(m==1 || m==3 || m==5) {
				for(int i=1;i<=4;i++) {
			if(i==1 || i==2 || i==3)
			System.out.print("+");
			else 
			System.out.print(" ");
				}
			}
				else {
				for(int j=1;j<=4;j++) {
						if(j==1 || j==4)
						System.out.print("+");
						else 
							System.out.print(" ");
						}
				}
		System.out.println();
			}
	}

}
