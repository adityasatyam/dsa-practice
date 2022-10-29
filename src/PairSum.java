import java.util.HashSet;
import java.util.Set;

public class PairSum {

	public static void main(String[] args) {
		int sum = 9;
		int[] arr = {2,5,7,6,3};
		Set<Integer> set = new HashSet<>();
		for(int data:arr) {
			if(set.contains(sum-data)) {
				System.out.println((sum-data)+"-"+data);
				break;
			}
			set.add(data);
		}
 
	}

}
