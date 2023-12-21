package pattern;

public class Pyramid {

	public static void main(String[] args) {
		int row =10;
		for(int i=0;i<=row;i++) {
			for(int j = row;j>i;j--) {
				System.out.print(" ");
			}
			for(int k =1;k<=(2*i-1);k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
