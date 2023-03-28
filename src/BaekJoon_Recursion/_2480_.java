package BaekJoon_Recursion;

import java.util.Scanner;

public class _2480_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());

        if (A==B && B==C){
            System.out.println(10000 + 1000*A);
        }

        if ((A==C)&&(C!=B)) {
            System.out.println(1000 + 100*A);
        }
        if ((A==B)&&(B!=C)) {
            System.out.println(1000 + 100*A);
        }
        if ((B==C)&&(A!=B)) {
            System.out.println(1000 + 100*B);
        }


        if ((A!=B) && (B!=C) && (A!=C)){
            if ((A>B) && (A>C)){
                System.out.println(100*A);
            }
            if ((B>C) &&(B>A)){
                System.out.println(100*B);
            }
            if ((C>A) &&(C>B)){
                System.out.println(100*C);
            }
        }
    }
}
