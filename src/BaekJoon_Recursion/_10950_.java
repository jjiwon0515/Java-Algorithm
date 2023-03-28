package BaekJoon_Recursion;

import java.util.Scanner;

public class _10950_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            System.out.println(a+b);
        }
    }
}
