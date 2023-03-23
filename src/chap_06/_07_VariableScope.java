package chap_06;

public class _07_VariableScope {
    public static void methodA(){

        // 하나의 중괄호{} 안에서 선언한 변수는 중괄호 밖에서 사용할 수 없다.
        // -> 사용하기 위해서는 파라미터 값을 설정해서 사용할 수 있다.
//        System.out.println(number);
//        System.out.println(result);
    }

    public static void methodB(){
        int result = 1;
    }


    public static void main(String[] args) {
        int number = 3;
//        System.out.println(result);
        for (int i = 0; i < 5; i++) {
            System.out.println(i);

        }
//        System.out.println(i);
        {
            int j = 0;
            System.out.println(j);
        }
//        System.out.println(j);
    }
}
