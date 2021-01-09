package alpha;


import java.util.HashMap;

public class logix {
	
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(0, "Roop");
		hm.put(1, "Arti");
		hm.put(2, "Zoo");
		hm.put(3, "kareena");
		
		//System.out.println(hm.get(2));
		
		for(int s : hm.keySet()) {
			System.out.println(s);
		}
			
		
	

}
}