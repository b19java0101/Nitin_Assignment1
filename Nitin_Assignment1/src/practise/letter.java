package practise;

public class letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=2;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int k=3;k>=i;k--){
				System.out.print(" ");
			}
			for(int a=1;a<=1;a++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int l=1;l<=5;l++){
			if(l==1 || l==3 || l==5) {
				
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		for(int n=1;n<=2;n++){
			for(int o=1;o<=1;o++) {
			System.out.print("*");
			}
			for(int u=1;u<=n+1;u++) {
				System.out.print(" ");
			}
			for(int r=2;r>=n;r--) {
				System.out.print("*");
			}
			System.out.println();


	}

}
}