package chap_07;

public class Blackbox {
    String modelName; //모델명
    String resolution; //해상도
    int price; //가격
    String color; //색상
    int serialNumber; // 시리얼 번호
    static int counter = 0; //시리얼 번호를 생성해주는 역할 (처음에는 0이었다가 1씩 증가)
    static boolean canAutoReport = false; // 자동 신고 기능 static -> 클래스 변수


    Blackbox(){ // 생성자
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다. : " + this.serialNumber);
    }

    Blackbox(String modelName, String resolution, int price, String color) {
//        this(); // 생성자 호출
//
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }


    void autoReprot(){
        if(canAutoReport == true){
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }
        else{
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity){
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { // 일반 영상
            return 9;
        }
        else if (type == 2) { // 이벤트 영상
            return 1;
        }
        return 10;


    }

    // showDateTime : 날짜정보 표시여부
    // showSpeed : 속도정보 표시여부
    // min : 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min){
        System.out.println("녹화를 시작합니다.");
        if (showDateTime == true){
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if(showSpeed){
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record(){ //인스턴스 메소드 : 객체의 인스턴스 변수가 다르므로 각가 다른 동작을 할 수 있다.
        record(true, true, 5);
//        canAutoReport = false;
//        modelName = "s";  ==> 인스턴스 메소드에서는 인스턴스 변수, 클래스 변수 둘 다 사용가능
    }

    static void callServiceCenter(){ // 클래스 메소드 : 객체가 없어도 클래스명.메소드명으로 실행할 수 있다, 또한 객체 상관없이 같은 역할을 수행한다.
        System.out.println("서비스 센터(1588-0000) 로 연결합니다.");
//        modelName = "test";  static으로 선언한 클래스 변수는 static 메소드에서 사용가능하지만 인스턴스 변수는 사용할 수 없다.
        canAutoReport = false;
    }

    void appendModelName(String modelName) {
            this.modelName += modelName; // this.인스턴스 변수명 : 파라미터 변수와 인스턴스 변수명이 같을 때, 인스턴스 변수인 것을 구분하기 위해서 사용
                                            // this : 인스턴스 변수에 직접 접근
    }

    //Getter & Setter
    String getModelName(){
        return modelName;
    }

    void setModelName(String modelName){
        this.modelName = modelName;
    }

    String getResolution(){
        if (resolution == null || resolution.isEmpty()){ // Empty는 ""
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution(String resolution){
        this.resolution = resolution;
    }

    int getPrice(){
        return price;
    }

    void setPrice(int price){
        if (price < 100000){
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color = color;
    }
}
