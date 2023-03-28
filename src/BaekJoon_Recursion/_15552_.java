package BaekJoon_Recursion;

import java.io.*;
import java.util.StringTokenizer;

public class _15552_ {
    public static void main(String[] args) throws IOException {
        // Java에서의 입출력 속도(시간 초과)
        // BufferedReader와 BufferedWriter 사용,, BufferedWriter.flush 마지막에 한번 사용
        // BufferedReader 단점 : 입력받은 모든 데이터가 String으로 반환된다.
        // => 숫자형식으로 받기 위해서는 형변환이 필요하다
        // => 줄마다 입력받아서, 따로 split하여 데이터를 처리해주어야 한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
//            System.out.println(a+b);
            // bw.write를 사용하고 \n 줄바꿈을 해야 버퍼에 있는 문자열들이 출력된다
            // 줄바꿈을 하지 않으면 출력되지 않음
            bw.write(a + b + "\n");

//            bw.flush랑 close의 위치
//            bw.flush : 남아있는 데이터를 모두 출력시킴
//            bw.close : 스트림을 닫는다
//            bw.flush();
//            bw.close();

        }
        bw.flush();
        bw.close();



    }
}
