package ch02;

import java.util.Arrays;

public class Ex02_03_61p {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void reverse(int[] a) {
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println("a["+ i +"]과(와) a["+ (a.length -i -1) +"]를 교환합니다.");

			swap(a, i, a.length - i -1);
			System.out.println(Arrays.toString(a));
		}
	}

	static int sumOf(int[] a) {
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] arr = {5, 10, 73, 2, -5, 42};

		reverse(arr);

		System.out.println("배열의 합 : " + sumOf(arr));
	}

}
