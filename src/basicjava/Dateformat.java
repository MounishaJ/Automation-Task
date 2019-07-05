package basicjava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformat {

	public static void main(String[] args) {
		// 7-5-2019
		
		
		Date d=new Date();
		System.out.println(d);
																		
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/YYYY hh:mm:ss a z k D W w E h H");
		System.out.println(sdf.format(d));                            
/* a->AM/PM
 * z->timezone
 * k->hourin day
 * D->day in year
 * W->week in month
 * w->week in year
 * E->day in week
 * h->hour in AM/PM
 * H-> hourin day
 */
		
	}

}
