package chap_07.camera;

// SpeedCam is a Camera. (IS-A)
public class SpeedCam extends Camera{ //자식 클래스


    public SpeedCam() {
//        this.name = "과속단속 카메라";
        super("과속단속 카메라");
    }



    public void checkSpeed(){
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate(){
        System.out.println("차량 번호를 인식합니다.");
    }
    @Override
    public void takePicture(){
        // 사진 촬영
        super.takePicture(); // super : 부모 클래스에 있는 takePicture()를 사용
        checkSpeed();
        recognizeLicensePlate();
    }

    @Override // annotation
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }
}
