import java.util.Scanner;

public class TwoDimssionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int m= sc.nextInt();
		int n= sc.nextInt();
		
		System.out.println("Enter the Array ");
		int arr[][] = new int [m][n];
	
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				 arr[i][j] =sc.nextInt();
			}
		}
	
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
			
			
			
			
			
			
		}
	
	}

}
