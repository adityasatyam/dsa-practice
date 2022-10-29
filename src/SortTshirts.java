
public class SortTshirts {

	public static void main(String[] args) {
		
//		Given S = "MSSLS", the function should return "SSSML".
//				Given S = "LLMS", your function should return "SMLL"
//				Given S = "SMS", your function should return "SSM".
		String s ="SMS";
		String T = solution(s);
		System.out.println(T);

	}
	static String solution(String s) {
		String res = "";
		int sCount=0,mCount=0,lCount=0;
		char current;
		for(int i=0;i<s.length();i++) {
			current = s.charAt(i);
			if(current=='S')
				sCount++;
			else if(current== 'M')
				mCount++;
			else
				lCount++;
		}
		for(int i=0;i<sCount;i++)
			res+='S';
		for(int i=0;i<mCount;i++)
			res+='M';
		for(int i=0;i<lCount;i++)
			res+='L';
		
		return res;
	}

}
