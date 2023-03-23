package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();
        //CoffeeByNumber와 CoffeeByNickname의 기능은 똑같다. 하지만 자료형이 다르기때문에 이 중복을 어떻게 없앨것인가? (사용이유)
        System.out.println("-----------------------------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("-------------------------------------");

        int c3Name = (int)c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String)c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        System.out.println("--------------------------------------");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("장지원");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 번호 : " + c6Name);

        System.out.println("----------------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<User>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new User("서장훈"));
        c8.ready();

        System.out.println("----------------------------------");
        orderCoffee("김영철");
        orderCoffee(36);

        orderCoffee("김희철", "아메리카노");


    }

    public static <T> void orderCoffee(T name){
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee){
        System.out.println(coffee + "커피 준비 완료 : " + name);
    }
}
