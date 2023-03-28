package BaekJoon_Recursion;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class _5597_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //30크기를 가진 배열에서 for문을 이용해 값을 넣고, 1~30중에 없는 수를 탐색해서 출력
        //답 아이디어 : 과제를 낸 애들한테만 1(true)을 주고 아닌애들은 값이 없음
        // 탐색해서 값이 1이 아닌(false)애들을 찾는다.
        int[] arr = new int[30];
//        int minValue = Integer.MIN_VALUE;
//        int maxValue = Integer.MAX_VALUE;
        for (int i = 0; i < 28; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.binarySearch(arr, IntStream.range(1,30).sum());

        for (int i = 0; i < 28; i++) {
            for (int j = 0; j < 30; j++) {
                if (arr[i]!=j){
                    System.out.println(j);
                }
            }
        }

    }
}
