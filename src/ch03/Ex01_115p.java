package ch03;

import java.util.Arrays;

public class Ex01_115p {
    // 보초법

    static int seqSearchSen(int[] a, int n, int key){
        int i = 0;
        a[n] = key;

//        while(true){
//            if(a[i] == key){
//                break;
//            }
//            i++;
//        }

        for (i = 0; i < a.length; i++) {
            if(a[i] == key){
                break;
            }
        }

        return i == n ? -1 : i;

    }

    public static void main(String[] args) {
        int num = 5;
        int[] x = new int[num+1];// 보초법을 위한 저장공간 + 1
        int ky = 8;

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
