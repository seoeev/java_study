package ch03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04_117p {
//    static int binSearch(int[] a, int n, int key){
//        int pl = 0;
//        int pr = n-1;
//
//        do{
//            int pc = (pl + pr) /2;
//            if(a[pc] == key)
//                return pc;
//            else if(a[pc] < key)
//                pl = pc + 1;
//            else
//                pr = pc -1;
//        }while(pl <= pr);
//
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int num = 5;
//        int[] x = new int[num];
//
//        for (int i = 0; i < num; i++) {
//            x[i] = i+1;
//        }
//        System.out.println(Arrays.toString(x));
//
//        int ky = 2; // 검색 할 값
//
//        int idx = binSearch(x, num, ky);
//
//        if(idx == -1)
//            System.out.println("없음");
//        else
//            System.out.println(ky + "는 x["+ idx +"]에 있음.");
//    }
//
    static int binSearchSen(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        System.out.print("  |");
        for (int i = 0; i < n; i++)
            System.out.printf("%2d", i);
        System.out.println();
        System.out.print("--+");
        for (int i = 0; i < n; i++)
            System.out.print("--");
        System.out.println();

        do {
            int pc = (pl + pr) / 2;

            System.out.print("  |");
            for (int i = 0; i < n; i++)
                if (i == pc)
                    System.out.print(" +");
                else if (i == pl)
                    System.out.print("<-");
                else if (i == pr)
                    System.out.print("->");
                else
                    System.out.print("  ");
            System.out.println();

            System.out.printf("%2d|", pc);
            for (int j = 0; j < n; j++)
                System.out.printf("%2d", a[j]);
            System.out.println();

            if (a[pc] == key)
                return pc;
            else if (a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;

        } while (pl <= pr);
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num =  stdIn.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값: ");
        int ky = stdIn.nextInt();
        int idx = binSearchSen(x, num, ky);

        if (idx ==  -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky + "은(는) x["+ idx + "]에 있습니다.");

    }
}
