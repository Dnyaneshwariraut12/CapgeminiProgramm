
public class SecondLargestNo {

	public static void main(String[] args) {
		
		int arr[] = {2,4,5,8,9,11,13,21};
		int temp=0;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]<arr[j]){
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			
		}
		System.out.println("Second Largest No is: " + arr[1]);
	}

}
