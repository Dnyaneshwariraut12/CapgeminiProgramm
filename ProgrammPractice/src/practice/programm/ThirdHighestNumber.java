package practice.programm;

public class ThirdHighestNumber {

	public static void main(String[] args) {
		int a[]= {10,40,50,23,12,60};
		int temp;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if (a[i]<a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		
		}
		System.out.println("The second largest no is:" +a[3]);

	}

}
