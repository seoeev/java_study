package ch01;

import java.util.Scanner;

public class Ex01_03_19p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� ���� �ִ��� ���ϴ� max4 �޼��带 �ۼ��ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ a b c d�� �Է�");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		System.out.println("�� ���� �ִ��� : " + max4(a, b, c, d) + " �Դϴ�.");
		System.out.println("�� ���� �ּڰ��� : " + min3(a, b, c) + " �Դϴ�.");
		System.out.println("�� ���� �ּڰ��� : " + min4(a, b, c, d) + " �Դϴ�.");
		
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
