
public class Code1 {

	public static void main(String[] args) {
		int arr[] = {0,1,0,1,1,1,0,0,1,1,0};
		int zeros = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				zeros++;
		}
		for(int i=0;i<arr.length;i++) {
			if(zeros>0) {
				arr[i]=0;
				zeros--;
			}
			else {
				arr[i]=1;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		

	}

}

//{0,1,0,1,1,1,0,0,1,1,0}
