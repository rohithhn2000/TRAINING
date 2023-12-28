package pgrograms20nov;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class pgm4 {
	public static void main(String[] args) {
		HashMap<String,Integer > h=new HashMap();
		h.put("Rohith",1);
		h.put("maps", 2);
		Iterator i=h.entrySet().iterator();
		while(i.hasNext()) {
			Map.Entry<String, Integer>entry=(Entry<String, Integer>) i.next();
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
			
		}
		
	}
	


