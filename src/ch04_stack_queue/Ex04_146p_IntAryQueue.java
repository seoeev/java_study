package ch04_stack_queue;

public class Ex04_146p_IntAryQueue {
    private int max; // 큐의 용량
    private int num; // 현재의 데이터 수
    private int[] que; // 큐의 본체

    // 실행할 때 예외：큐가 비어 있음
    public class EmptyIntAryQueueException extends RuntimeException {
        public EmptyIntAryQueueException() {
        }
    }

    // 실행할 때 예외：큐가 가득 참
    public class OverflowIntAryQueueException extends RuntimeException {
        public OverflowIntAryQueueException() {
        }
    }

    // 생성자
    public Ex04_146p_IntAryQueue(int capacity) {
        num = 0;
        max = capacity;
        try {
            que = new int[max];         // 큐 본체용 배열을 생성
        } catch (OutOfMemoryError e) {   // 생성 불가
            max = 0;
        }
    }

    // 큐에 데이터를 인큐(삽입)
    public int enque(int x) throws OverflowIntAryQueueException {
        if (num >= max)
            throw new OverflowIntAryQueueException(); // 큐가 가득 참
        que[num++] = x;
        return x;
    }

    // 큐에서 데이터를 디큐(꺼냄(삭제))
    public int deque() throws EmptyIntAryQueueException {
        if (num <= 0)
            throw new EmptyIntAryQueueException(); // 큐가 비어 있음
        int x = que[0];
        for (int i = 0; i < num - 1; i++)
            que[i] = que[i + 1];
        num--;
        return x;
    }

    // 큐에서 데이터를 확인(머리 데이터를 살펴봄)
    public int peek() throws EmptyIntAryQueueException {
        if (num <= 0)
            throw new EmptyIntAryQueueException(); // 큐가 비어 있음
        return que[num - 1];
    }

    // 큐에서 x를 검색하여 index를 반환
    public int indexOf(int x) {
        for (int i = 0; i < num; i++)
            if (que[i] == x) // 검색성공
                return i;
        return -1; // 검색실패
    }

    // 큐를 비움
    public void clear() {
        num = 0;
    }

    // 큐의 용량을 반환
    public int capacity() {
        return max;
    }

    // 큐에 쌓인 데이터 수를 반환
    public int size() {
        return num;
    }

    // 비어 있는가?
    public boolean isEmpty() {
        return num <= 0;
    }

    // 가득 찼는가?
    public boolean isFull() {
        return num >= max;
    }

    // 큐 안의 데이터를 시작 > 끝의 차례로 출력
    public void dump() {
        if (num <= 0)
            System.out.println("큐가 비었습니다.");
        else {
            for (int i = 0; i < num; i++)
                System.out.print(que[i] + " ");
            System.out.println();
        }
    }
}
