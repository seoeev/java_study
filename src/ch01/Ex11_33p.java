package ch01;

import java.util.Scanner;

public class Ex11_33p {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, result;

		System.out.print("양의 정수를 입력 : ");
		a = sc.nextInt();

		// 자릿수 구하기
		String str = String.valueOf(a);
		result = str.toCharArray().length;

		System.out.println("그 수는 " + result + "자리 입니다." );

	}


}
