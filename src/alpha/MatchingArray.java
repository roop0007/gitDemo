package alpha;

import java.util.ArrayList;

public class MatchingArray {
	
	// Compare same indexes of two different arrays and create another array for matching values
	

	public static void main(String[] args) {


		int[] a = {1,4,5,7};
		int[] b = {6,4,3,7};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i= 0; i< a.length; i++) {
			
			if(a[i] == b[i]) {
				al.add(a[i]);
			}
		}
		Object[] c = al.toArray();


		for(Object ob : c ) {			//enhanced for loop
			System.out.println(ob);
		}
		

	}

}
