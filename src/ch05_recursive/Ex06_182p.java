package ch05_recursive;

public class Ex06_182p {
    static String[] name = { "A기둥", "B기둥", "C기둥" };

    static void move(int no, int x, int y){
        if(no > 1)
            move(no-1, x, 6-x-y);

        //System.out.println("원반["+no+"]을" + x + "기둥에서" + y +"기둥으로 옮김");
        System.out.println("원반[" + no + "]를 " + name[x - 1] + "에서 " + name[y - 1] + "으로 옮김");

        if(no > 1)
            move(no-1, 6 - x - y, y);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("하노이의 탑 원반개수 : " + n);

        move(n, 1, 3);
    }
}
