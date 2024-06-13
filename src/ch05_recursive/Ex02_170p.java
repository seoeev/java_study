package ch05_recursive;

import java.util.Scanner;

public class Ex02_170p {

    static int gcd(int x, int y){
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
//        if(y==0)
//            return x;
//        elses
//            return gcd(y, x % y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 정수의 최대 공약수를 구합니다.");

        System.out.print("정수 : ");
        int x = sc.nextInt();
        System.out.print("정수 : ");
        int y = sc.nextInt();

        System.out.println("최대공약수는 : " + gcd(x, y));

    }

}
