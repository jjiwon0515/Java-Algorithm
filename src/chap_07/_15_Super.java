package chap_07;

import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super : 상위 클래스에서의 내용을 바꾸면 하위 클래스에서의 내용도 따로 바꿔줘야하는 번거로움이 생길 때가 있다.
        // 이것을 해결하기 위해 Super를 사용한다.
        // 부모클래스의 함수나 변수에 접근할 수 있다.
        FactoryCam factorycam = new FactoryCam();
        SpeedCam speedcam = new SpeedCam();

        factorycam.recordVideo();
        System.out.println("--------------------------");
        speedcam.takePicture();
    }
}
