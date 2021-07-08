package Demo;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateValues {
	public static void main(String[] args) {
		//Remove Duplicate Characters from string
		String name="Vinay Sigedar";
		char[] chararray=name.toCharArray();
		LinkedHashSet<Character> uniqueItems = new LinkedHashSet<Character>();
		for(Character c:chararray) {
			uniqueItems.add(c);
		}
		for(Character c:uniqueItems) {
			System.out.println(c);
		}
		//Print occurrence of character count
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		for(Character key:chararray) {
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}else {
				map.put(key, 1);
			}
		}
		Set<Character> keys = map.keySet();

		for (Character key2 : keys) {
			System.out.print(key2 + ":");
			System.out.print(map.get(key2) + ",");
		}
	}
}
