package ch01;

public class Ex16_40p {
	
	public static void main(String[] args) {
		int n = 4;	// »ï°¢Çü ´Ü
		
		spira(n);	
		npira(n);
	}
	
	static void spira(int n) {
		
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");				
			}
			for (int j = 1; j <= (i-1) * 2 + 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	
	static void npira(int n) {
		
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");				
			}
			
			for (int j = 1; j <= (i-1) * 2 + 1 ; j++) {
				System.out.print(i % 10);
			}
			System.out.println();
			
		}		
	}

}
