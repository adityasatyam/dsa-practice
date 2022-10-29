import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = {0, -1, 2, -3, 1};
		int sum = -2;
		Set<Integer> vistedNums = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(vistedNums.contains(sum-arr[i])) {
				System.out.println("Pair: "+(sum-arr[i])+","+arr[i]);
				return;
			}
			else {
				vistedNums.add(arr[i]);
			}
		}
		System.out.println("No such pairs found");

	}

}

//Write a program that, given an array A[] of n numbers and another number x, determines whether or not there exist two elements in A[] whose sum is exactly x. 
//
//Input: arr[] = {0, -1, 2, -3, 1}
//        x= -2 -> -2-0
//Output: Pair with a given sum -2 is (-3, 1)
//              Valid pair exists
//Explanation:  If we calculate the sum of the output,1 + (-3) = -2
//
//Input: arr[] = {1, -2, 1, 0, 5}
//       x = 0
//Output: No valid pair exists for 0
