package practise;
import java.util.Scanner;
public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,4,8,7,11,77,88,1,2,4};
		int i,j,max,max1;
		/*Scanner s=new Scanner(System.in);
        System.out.println("Enter elements in array=");*/ 
        max=arr[0];
		for(i=0;i<arr.length;i++)
        {
			if(arr[i]>max) {
            max=arr[i];}
        }
        System.out.println("first max no is" + max);
        max1=arr[0];
        for(j=0;j<arr.length;j++)
        {
        	if(arr[j]==max) {
        		
        	}
        	else {
        		if(arr[j]>max1) {
        			max1=arr[j];
        		}
        		
        	}
        
        }
        System.out.println("Second max no is" + max1);
	}

}
