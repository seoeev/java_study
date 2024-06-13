package ch05_recursive;

public class Ex04_174p {
    static void recur(int n){
        System.out.println(n + "-");
        if(n > 0){
            recur(n-1);
            System.out.println(n);
            recur(n-2);
        }
    }

    static void recur2(int n){
        if(n > 0){
            recur2(n-2);
            System.out.println(n);
            recur2(n-1);
        }
    }



    public static void main(String[] args) {
        int x = 4;
        recur(x);
        System.out.println("---");
        recur2(x);
    }
}
