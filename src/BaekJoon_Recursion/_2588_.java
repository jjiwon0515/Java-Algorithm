package BaekJoon_Recursion;

import java.util.Scanner;
// 백준 자바 유의해야할점
// 1. 패키지 이름 제거
// 2. class명은 무조건 Main
// 3. 변수 선언부분들은 하나에 몰아넣기
// 4. main 클래스위에 다른 클래스들 넣기
public class _2588_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        System.out.println((b%100)%10);
        System.out.println(a * ((b%100)%10));
        System.out.println(a * ((b % 100)/10));
        System.out.println(a * (b / 100));
        System.out.println(a * ((b % 100)%10)+a * ((b % 100)/10)*10+a * (b / 100)*100);

    }
}
