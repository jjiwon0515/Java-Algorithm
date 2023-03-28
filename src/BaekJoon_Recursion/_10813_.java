package BaekJoon_Recursion;

import java.util.Scanner;

public class _10813_ {
    public static void main(String[] args) {
        // 바구니에 공 하나씩 넣기
        Scanner sc = new Scanner(System.in);

        int t = 0;
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        // 각 바구니의 숫자와 같은 공들이 들어가있다.
        int[] Bucket = new int[N];
        for (int i = 0; i < N; i++) {
            Bucket[i] = i+1;
        }

        // 공을 바꾸는 과정
        for (int i = 0; i < M; i++) {
            int x = Integer.parseInt(sc.next()); // 5
            int y = Integer.parseInt(sc.next()); // 4
            t = Bucket[x-1];
            Bucket[x-1] = Bucket[y-1];
            Bucket[y-1] = t ;
        }

        for (int i = 0; i < N; i++) {// N=5
            System.out.print(Bucket[i] + " ");
        }
    }
}
