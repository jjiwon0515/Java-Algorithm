package BaekJoon_Recursion;

import java.util.Scanner;

public class _11729_ {

    public static void hanoi_top(int N , char A, char B, char C){


        if (N == 1){
            System.out.println(  A + " " + C );          // 종료조건

        }
        else {
            // 문제정의
            hanoi_top(N-1, A, C, B); // 보조에 몰아넣기
            System.out.println(A +" "+ C); // 제일 큰 원판 목적기둥에 옮기기
            hanoi_top(N-1, B ,A, C); // 나머지 목적기둥에 옮기기


        }


    }
//    public static void move(int N){
//        // Scanner 메소드 : 입력받기
//
//    }

    public static void main(String[] args) {
//        세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다. 각 원판은 반경이 큰 순서대로 쌓여있다.
//        이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서 세 번째 장대로 옮기려 한다.
//
//                한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
//                쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
//                이 작업을 수행하는데 필요한 이동 순서를 출력하는 프로그램을 작성하라. 단, 이동 횟수는 최소가 되어야 한다.

        // 아이디어 : 베이스 케이스, N값이 점점 작아져야한다, 원판이 3개인 상황부터 생각해보자

        // 원판 개수 N에 입력받기
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());



        System.out.println((int)Math.pow(2,N) - 1);
        hanoi_top(N,'1','2','3');



    }
}
