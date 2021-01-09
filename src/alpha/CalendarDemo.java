package alpha;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {
	
	public static int multiply(int a, int b) {
		
		int sum= 0;
		
		while(b>0) {
			sum = sum + 5;
			b--;
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(multiply(5,5));	
	}

}
