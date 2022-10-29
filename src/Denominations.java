import java.util.HashMap;
import java.util.Map;

public class Denominations {
	public static void main(String[] args) {
		int[] denoms = {2000, 500, 200, 100, 50, 20, 10, 5};
		Map<Integer,Integer> denomCount = new HashMap<>();
		int index = 0;
		int sum = 2456;
		int count =0;
		while(sum>= denoms[denoms.length-1]) {
			if(sum<denoms[index])
				index++;
			else {
				denomCount.put(denoms[index], denomCount.getOrDefault(denoms[index], 0)+1);
				sum-=denoms[index];
				count++;
			}
		}
		if(sum>0) {
			System.out.println("Invalid Ammount");
		}
		else {
			System.out.println(count);
			System.out.println(denomCount);
		}
	}
}




