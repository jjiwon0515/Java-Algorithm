package chap_06;

public class _03_Return {
    // 호텔 전화번호
    public static String tel(){
        String num = "02-2222-2222";
        return num;
    }


    // 호텔 주소
    public static String add(){
        return "서울시 어딘가";
    }

    // 호텔 액티비티
    public static String activity(){
        return "볼링장, 탁구장, 수영장";
    }

    public static void main(String[] args) {
        String PhoneNum = tel();
        System.out.println("전화번호는 " + PhoneNum);

        String address = add();
        System.out.println("호텔 주소: " + address);

        System.out.println("호텔 액티비티 " + activity());
    }
}
