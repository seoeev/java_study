package ch01;

public class Ex09_30p {

	public static void main(String[] args) {
		// a b 사이의 합
		int a = 2, b = 10;
		System.out.println(a + " 부터 " + b + " 까지의 합 : " + sumof(a, b));

	}

	static int sumof(int a, int b) {
		int result = 0;

		for (int i = a; i <= b; i++) {
			result += i;
		}

		return result;
	}

}
