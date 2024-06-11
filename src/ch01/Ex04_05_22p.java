package ch01;

import java.util.Scanner;

public class Ex04_05_22p {

	public static void main(String[] args) {
		// 세 값 대소 관계 13 종류의 모든 조합에 대해 중앙값을 구하여 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("엔터 단위로 a b c를 입력");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println("세 값의 중앙값은 : " + med3(a, b, c) + " 입니다.");
		System.out.println("med3(3,2,1) = " + med3(3,2,1));
		System.out.println("med3(3,2,2) = " + med3(3,2,2));
		System.out.println("med3(3,1,2) = " + med3(3,1,2));
		System.out.println("med3(3,2,3) = " + med3(3,2,3));
		System.out.println("med3(2,1,3) = " + med3(2,1,3));
		System.out.println("med3(3,3,2) = " + med3(3,3,2));
		System.out.println("med3(3,3,3) = " + med3(3,3,3));
		System.out.println("med3(2,2,3) = " + med3(2,2,3));
		System.out.println("med3(2,3,1) = " + med3(2,3,1));
		System.out.println("med3(2,3,2) = " + med3(2,3,2));
		System.out.println("med3(1,3,2) = " + med3(1,3,2));
		System.out.println("med3(2,3,3) = " + med3(2,3,3));
		System.out.println("med3(1,2,3) = " + med3(1,2,3));



		System.out.println("Q5_연습문제 5번 22p");
		System.out.println("세 값의 중앙값은 : " + med3_2(a, b, c) + " 입니다.");

	}

	static int med3(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			} else if(a <= c) {
				return a;
			} else {
				return c;
			}
		} else if (a > c) {
			return a;
		} else if (a > c) {
			return c;
		} else {
			return b;
		}

	}

	static int med3_2(int a, int b, int c) {
		if((b >= a && c <= a) || (b <= a && c >= a)) {
			return a;

		} else if((a > b && c < b) || (a < b && c > b)) {
			return b;
		}

		return c;

		// 첫번째 if문에있는 b>=a 와 b<=a 는 수식만 보면 다르다고 생각할 수 있지만
		// 수식만 뒤집은 차이고 실질적으로는 같은 판단이므로 효율이 나빠진다.

		// 첫번째 if문이 성립한 후 두번째 else if문에서 첫번째 if문과 실질적으로
		// 같은 수식을 수행하므로 효율이 나빠진다.
	}



}
