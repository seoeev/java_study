package ch04_stack_queue;

import java.util.Scanner;

public class Ex02_144p {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Gstack<String> s = new Gstack<String>(5); // 최대 n개를 푸시할 수 있는 스택

        while (true) {
            System.out.println("현재의 데이터 수：" + s.size() + " / " + s.capacity());
            System.out.print("(1)푸시 (2)팝 (3)피크 " + "(4)덤프 (5)검색 (6)비움  " + "(7)정보표시 (0)종료：");

            int menu = stdIn.nextInt();
            stdIn.nextLine();
            if (menu == 0)
                break;

            String x;
            switch (menu) {
                case 1: // 푸시
                    System.out.print("데이터：");
                    x = stdIn.nextLine();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2: // 팝
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비었습니다.");
                    }
                    break;

                case 3: // 피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비었습니다.");
                    }
                    break;

                case 4: // 덤프
                    s.dump();
                    break;

                case 5: // 검색
                    System.out.print("찾는 데이터：");
                    x = stdIn.nextLine();
                    int n = s.indexOf(x);
                    if (n >= 0)
                        System.out.println("정상으로부터 " + (s.size() - n) + "번 째에 있습니다.");
                    else
                        System.out.println("그 데이터가 없습니다.");
                    break;

                case 6: // 비움
                    s.clear();
                    break;

                case 7: // 정보표시
                    System.out.println("용량：" + s.capacity());
                    System.out.println("데이터 수：" + s.size());
                    System.out.println("비어 " + (s.isEmpty() ? "있습니다." : "있지 않습니다."));
                    System.out.println("가득 " + (s.isFull() ? "찼습니다." : "차지 않았습니다."));
                    break;
            }
        }
    }

}


class Gstack<E> {
    private int max;			// 스택 용량
    private int ptr;			// 스택 포인터
    private E[] stk;			// 스택 본체

    // 실행할 때 예외：스택이 비어 있음
    public static class EmptyGstackException extends RuntimeException {
        public EmptyGstackException() {
        }
    }

    // 실행할 때 예외：스택이 가득 참
    public static class OverflowGstackException extends RuntimeException {
        public OverflowGstackException() {
        }
    }
    // 생성자
    public Gstack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = (E[]) new Object[max];    // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) {		// 생성할 수 없음
            max = 0;
        }
    }

    // 스택에 x를 푸시
    public E push(E x) throws OverflowGstackException {
        if (ptr >= max)									// 스택이 가득 참
            throw new OverflowGstackException();
        return stk[ptr++] = x;
    }

    // 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
    public E pop() throws EmptyGstackException {
        if (ptr <= 0)									// 스택이 비어 있음
            throw new EmptyGstackException();
        return stk[--ptr];
    }

    // 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
    public E peek() throws EmptyGstackException {
        if (ptr <= 0)									// 스택이 비어 있음
            throw new EmptyGstackException();
        return stk[ptr - 1];
    }

    // 스택에서 x를 찾아 인덱스(없으면 –1)를 반환
    public int indexOf(E x) {
        for (int i = ptr - 1; i >= 0; i--)				// 정상 쪽에서 선형 검색
            if (stk[i] == x)
                return i;								// 검색 성공
        return -1;										// 검색 실패
    }

    // 스택을 비움
    public void clear() {
        ptr = 0;
    }

    // 스택의 용량을 반환
    public int capacity() {
        return max;
    }

    // 스택에 쌓여 있는 데이터 수를 반환
    public int size() {
        return ptr;
    }

    // 스택이 비어 있는가?
    public boolean isEmpty() {
        return ptr <= 0;
    }

    // 스택이 가득 찼는가?
    public boolean isFull() {
        return ptr >= max;
    }

    // 스택 안의 모든 데이터를 바닥 > 꼭대기 순서로 출력
    public void dump() {
        if (ptr <= 0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for (int i = 0; i < ptr; i++)
                System.out.print(stk[i] + " ");
            System.out.println();
        }
    }
}