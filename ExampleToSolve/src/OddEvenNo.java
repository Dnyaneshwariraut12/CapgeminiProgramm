
public class OddEvenNo {

	public static void main(String[] args) {
		int arr[] = {2,3,5,6,8,7,9,10};
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2==0) {
				
				System.out.println("Even No is: " + arr[i]);
			}
			
		}
	for(int i=0; i<arr.length; i++) {
		if(arr[i]%2!=0) {
			System.out.println("Odd no is: " + arr[i]);
		}
	}
	}

}
