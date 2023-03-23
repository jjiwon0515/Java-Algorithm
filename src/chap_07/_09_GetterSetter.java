package chap_07;

public class _09_GetterSetter {
    // getter & setter 사용이유 : 객체의 무결성을 보장하기 위해 사용
    //                         : 만약 몸무게값을 0보다 낮은 값으로 받게 되면 무결성이 깨지기 때문에 이런 경우를 정리해야한다. 그때 getter setter를 사용
    //                         : 한번 검증하고 처리하는 역할을 한다.
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.modelName = "까망이";
        //b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        // 할인행사
        b1.price = - 5000;
        System.out.println("가격 : " + b1.price + "원");

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution);

        Blackbox b2 = new Blackbox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());

        b2.price = -5000;

    }
}
