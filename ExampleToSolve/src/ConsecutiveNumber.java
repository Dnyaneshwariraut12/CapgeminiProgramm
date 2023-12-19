
public class ConsecutiveNumber {

	public static void main(String[] args) {
		
		int arr[] = {4,2,6,8,9};
		int n = arr.length;
		int sum = 0;
		
		for(int i=0; i<n+1; i++) {
			
			sum = arr[i] + arr[i+1];
			
		}
		System.out.println(sum+" ");
	}

}
