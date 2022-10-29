import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NonRepeating {

	public static void main(String[] args) {
		String s = "hello";
		char curr;
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			curr = s.charAt(i);
			map.put(curr,map.getOrDefault(curr, 0)+1);
			
		}
		boolean firstRepeating =false;
		for(int i=0;i<s.length();i++) {
			curr = s.charAt(i);
			if(map.get(curr)==1) {
				firstRepeating =true;
				System.out.println(curr);
				break;
			}
			
		}
		if(!firstRepeating) {
			System.out.println("No repeating character found");
		}

	}

}
