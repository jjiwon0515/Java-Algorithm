package BaekJoon_Recursion;

import java.util.Scanner;

public class _2525_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());

//        if (A == 23)
//            if ( B + C >= 60){
//                System.out.print(0 + " " + (B+C)%60);
//            }
//            else {
//                System.out.print(23 + " " + (B+C));
//            }
//        else {
//            if ( B + C >= 60){
//                System.out.print((A+1) + " " + (B+C)%60);
//            }
//            else {
//                System.out.print(A + " " + (B+C));
//            }

//        }
        // 24로 나눈 나머지로 시간을 범위를 제한할 수 있다.
        if ((B+C) >= 60){
            System.out.println(((A+((B+C)/60))%24 + " " + (B+C)%60));
        }
        else {
            System.out.println(A + " " + (B+C));
        }

    }
}

