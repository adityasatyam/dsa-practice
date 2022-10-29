
import java.util.*;
public class Inversions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println(minInv(arr,n,k));
	}
	
	static int minInv(int[] arr,int n,int k) {
		int invcount = getInvCount(n,arr);
		if(invcount==0)
			return 0;
		for(int i=0;i<n-k;i++) {
			int start = i;
			int end = i+k-1;
			while(start<=end) {
				int temp = arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
			int c = getInvCount(n,arr);
			if(c<invcount)
				invcount=c;
			start = i;
			end = i+k-1;
			while(start<=end) {
				int temp = arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}
		
		return invcount;
	}
	static int getInvCount(int n,int arr[])
    {
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    inv_count++;
  
        return inv_count;
    }
	

}
