package ch01;

import java.util.Scanner;

public class Ex04_05_22p {

	public static void main(String[] args) {
		// �� �� ��� ���� 13 ������ ��� ���տ� ���� �߾Ӱ��� ���Ͽ� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ a b c�� �Է�");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("�� ���� �߾Ӱ��� : " + med3(a, b, c) + " �Դϴ�.");
        System.out.println("med3(3,2,1) = " + med3(3,2,1));
        System.out.println("med3(3,2,2) = " + med3(3,2,2));
        System.out.println("med3(3,1,2) = " + med3(3,1,2));
        System.out.println("med3(3,2,3) = " + med3(3,2,3));
        System.out.println("med3(2,1,3) = " + med3(2,1,3));
        System.out.println("med3(3,3,2) = " + med3(3,3,2));
        System.out.println("med3(3,3,3) = " + med3(3,3,3));
        System.out.println("med3(2,2,3) = " + med3(2,2,3));
        System.out.println("med3(2,3,1) = " + med3(2,3,1));
        System.out.println("med3(2,3,2) = " + med3(2,3,2));
        System.out.println("med3(1,3,2) = " + med3(1,3,2));
        System.out.println("med3(2,3,3) = " + med3(2,3,3));
        System.out.println("med3(1,2,3) = " + med3(1,2,3));    
        
        
        
        System.out.println("Q5_�������� 5�� 22p");
		System.out.println("�� ���� �߾Ӱ��� : " + med3_2(a, b, c) + " �Դϴ�.");

	}

	static int med3(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			} else if(a <= c) {
				return a;
			} else {
				return c;
			}
		} else if (a > c) {
			return a;
		} else if (a > c) {
			return c;
		} else {
			return b;
		}
		
	}

	static int med3_2(int a, int b, int c) {
		if((b >= a && c <= a) || (b <= a && c >= a)) {
			return a;
			
		} else if((a > b && c < b) || (a < b && c > b)) {
			return b;
		}
		
		return c;
		
		// ù��° if�����ִ� b>=a �� b<=a �� ���ĸ� ���� �ٸ��ٰ� ������ �� ������
		// ���ĸ� ������ ���̰� ���������δ� ���� �Ǵ��̹Ƿ� ȿ���� ��������.
		
		// ù��° if���� ������ �� �ι�° else if������ ù��° if���� ���������� 
		// ���� ������ �����ϹǷ� ȿ���� ��������.
	}

	
	
}
