package BaekJoon_Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _Buffered_test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            System.out.println("hi");
        }
        // 문자열로 받아서 정수형으로 형변환을 한다
        // Ex) 1234입력 => "1234" => 1234로 다시 형변환
        // 그래서 공백이 있으면 안되나?
        String n = br.readLine();
        // split 함수 : "" 안에 기준을 넣어서 문자열을 나눔
        int a = Integer.parseInt(n.split(" ")[0]);
        int b = Integer.parseInt(n.split(" ")[1]);

        System.out.println(a);
    }
}
