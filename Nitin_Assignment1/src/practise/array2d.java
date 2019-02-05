package practise;

public class array2d {
	public static void main(String[] args) {
        /*    Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows for 2D array");
        int row=sc.nextInt();
        System.out.println("Enter no. of columns for 2D array");
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }*/
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        

    }

}
