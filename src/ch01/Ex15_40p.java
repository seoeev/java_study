package ch01;

public class Ex15_40p {

	public static void main(String[] args) {
		
		int n = 4;	// �ﰢ�� ��
		
		System.out.println(n + "�� ���� �ﰢ�� (LB)");
		triangleLB(n);
		
		System.out.println(n + "�� ���� �ﰢ�� (LU)");		
		triangleLU(n);

		System.out.println(n + "�� ���� �ﰢ�� (RB)");		
		triangleRB(n);

		System.out.println(n + "�� ���� �ﰢ�� (RU)");		
		triangleRU(n);

		
	}
	
	// ���� �Ʒ�
	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	
	// ���� ��
	static void triangleLU(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}

	
	// ������ �Ʒ�
	static void triangleRB(int n) {
		
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");				
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	
	
	// ������ ��
	static void triangleRU(int n) {
		for (int i = n; i >= 1; i--) {
			
			for (int j = i; j < n; j++) {
				System.out.print(" ");				
			}
			
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	

}
