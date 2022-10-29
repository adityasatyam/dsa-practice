
public class DiamondPattern {

	public static void main(String[] args) {
		int n =9 ;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=i+1;j>0;j--) {
				System.out.print(j);
			}
			for(int j=2;j<i+2;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(" ");
			}
			for(int j= n-i-1;j>0;j--) {
				System.out.print(j);
			}
			for(int j=2;j<=n-i-1;j++)
				System.out.print(j);
			
			System.out.println();
		}

	}

}
