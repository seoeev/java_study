package ch03;

import java.util.Arrays;

public class Ex02_115p {
    // 보초법

    static int seqSearchSen(int[] a, int n, int key){
        int i = 0;
        a[n] = key;

        // 상단
        System.out.printf("%2s |", "");
        for (int j = 0; j < n; j++) {
            System.out.printf("%2d", j);
        }
        System.out.println("\n---+--------");

        while(true){
            // 과정 시각적으로 출력하기
            if(i < n){
                System.out.printf("%2s |", "");
                for (int j = 0; j <= i; j++) {
                    if(j == i)
                        System.out.printf("%2s", "*");
                    else
                        System.out.printf("%2s","");
                }
                System.out.println();

                System.out.printf("%2d |", i);
                for (int j = 0; j < n; j++) {
                    System.out.printf("%2d", a[j]);
                }
                System.out.println();
            }

            // 검사
            if(a[i] == key){
                break;
            }
            i++;
        }

        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        int num = 3;
        int[] x = new int[num+1];// 보초법을 위한 저장공간 + 1
        int ky = 1;

        for (int i = 0; i < num; i++) {
            x[i] = i;
        }

        System.out.println(Arrays.toString(x));
        int idx = seqSearchSen(x, num, ky);
        if(idx == -1)
            System.out.println("값 없음");
        else
            System.out.println(ky + "는 x["+ idx +"] 에 있습니다.");
    }

}
