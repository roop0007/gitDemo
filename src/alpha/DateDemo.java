package alpha;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {


		Date d= new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf= new SimpleDateFormat("M/d/yyyy");
	
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sd= new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sd.format(d));
	}

}
