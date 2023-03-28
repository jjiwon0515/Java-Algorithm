package BaekJoon_Recursion;

import java.util.Scanner;

public class _25304_ {
    public static void main(String[] args) {
        // 첫 째줄에는 적힌 총금액
        // 둘 째줄에는 물건의 종류의 수
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int sum = 0;
        for (int i = 0; i < B; i++) {
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            sum = sum + (x * y);
//            System.out.println(sum);
        }

        if (A == sum){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
