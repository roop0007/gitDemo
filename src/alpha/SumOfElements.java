package alpha;

public class SumOfElements {

	//Create a method which accepts Array and returns sum of all the elements in Array
	
	public static int arraySum(int[] a) {
		
		int sum=0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
		
	
	}
	
	
	
	
	public static void main(String[] args) {


		int[] a= {1,2,3,4,5};
		int sum = arraySum(a);
		System.out.println(sum);

	}

}
