package chap_09.coffee;

public class CoffeeByNumber {
    public int WaitingNumber;

    public CoffeeByNumber(int waitingNumber) {
        WaitingNumber = waitingNumber;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : " + WaitingNumber);
    }
}
