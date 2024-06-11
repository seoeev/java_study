package ch02;

import java.util.Scanner;

public class Ex06_70p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;     // 변환하는 기수
        int cd;     // 기수
        int dno;    // 변환 후의 자릿수
        int retry;  // 변환 후 각 자리의 숫자를 넣어두는 문자의 배열
        char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자의 배열

        System.out.println("10 진수를 기수 변환 합니다.");

        do {
            do {
                System.out.println("변환하는 음이 아닌 정수 : ");
                no = sc.nextInt();
            } while (no < 0);

            do {
                System.out.println("어떤 진수로 변환 할까? (2~36) : ");
                cd = sc.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConvR(no, cd, cno);
            System.out.println(cd + "진로수는");

            for (int i = dno -1; i >= 0; i--) {
                System.out.print(cno[i]);
            }
            System.out.println(" 입니다.");

            System.out.println("한 번 더 할까요? (1 : 예 / 0 : 아니오) : ");
            retry = sc.nextInt();
        }while (retry == 1);
    }

    static int cardConvR(int x, int r, char[] d){
        int digits = 0;

        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);

        for (int i = 0; i < digits / 2; i++) {
            char temp = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = temp;
        }

        return digits;
    }
}
