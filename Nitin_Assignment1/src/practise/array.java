package practise;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={2,4,8,7,11,77,88,1,2,4};
        int i,max;
        /*Scanner s=new Scanner(System.in);
        System.out.println("Enter elements in array");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }*/
        max=arr[0];
        for(i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);

	}

}
