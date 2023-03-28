package BaekJoon_Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2562_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int input = Integer.parseInt(br.readLine());
        int[] input = new int[9];
        int empty = 0;
        int index = 1;

        for (int i = 0; i < 9; i++) {
            input[i] = Integer.parseInt(br.readLine());
            }

        empty = input[0];


        // ArrayIndexOutOfBoundsException => 인덱스가 배열의 크기보다 크거나 음수일 때 발생
        for (int i = 1; i < 9; i++) {
            if (input[i] > empty) {// 배열에 들어온 값이 이전 값보다 크다면 empty 변수에 저장.
                empty = input[i];

            }

        }

        for (int i = 0; i < 9; i++) {
            if (empty == input[i]){
                break;
            }
            index++;
        }
        System.out.println(empty);
        System.out.println(index);
    }
}