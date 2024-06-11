package ch02;

import java.util.Scanner;

public class Ex08_09_83p {
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    // 서기 year년은 윤년인가?
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    // 서기 y년 m월 d일의 그 해 경과 일 수를 구함.
    static int dayOfYear(int y, int m, int d) {
        int days = d;
        for (int i = 1; i < m; i++)
            days += mdays[isLeap(y)][i-1];
        return days;
    }

    // i랑 days 없이
    static int dayOfYear2(int y, int m, int d) {
        while(--m != 0){
            d += mdays[isLeap(y)][m-1];
        }
        return d;
    }

    static int leftDayOfYear(int y, int m, int d){
//        int days = 0;
//        for (int i = m-1; i < 12; i++) {
//            days += mdays[isLeap(y)][i];
//        }
//        days -= d;
//
//        return days;

        while (--m != 0)
            d += mdays[isLeap(y)][m - 1];
        return 365 + isLeap(y) - d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int retry;

        System.out.println("그 해의 경과 일수를 구합니다.");

        do {
            System.out.print("년? ");
            int year = sc.nextInt();
            System.out.print("월? ");
            int month = sc.nextInt();
            System.out.print("일? ");
            int day = sc.nextInt();

            System.out.printf("%s일이 경과되었습니다.\n", dayOfYear(year, month, day));
            System.out.printf("%s일이 남았습니다.\n", leftDayOfYear(year, month, day));


            System.out.println("\n다시 하시겠습니까? (예: 1 | 아니오: 0");
            retry = sc.nextInt();
        } while (retry == 1);
    }
}
