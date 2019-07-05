package basicjava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calenderformat {

	public static void main(String[] args) {
		// 7-5-2019
		
		Calendar c=Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/YYYY hh:mm:ss");
		System.out.println(sdf.format(c.getTime()));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.AM_PM));
	}

}
