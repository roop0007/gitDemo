package alpha;

import java.util.ArrayList;

public class PukPuk {
	
	boolean flag=false;
	String result="";
	
	String prime(int a) {
		
		for(int i=2; i<a/2;i++) {
			
			if(a%i==0) {
				flag=true;
			}
			
			if(flag) {
				result = "Not Prime";}
			
				else {
				result = "Is Prime";
				}
			}
		return result;
		}
	
	
	
	public static void main(String[] args) {
		
		
		PukPuk puk = new PukPuk();
		String qq = puk.prime(3);
		System.out.println(qq);
			
		
				
				
			}
}
			
	


		
	

