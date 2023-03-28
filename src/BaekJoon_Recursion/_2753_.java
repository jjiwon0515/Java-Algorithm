package BaekJoon_Recursion;

import java.util.Scanner;

public class _2753_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Year = Integer.parseInt(sc.next());

        if ( Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0){
            System.out.println(1);
        }
        else
            System.out.println(0);
    }
}
