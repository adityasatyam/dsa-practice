
import java.util.*;
public class Q1 {

	public static void main(String[] args) {		
		String s = "abcd";
		String t = "dcba";
		int ops = minops(s,t);
		System.out.println(ops);
	}
	public static int minops(String s,String t) {
		int ops = 0 ;
		
		
		Queue<String[]> q = new LinkedList<>();
		String[] pair = {s,t};
		q.add(pair);
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0;i<size;i++) {
				String[] front = q.remove();
//				System.out.println(front[0]="-->"+front[1]+"-->"+ops);
				if(front[0].equals(front[1])) {
					return ops;
				}
				else if(front[0].length()==0) {
					ops+=front[1].length();
					return ops;
				}
				else if(front[1].length()==0) {
					ops+=front[0].length();
					return ops;
				}
				else {
					String[] p1 = {front[0].substring(1),front[1]};
					String[] p2 = {front[0],front[1].substring(1)};
					String[] p3 = {front[0],new StringBuilder(front[1]).reverse().toString()};
					String[] p4 = {new StringBuilder(front[0]).reverse().toString(),front[1]};
					q.add(p1);
					q.add(p2);
					if(front[1].length()>1)
						q.add(p3);
					if(front[0].length()>1)
						q.add(p4);
				}
			}
			ops++;	
			
		}
		return ops;
	}

}
