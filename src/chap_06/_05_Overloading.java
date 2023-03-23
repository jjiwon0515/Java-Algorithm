package chap_06;

public class _05_Overloading {
    public static int getPowerStr(String strNumber){
        int result = Integer.parseInt((strNumber));
        return result * result;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언 조건
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나
        System.out.println(getPowerStr("5"));
        System.out.println(getPowerStr("3"));

    }
}
