package ch01;

import java.util.Scanner;

public class Ex01_03_19p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 네 값의 최댓값을 구하는 max4 메서드를 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("엔터 단위로 a b c d를 입력");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		System.out.println("네 값의 최댓값은 : " + max4(a, b, c, d) + " 입니다.");
		System.out.println("세 값의 최솟값은 : " + min3(a, b, c) + " 입니다.");
		System.out.println("네 값의 최솟값은 : " + min4(a, b, c, d) + " 입니다.");

	}

	static int max4(int a, int b, int c, int d) {
		int max = a;

		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		if(d > max) {
			max = d;
		}
		return max;
	}

	static int min3(int a, int b, int c) {
		int min = a;

		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		return min;
	}

	static int min4(int a, int b, int c, int d) {
		int min = a;

		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		if(d < min) {
			min = d;
		}

		return min;
	}



}
