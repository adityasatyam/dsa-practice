import java.util.Arrays;

public class SamallestPositive {

	public static void main(String[] args) {
		int[] arr = { 3,4,-1,1};
		Arrays.sort(arr);
		int validNum = 1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=0)
				continue;
			else if(arr[i]>validNum) {
//				System.out.println(validNum);
				break;
			}
			else {
				validNum++;
			}
		}
		System.out.println(validNum);
	}

}

//Example 1:
//Input: nums = [1,2,0, 3]
//Output: 3
//
//Example 2:
//Input: nums = [3,4,-1,1]
//Output: 2
//
//Example 3:
//Input: nums = [7,8,9,11,12]
//Output: 1

