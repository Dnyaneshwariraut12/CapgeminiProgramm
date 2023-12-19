package StreamApi;

public class Test{

	public static void main(String[] args) {

		int [] arr = {3,5,-6,78,-9,2,-11,-23,25,25,3,0,9,4,7,7};
		
		int pCount=0,nCount=0,Tcount = 0;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>0) {
				pCount++;
			}else if(arr[i]<0){
				nCount++;
			}
			else {
				Tcount++;
			}
		}
		System.out.println(pCount);
		System.out.println(nCount);
		System.out.println(Tcount);
	
		int count=0;
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					
				}
			}
			
		}
		System.out.println(count);
	}
	

}
