package BaekJoon_Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

// NullPointer : 변수나 배열 등이 null 값을 갖고 있는 상태에서 해당 변수나 배열에 접근하려할 때 발생
// 예방법 : 변수나 배열을 사용하기전에 null값인지 아닌지 먼저 확인한다.

public class _10810_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);


//
        int N = sc.nextInt();
        int M = sc.nextInt();
//        System.out.println(N);
//        System.out.println(M);

        int[] Bucket = new int[N];
        for (int i = 0; i < N; i++) {
            Bucket[i] = 0;
        }

        for (int i = 0; i < M; i++) {
            // 1 2 3, 3 4 4.....


            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            int z = Integer.parseInt(sc.next());

//            System.out.println(x);
//            System.out.println(y);
//            System.out.println(z);

            for (int j = x-1; j < y; j++) {
                Bucket[j] = z;
            }
        }

        for (int i = 0; i < N; i++) {

            System.out.print(Bucket[i]+ " ");
        }


    }
}
