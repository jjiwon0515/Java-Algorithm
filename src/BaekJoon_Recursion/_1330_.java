package BaekJoon_Recursion;

import java.util.Scanner;

// 이번엔 Long이 아닌 int 자료형으로 했더니 정답을 구했다
// 아무래도 범위를 잘보고 알맞는 자료형을 쓸줄 아는지도 굉장히 중요한거 같다.

public class _1330_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        if (a>b){
            System.out.println(">");
        }
        if (a<b){
            System.out.println("<");
        }
        if (a==b){
            System.out.println("==");
        }

    }
}
