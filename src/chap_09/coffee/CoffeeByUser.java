package chap_09.coffee;

import chap_09.user.User;

public class CoffeeByUser <T extends User>{
    // 제네릭 클래스 : 어떤 형태의 타입을 쓰든지 상관없지만 User를 상속하는 클래스만 상속가능
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
