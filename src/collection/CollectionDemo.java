package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionDemo  extends OwnSortingOrder{

	public static void main(String[] args) {
		// 7-10-2019
		
		Collection<Integer> values=new ArrayList<>();
		values.add(89);
		values.add(59);
		values.add(78);
		System.out.println(values);
		
		Iterator i=values.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		

	}

}
