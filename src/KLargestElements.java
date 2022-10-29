import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElements {
	public static void main(String ...sukanyaLovesSuman) {
		int[] arr = {2,5,6,7,5,3,1,3,5,7,8,5,3,22};
		int k =3;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int ele : arr) {
			if(pq.size()==k && pq.peek()<ele) {
					pq.poll();
			pq.add(ele);
			
			}
		}
	
		while(!pq.isEmpty()) {
			System.out.print(pq.poll()+" ");
		}
	}
}

