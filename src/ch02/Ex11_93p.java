package ch02;

public class Ex11_93p {
    public static void main(String[] args) {
        YMD ymd = new YMD(2020, 1, 1);
        System.out.println(ymd.after(365));
        System.out.println(ymd.before(365));
    }
}

class YMD {
    @Override
    public String toString() {
        return String.format("%d-%d-%d", y, m, d);
    }

    static int[][] mdays= {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    int y;
    int m;
    int d;

    // 생성자
    public YMD(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    // n일 앞의 날짜를 반환
    public YMD before(int n) {
        if (n < 0)
            return after(-n);

        YMD temp = new YMD(y, m, d);
        temp.d -= n;
        while (temp.d < 1) {
            temp.d += mdays[isLeap(temp.y)][temp.m -1];
            if (--temp.m == 0) {
                temp.y--;
                temp.m = 12;
            }
        }
        return temp;
    }

    // n일 뒤의 날짜를 반환
    public YMD after(int n) {

        if (n < 0)
            return before(-n);

        YMD temp = new YMD(y, m, d);
        temp.d += n;
        while (temp.d > mdays[isLeap(y)][temp.m - 1]) {
            temp.d -= mdays[isLeap(y)][temp.m-1];
            if (++temp.m == 13) {
                temp.y++;
                temp.m = 1;
            }
        }
        return temp;
    }
    public int isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0 ? 1 : 0;
    }
}
