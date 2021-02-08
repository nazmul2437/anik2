package jenkinstest;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

public class TestDemo {
	
	@Test
	
	public void test1() {
		
		
		ArrayList<Object> ls=new ArrayList<Object>();
		
		
		ls.add("nazmul");
		ls.add("sheikh");
		ls.add(null);
		ls.add(10);
		ls.add(10);
		ls.add(20);
		
		Iterator<Object>xyz=ls.iterator();
		while(xyz.hasNext()) {
			
			System.out.println(xyz.next());
			
		}
		
		
	}

}
