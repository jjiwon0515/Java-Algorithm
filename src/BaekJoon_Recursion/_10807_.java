package BaekJoon_Recursion;

import java.io.*;
import java.util.Scanner;

public class _10807_ {
    public static void main(String[] args) throws IOException {
//        첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다
        Scanner sc = new Scanner(System.in);
        // 배열
        // int[] arr = {};
        // int[] arr = new int[i]
        //
        int count = 0;
        int A = sc.nextInt();
        int[] B = new int[A];

        for (int i = 0; i < A; i++) {
            B[i] = sc.nextInt();
        }

        int C = sc.nextInt();

        for (int i = 0; i < A; i++) {
            if (B[i] == C){
                count ++;
            }
        }
        System.out.println(count);
    }
}
