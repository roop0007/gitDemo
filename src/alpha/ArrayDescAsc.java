package alpha;

public class ArrayDescAsc {
	
	//Sort the Array in Ascending and Descending Order
	//Bubble sort 

	public static void main(String[] args) {


		int[] a = {2,6,1,4,9};
		int temp=0;
		for(int i=0; i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					
					//swap
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		//Print the sorted array
		
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		
		

	}

}
