package BaekJoon_Recursion;

import java.util.Scanner;

public class _2739_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.next());
        for (int i = 1; i < 10; i++) {
            // 문자열에 변수값넣고 같이 출력
            System.out.println(String.format("%d * %d = %d",input,i,input*i));
        }
    }
}
