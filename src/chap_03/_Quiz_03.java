package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String y = "901231-1234567";
        System.out.println(y.substring(0,8));
        System.out.println(y.substring(0,y.indexOf("-")+2));
    }
}
