package BaekJoon_Recursion;

import java.io.*;

public class _2438_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N ; i++) {

            bw.write("*".repeat(i+1)+"\n");
        }
        bw.flush();
        bw.close();

    }
}
