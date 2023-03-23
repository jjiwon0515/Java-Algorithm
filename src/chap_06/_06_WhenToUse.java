package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number , int exp){
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 2의 2승을 구하기
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;

        }
        System.out.println(result);

        System.out.println(getPower(2,2));
    }
}
