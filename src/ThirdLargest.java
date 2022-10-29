import java.util.PriorityQueue;

public class ThirdLargest {

	public static void main(String[] args) {
		int a[]={1,2,5,6,3,4};
		//3rd largest
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0;i<a.length;i++) {
			// pq of max size 3 ;
			if(pq.size()<3)
				pq.add(a[i]);
			else {
				if(pq.peek()<a[i])
					pq.remove();
				pq.add(a[i]);
			}
		}
		System.out.print(pq.peek());
		
		
		
		pq -> ,5,6,4    peek -> 4
		

	}

}	
