import java.util.Scanner;

public class OneDimension {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		int n = sc.nextInt();
		
		int arr[]= new int [n];
		System.out.println("Enter the array Element:");
		for(int i =0; i<n; i++) {
				arr[i]= sc.nextInt();			
		}
		System.out.println("Array Element is:");
		for(int i =0; i<n; i++) {
			if(arr[i]%2==0) {
			System.out.println(arr[i] + " No is even");
			}else {
				System.out.println(arr[i] + " no is odd");
			}
		}
		
	}

}
