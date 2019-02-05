package practise;

public class nn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5,6,7,8,9,10};
int[] arr1=new int[5];
int[] arr2=new int[5];
int j=0;
for(int i=0;i<arr.length;i++) {
	if(arr[i]%2==0) {
	arr1[j]=arr[i];	
	j++;
	}
	else{
		arr2[j]=arr[i];
	}
}
System.out.println("all even no are");
for(j=0;j<arr1.length;j++) {
	System.out.println(arr1[j]);
}
System.out.println("all odd no are");
for(j=0;j<arr2.length;j++) {
	System.out.println(arr2[j]);
}


	}

}