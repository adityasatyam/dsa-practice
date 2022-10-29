
public class ReversString {

	public static void main(String[] args) {
		String str = "abcdefg";
		String[] arr = str.split("");
		reverseNew(arr,0);
		String res = "";
		for(String temp : arr) {
			res+= temp;
		}
		System.out.print(res);
		
//		System.out.println(arr[0]);

	}
	public static void reverseNew(String[] arr,int index) {
		if(index > (arr.length/2)-1)
			return;
		int swapIndex = arr.length - index-1;
		if(swapIndex>index ) {
			String temp = arr[index];
			arr[index] = arr[swapIndex];
			arr[swapIndex] = temp;
		}
		reverseNew(arr, index+1);
	}

}
