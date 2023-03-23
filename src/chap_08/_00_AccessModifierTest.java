package chap_08;

import chap_07.*; // * : 패키지안에 있는 모든 클래스를 가져다 사용한다

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackboxRefurbish b1 = new BlackboxRefurbish();
        b1.modelName = "까망이"; //public
//        b1.resoultion = "FHD" //default
//        b1.price = 200000; //private
//        b1.color = "화이트" //protected
//        A a = new A(); // A 클래스는 default이기 때문에 다른 패키지에서는 접근할 수 없다

    }
}
