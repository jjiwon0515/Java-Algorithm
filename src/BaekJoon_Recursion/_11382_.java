package BaekJoon_Recursion;

import java.util.Scanner;
//런타임 에러가 발생한 이유 : 숫자의 범위가 크기때문에 int 자료형으로 다 담을 수 없었다
// 그래서 Long 자료형을 이용해 문제를 해결할 수 있었다.
public class _11382_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a = Long.valueOf(sc.next());
        Long b = Long.valueOf(sc.next());
        Long c = Long.valueOf(sc.next());

        System.out.println(a+b+c);
    }
}
