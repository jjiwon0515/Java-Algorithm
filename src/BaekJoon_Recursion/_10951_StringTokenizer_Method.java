package BaekJoon_Recursion;

import java.io.*;
import java.util.StringTokenizer;

public class _10951_StringTokenizer_Method {
    public static void main(String[] args) throws IOException {

        // EOF(End Of File)
        // 1. hasnextint : 입력값이 생기기 전까지 실행을 유보하는 역할
        // 2. StringTokenizer : BufferedReader로 입력을 받으면 반환값으로 문자열이 나오기때문에 이를 관리할 함수가 따로 필요하다
        // 그것이 StringTokenizer 메서드이다. 이를 통해 문자열을 관리
        // * nextToken(), hasMoreTokens()...
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String s;
        // 입력받은 값이 null값이 아닐동안만 입력받고 출력하기
        while((s=br.readLine())!=null){

            Integer a = Integer.parseInt(s.split(" ")[0]);
            Integer b = Integer.parseInt(s.split(" ")[1]);

            bw.write(a+b + "\n");
            bw.flush();


        }

        bw.close();
    }
}
