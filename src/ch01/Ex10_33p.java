package ch01;

import java.util.Scanner;

public class Ex10_33p {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("a�� �� : ");
		a = sc.nextInt();
		
		do {
			System.out.print("b�� �� : ");
			b = sc.nextInt();
			
			if(b <= a) {
				System.out.println("a���� ū ���� �Է��ϼ���!");
			}
		} while (b <= a);
		
		System.out.println("b - a�� : " + (b-a));
		
	}
	

}
