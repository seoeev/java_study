package ch02;

import java.util.Random;
import java.util.Scanner;

public class Ex01_56p {

	static int maxOf(int[] a) {
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max)
				max = a[i];
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int num = rand.nextInt(11);
		if (num == 0)
			num++;

		System.out.println("사람 수 : " + num);
		
		int[] height = new int[num];
		System.out.println("키 값은 아래와 같습니다.");

		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height["+ i +"] : " + height[i]);
		}
		
		System.out.println("최댓값은 : " + maxOf(height));
		
	}

}
