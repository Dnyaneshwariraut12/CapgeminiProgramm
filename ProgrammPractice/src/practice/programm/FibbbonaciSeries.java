package practice.programm;

public class FibbbonaciSeries {

	public static void main(String[] args) {
//		int n1=0, n2=1, n3, i, count=10;
//		System.out.print(n1 + " " +n2);
//		
//		for(i=2; i<count; i++) {
//			n3 = n1+n2;
//			System.out.print(" "+n3);
//			n1=n2;
//			n2=n3;
//		}
//		
		char[] arr ={'e','o','B','c','A','a','b','a'};
	 
	   
		for(int i =0;i<=arr.length-1;i++){
		    for(int j=i+1;j<=arr.length-1;j++){
		        if(arr[i] == arr[j]){
		            count++;
		        }
		    }
		    System.out.println(arr[i]);
		}
	}

}
