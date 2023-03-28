package BaekJoon_Recursion;

import java.util.Scanner;

public class _14681_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());

        if ( x>0 &&  y>0){
            System.out.println(1);
        }
        if ( x>0 && y<0)
            System.out.println(4);
        if (0>x && y>0)
            System.out.println(2);
        if (0>x && y<0)
            System.out.println(3);
    }
}
