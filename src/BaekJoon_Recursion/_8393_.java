package BaekJoon_Recursion;

import java.util.Scanner;

public class _8393_ {
    public static void main(String[] args) {
        // 1부터 n까지 합을 출력한다
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        System.out.println((N*(N+1))/2);
    }
}
