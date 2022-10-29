import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ProgQues1 {

	public static void main(String[] args) {
		int arr[] = {3,1,1,1,2,2,1,2,3};
		int maxDistance = 0,val,dis;
		int maxDistanceSecond = 0 ;
		PriorityQueue<Integer> pq  = new PriorityQueue<>((a,b)->b-a);
		Map<Integer,Integer> pos = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			val = arr[i];
			if(pos.containsKey(val)) {
				dis = i-pos.get(val);
				pq.add(dis);
				
			}
			else {
				pos.put(val, i);
			}
		}
		if(!pq.isEmpty())
			System.out.println(pq.remove());
		if(!pq.isEmpty())
			System.out.println(pq.remove());
		

	}

}
