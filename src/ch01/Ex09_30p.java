package ch01;

public class Ex09_30p {

	public static void main(String[] args) {
		// a b ������ ��
		int a = 2, b = 10;
		System.out.println(a + " ���� " + b + " ������ �� : " + sumof(a, b));
		
	}
	
	static int sumof(int a, int b) {
		int result = 0;
		
		for (int i = a; i <= b; i++) {
			result += i;
		}
		
		return result;
	}

}
