package ch01;

import java.util.Scanner;

public class Ex11_33p {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, result;
		
		System.out.print("���� ������ �Է� : ");
		a = sc.nextInt();

		// �ڸ��� ���ϱ�
		String str = String.valueOf(a);
		result = str.toCharArray().length;
		
		System.out.println("�� ���� " + result + "�ڸ� �Դϴ�." );
		
	}
	

}
