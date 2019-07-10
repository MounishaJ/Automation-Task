package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OwnSortingOrder {

	public static void main(String[] args) {
		// 7-10-2019

		List<Integer> values = new ArrayList<>();
		values.add(4553);
		values.add(2411);
		values.add(2330);
		values.add(7812);
		values.add(5665);
		values.add(7889);
		values.add(5154);

		/*
		 * Comparator<Integer>c=new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) { // TODO Auto-generated
		 * method stub
		 * 
		 * if(o1%10 > o2%10) return 1; else return -1;
		 * 
		 * 
		 * return o1%10>o2%10?1:-1;
		 * 
		 * }
		 * 
		 * };
		 */
									//	Lamda expression
		Collections.sort(values, (i,j)->i%10>j%10?1:-1);
		for (Integer o : values) {
			System.out.println(o);
		}

	}

}
