package chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.modelName = "까망이";

        b1.record(false, false, 10);
        System.out.println("----------------------------------");
        b1.record(true, true, 3);
        System.out.println("----------------------------------");
        b1.record();


        String s = "BlackBox";
        System.out.println(s.indexOf("a")); // Ctrl + 클릭하면 함수의 메소드를 보러갈 수 있다.


    }
}
