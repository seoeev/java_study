package ch02;

import java.util.Arrays;

public class Ex04_05_64p {

	// �迭 b > �迭 a�� ����
	static void copy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
		
		System.out.println("�� ���� : " + Arrays.toString(a));
	}
	
	// �迭 b > �迭 a�� ���� ����
	static void rcopy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[i] = b[b.length-i-1];
		}
		System.out.println("�� ���� : " + Arrays.toString(a));		
	}
	
	public static void main(String[] args) {
	
		int[] b = {3, 4, 1, 6, 7};
		int[] a1 = new int[b.length]; // �� ����
		int[] a2 = new int[b.length]; // �� ����
		
		System.out.println("�迭 b : " + Arrays.toString(b));
		
		copy(a1, b);
		rcopy(a2, b);		
	}

}
