package alpha;

public class multiDirArray {

	public static void main(String[] args) {


		int[][] a = {{1,3,4}, {2,8,9}, {2, 5,0}};
		
		for(int i= 0; i<a.length; i++) {
			for(int j= 0; j<a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
	
