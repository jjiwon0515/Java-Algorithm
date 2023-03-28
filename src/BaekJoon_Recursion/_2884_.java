package BaekJoon_Recursion;

import java.util.Scanner;

public class _2884_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        // H 24 M 60
        // H 24
        // M - 45
        // 24시 60분
        // 만약 입력받은 M값이 45보다 작으면 H를 하나 적게 한다.
        // 그게 아니면 M - 45
        // 0 -> 23
        if ( M < 45 ){
            if ( H == 0){
                System.out.print(23);
            }
            else {
                System.out.print(H - 1);
            }

            System.out.print(" ");
            System.out.print(60 + (M - 45));

        }
        else{
            System.out.print(H + " " + (M -45));
        }

    }
}
