package chap_06;

public class _04_ParemeterAndReturn {
    public static int getPower(int num){
        int result = num * num;
        return result;
        // return num * num
    }

    public static void main(String[] args) {
        // 전달값과 반환값이 함께 있음
        int retVal = getPower(4);
        System.out.println(getPower(3));
    }
}
