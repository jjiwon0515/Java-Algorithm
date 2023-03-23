package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
//        키가 120cm 이상인 경우에만 탑승 가능
//        삼항연산자 이용
        int height = 130;
        String p = (height>120) ? "키가 "+height+" 이므로 탑승 가능합니다" : "키가 " + height +" 이므로 탑승 불가능합니다";
        System.out.println(p);
    }
}
