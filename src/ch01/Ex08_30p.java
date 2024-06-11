package ch01;

public class Ex08_30p {

	public static void main(String[] args) {
		// 가우스 덧셈
		int n = 7;
		int sum = 0;

		if(n % 2 == 0) {
			sum = (1 + n) * (n/2);
		} else {
			sum = (1 + n) * (n / 2) + (n - (n / 2));
		}

		System.out.println(sum);
	}

}
