package ch05_recursive;

import java.util.Arrays;

public class Ex03_170p {

    static int gcd(int x, int y) {
        if(y==0)
            return x;
        else
            return gcd(y, x % y);
    }

    static int gcdArray(int[] a){
        int result = a[0];
        for (int i = 1; i < a.length; i++) {
            result = gcd(result, a[i]);
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {80, 60, 100, 50};

        System.out.println(Arrays.toString(arr));
        System.out.println("최대공약수 : " + gcdArray(arr));
    }
}
