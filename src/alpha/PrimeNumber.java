package alpha;

public class PrimeNumber {

	public static void main(String[] args) {


		//11%i = 0
		boolean flag = false;
		int val = 13;
		
		for(int i =2; i<=val/2;i++) {
			
			if(val%i ==0) {
				flag=true;
				
			}
				
		}
		
		if(flag) {
			System.out.println("It is not prime");
			
		}
		else {
			System.out.println("It is prime");
		}
	}

}
