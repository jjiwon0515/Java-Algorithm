package BaekJoon_Recursion;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _10871_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
//        System.out.println(A); pass
//        System.out.println(B); pass


        int[] X = new int[A];

        String[] l = br.readLine().split(" ");
        // a 개수만큼 배열에 대입
        for (int i = 0; i < A; i++) {

            X[i] = Integer.parseInt(l[i]);
            // "1 2 3" => l[1] = 1

        }

//        10 5
//        1 10 4 9 2 3 8 5 7 6
        for (int i = 0; i < A; i++) {
            if (X[i]<B)

                System.out.print(X[i]+ " ");
        }
    }
}
