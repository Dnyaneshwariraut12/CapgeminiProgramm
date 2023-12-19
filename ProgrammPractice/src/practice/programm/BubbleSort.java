package practice.programm;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {64, 34, 25, 12, 22, 11, 90 };
		int n = arr.length;
		bubbleSort(arr, n);
		System.out.println("sorted array:");
		printArray(arr, n);
	}

	private static void printArray(int[] arr, int n) {
		int i;
		for(i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
			System.out.println();
		}
		
	}

	private static void bubbleSort(int[] arr, int n) {
		int i, j, temp;
		boolean swapped;
		for(i=0; i<n-1; i++) {
			swapped = false;
			for(j=0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
					swapped = true;
				}
			}
			if(swapped==false) {
				break;
			}
		}
		
	}

}
