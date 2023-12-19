
public class PyramidOfCharacter {

	public static void main(String[] args) {
		
		for(int i=0; i<=5; i++) {
			char ch ='A';
	       System.out.print(" ");
			for(int j=1; j<=5; j++) {
				
				System.out.println(" "+ch);
				ch+=1;
				
			}
			
//			
			for(int j=1; j<i-1; j++) {
				System.out.print(ch);
				
			}
			
			System.out.println();
		}
	}

}
