package BaekJoon_Recursion;

import java.util.Scanner;

public class _10430_ {
    public static void main(String[] args) {
        // 5 8 4
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.next());
        int num2 = Integer.parseInt(sc.next());
        int num3 = Integer.parseInt(sc.next());

        System.out.println((num1 + num2) % num3);
        System.out.println(((num1 % num3) + (num2 % num3)) % num3);
        System.out.println((num1 * num2) % num3);
        System.out.println(((num1 % num3) * (num2 % num3)) % num3);
    }
}
