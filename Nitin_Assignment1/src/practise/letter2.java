package practise;

public class letter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=9;i++) {
	if(i==1 || i==9)
	System.out.print("*");
	else
		System.out.print(" ");
}
	System.out.println();
for(int j=1;j<=9;j++) {
	if(j==2 || j==8)
		System.out.print("*");
		else
			System.out.print(" ");
}
System.out.println();
for(int k=1;k<=9;k++) {
	if(k==3 || k==5 || k==7)
	System.out.print("*");
	else
		System.out.print(" ");
}
	System.out.println();
	for(int q=1;q<=9;q++) {
		if(q==4 || q==6)
		System.out.print("*");
		else
			System.out.print(" ");
	}
		System.out.println();
	}

}
