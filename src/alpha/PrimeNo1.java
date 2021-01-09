package alpha;

public class PrimeNo1 {
	
	public static String checkPrime(int a) {
		
		boolean result= false;
		String str="";
		
		
		for(int i=2; i<=a/2; i++) {
			
			if(a%i ==0) {
				
				result = true;
				break;
			}
		}
			
			if(result) {
				str = "It is not prime";
				
			}
			else {
				str = "It is prime";
			}
		
		return str;
		
	}

	public static void main(String[] args) {
		
		System.out.println(checkPrime(3)); //ENTER NUMBER



	}

}
