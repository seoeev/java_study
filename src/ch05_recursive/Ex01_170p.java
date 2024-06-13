package ch05_recursive;

import java.util.Scanner;

public class Ex01_170p {
    // 재귀 함수 없이 팩토리얼 풀기

    static int factorial(int n){
        int result = 1;

        for (int i = n; i > 0; i--) {
            result *= i;
        }
//        if(n > 0) {
//            return n * factorial(n - 1);
//        } else {
//            return 1;
//        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int x = sc.nextInt();

        System.out.println(x + "의 팩토리얼 : " + factorial(x));
    }


}
