import java.util.Arrays;

public class TwoArrayContainsSameElement {

	public static void main(String[] args) {
		
		int[] a = {2,4,5,6,7};
		int[] b = {4,5,6,7,2};
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean value =Arrays.equals(a, b);
		System.out.println("Array a and b contains same element: " + value);;
	}

}
