package ch01;

public class Ex07_30p {

	public static void main(String[] args) {
		int n = 7;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print(i);
			sum += i;
			if(i < 7) {
				System.out.print(" + ");
			}
		}
		System.out.print(" = " + sum);
	}

}
