package Pattern;

public class CharIncrement {

	public static void main(String[] args) {
		
		for(int i=0; i<=5; i++) {
			char ch ='A';
			
			for(int j=0;j<=i; j++) {
				
				System.out.print(ch);
				
				ch+=1;
				
			}
			System.out.println(" ");
		}
	
	}

}
