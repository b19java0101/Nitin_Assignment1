package practise;

import java.util.Scanner;

public class ragard {
	 public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
     
     
     int col;
     int[][] arr=new int[3][];
     
     
     arr[0]=new int[3];
     arr[1]=new int[4];
     arr[2]=new int[2];
     
     
     /*for(int p=0;p<arr.length;p++)
     {
     System.out.println("Enter no. of columns for"+ p+ "row");
     col=sc.nextInt();
     arr[p]=new int[col];
     }*/
     
     
     
     
     for(int i=0;i<arr.length;i++)
     {
         for(int j=0;j<arr[i].length;j++)
         {
             arr[i][j]=sc.nextInt();
         }
     }
     //int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
     
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

