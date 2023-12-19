
public class ShuffleArray {

	public static void main(String[] args) {
		
		String[] str = {"A", "C","E","B"};
		
		for(int i=0; i<str.length;i++) {
			
			int index = (int) (Math.random() * str.length);
			
			//shuffle the element from that with the current one
			
			String temp = str[i];
			str[i] = str[index];
			str[index] = temp;
			
			for(String s : str) {
				System.out.print(s + " ");
			}
			
		}
		
	}

	

}
