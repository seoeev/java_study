package ch03;

import java.util.Arrays;
import java.util.Random;

public class Ex03_117p {

    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key)
                idx[count++] = i;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 5;
        int[] x = new int[num+1];// 보초법을 위한 저장공간 + 1
        int ky = 2;

        Random rand = new Random();
        for (int i = 0; i < num; i++) {
            x[i] = rand.nextInt(5);
        }

        System.out.println(Arrays.toString(x));
        int[] idx = new int[num];
        int count = searchIdx(x, num, ky, idx);
        System.out.println("찾아낸 인덱스의 개수 : " + count);

    }


}

