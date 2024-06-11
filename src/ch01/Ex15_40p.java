package ch01;

public class Ex15_40p {

	public static void main(String[] args) {

		int n = 4;	// 삼각형 단

		System.out.println(n + "단 직각 삼각형 (LB)");
		triangleLB(n);

		System.out.println(n + "단 직각 삼각형 (LU)");
		triangleLU(n);

		System.out.println(n + "단 직각 삼각형 (RB)");
		triangleRB(n);

		System.out.println(n + "단 직각 삼각형 (RU)");
		triangleRU(n);


	}

	// 왼쪽 아래
	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 왼쪽 위
	static void triangleLU(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


	// 오른쪽 아래
	static void triangleRB(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


	// 오른쪽 위
	static void triangleRU(int n) {
		for (int i = n; i >= 1; i--) {

			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}


			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


}
