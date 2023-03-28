package BaekJoon_Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class _2447_ {

    public static void Star(int N){
        StringBuilder sb = new StringBuilder();
        // 2차 배열로 해결하기
        if (N == 3){
             //출력
//            sb.append("*".repeat(3) + "\n" +
//                      "* *\n" +
//                      "*".repeat(3) + "\n");
            char [][] array = new char [3][3];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = '*';
                }
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }





        }
        else{  // n == 9, 27, 81.....

            // n == 9
            String [][] array_recur = new String [3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                }

            }

//            Star(N % 3); // 27 입력 ==> 9 ==> 3 (3이 되면 if문 수행하고 끝)
        }
    }
    public static void main(String[] args) throws IOException {

        // BufferedReader 사용하기 (입력문 시간줄이기)
        // sout 보다는 StringBuilder 사용 (출력문 시간줄이기)
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int  input = Integer.parseInt(bf.readLine());
        Star(input);

    }




}
