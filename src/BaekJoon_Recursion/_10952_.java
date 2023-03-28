package BaekJoon_Recursion;

import java.io.*;
import java.nio.Buffer;

public class _10952_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int last =0 ;
        int last2=0;
        while ( true ) {
            String s = br.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);


            if (a== 0 && b==0){
                break;
            }
            bw.write(a + b+"\n");
        }
        bw.flush();
        bw.close();

    }
}
