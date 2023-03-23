package chap_06;

public class _09_Quiz {
    // 개인 정보 중 일부를 비공개로 전환하는 프로그램을 작성
    // Ex) 990130-1234567, 010-1234-5678 ==> 990130-1******, 010-1234-****
    public static void ForSec(String name, String Id, String Num){
        String SecName = name.substring(0,1);
        String SecId = Id.substring(0,7);
        String SecNum = Num.substring(0,9);

        System.out.println(SecName + "**");
        System.out.println(SecId + "******");
        System.out.println(SecNum + "****");


    }

    public static void main(String[] args) {
        ForSec("장지원","020515-1212121","010-2121-1212");

    }
}
