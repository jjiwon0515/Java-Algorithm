package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속
        Camera camera = new Camera();
        FactoryCam facotrycam = new FactoryCam();
        SpeedCam speedcam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(facotrycam.name);
        System.out.println(speedcam.name);

        camera.takePicture();
        facotrycam.recordVideo();
        speedcam.takePicture();

        facotrycam.detectFire();
        speedcam.checkSpeed();
        speedcam.recognizeLicensePlate();
    }
}
