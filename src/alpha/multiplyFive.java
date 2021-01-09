package alpha;

public class multiplyFive {
	
	//Print 5 multiplication table without using Multiply operator
	
	public static int multiply(int i, int j) {
		
		int k=1;
		int sum = 0;
		
		while(k<=j) {
			
			sum =sum + i;
			k++;
			
		}
		return sum;
		
//		int sum= 0;
//		for(int x=1; x<=j;x++) {
//			sum = sum + i;
//			
//		}
//		return sum;
	}

	public static void main(String[] args) {


		int result = multiply(5,10);
		System.out.println(result);

	}

}
