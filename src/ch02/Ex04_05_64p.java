package ch02;

import java.util.Arrays;

public class Ex04_05_64p {

	// 배열 b > 배열 a로 복사
	static void copy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}

		System.out.println("정 복사 : " + Arrays.toString(a));
	}

	// 배열 b > 배열 a로 역순 복사
	static void rcopy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[i] = b[b.length-i-1];
		}
		System.out.println("역 복사 : " + Arrays.toString(a));
	}

	public static void main(String[] args) {

		int[] b = {3, 4, 1, 6, 7};
		int[] a1 = new int[b.length]; // 정 복사
		int[] a2 = new int[b.length]; // 역 복사

		System.out.println("배열 b : " + Arrays.toString(b));

		copy(a1, b);
		rcopy(a2, b);
	}

}
