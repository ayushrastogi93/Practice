import java.util.HashMap;
import java.util.Map.Entry;
/*How to check -> duplicate chars ina string.*/
public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample = "hi this is java";
		
		System.out.println(sample.replaceAll("a",""));
	callHashMap(sample);
	//	call_loop(sample);
}

	private static void call_loop(String sample) {
		String str  = "hi i am java";
		for(int i=0;i<str.length();i++) {
			int count =0;
			if (str.charAt(0) == str.charAt(i))
				count++;
			if(count > 0 ) {
				System.out.println(str.charAt(0)+ ".." + count);
				
			}
				
			str = str.replace(str.charAt(0)+"", "");
		}
		
	}

	private static void callHashMap(String s) {
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < s.length(); i++) {
			  char c = s.charAt(i);
			  if (map.containsKey(c)) {
			    int cnt = map.get(c);
			    map.put(c, ++cnt);
			  } else {
			    map.put(c, 1);
			  }
			}
		
// Print HashMap 
		for (Entry<Character, Integer> y :map.entrySet() ) {
			System.out.println(y.getKey() + " "+y.getValue());
		}
	}

		
	}
