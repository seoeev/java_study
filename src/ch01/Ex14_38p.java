package ch01;

import java.util.Scanner;

public class Ex14_38p {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("단 : ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	

}
