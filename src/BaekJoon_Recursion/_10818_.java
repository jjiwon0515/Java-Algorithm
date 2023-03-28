package BaekJoon_Recursion;

// 처음에는 문제해결에 필요한 함수가 있는지 먼저 찾아보자

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10818_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // * N의 범위 (1<= N <= 1,000,000
        Long N = Long.valueOf(br.readLine());
        Long t = 0L;

        Long[] X = new Long[Math.toIntExact(N)]; // 입력값 저장할 공간 배열
        String[] input = br.readLine().split(" "); // 입력값을 공백을 기준으로 나눠서 하나씩 저장


        for (int i = 1; i < N+1; i++) {
            X[i-1] = Long.valueOf(input[i-1]);

//            if (X[i - 1] > X[0]){
//                t = X[0];
//                X[0] = X[i-1];
//                X[i-1] = t;
//            }
            // if문으로 들어올때마다 큰값이면 맨 앞으로 보내고 작은값이면 맨뒤로 보내도록 구성
        }
        // 배열의 요소를 정렬하는 Arrays.sort 함수 사용
        Arrays.sort(X);


        // X[0]이 가장 큰값, X[길이 -1]이 가장 작은 값으로 출력

        System.out.println( X[0] + " " + X[X.length-1]);
    }
}
