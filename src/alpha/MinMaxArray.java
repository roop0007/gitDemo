package alpha;

public class MinMaxArray {

	public static void main(String[] args) {


		int[][] abc = {{2,4,5},{3,4,7},{1,2,9}};
		
		int min = abc[0][0];
		for(int i=0; i<abc.length;i++) {
			for(int j=0; j<abc[i].length;j++) {
				
				if(abc[i][j]>min) {  //for greater no. in multidimensional array
					min= abc[i][j];
				}
				
			}
		}
		System.out.println(min);

	}

}
