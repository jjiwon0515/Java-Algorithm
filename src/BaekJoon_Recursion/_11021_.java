package BaekJoon_Recursion;

import java.io.*;

public class _11021_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);

            bw.write(String.format("Case #%d: %d\n",(i+1),(a+b)));

        }
        bw.flush();
        bw.close();

    }
}
