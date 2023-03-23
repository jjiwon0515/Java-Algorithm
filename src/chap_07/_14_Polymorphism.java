package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

import javax.xml.stream.FactoryConfigurationError;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성
        // 다형성을 사용하는 이유
        // 1. 다른 객체를 추가하는 경우
        // 2. 상속과 메서드 재정의를 활용하여 확장성 있는 프로그램을 만들 수 있다.
        // 3. 사용하지 않으면 if - else if문이 구현되고 코드 유지보수가 어려움
        // 4. 상위 클래스는 공통적인 부분 제공, 하위 클래스는 각 클래스에 맞는 기능을 구현
        // 5. 여러 클래스를 하나의 타입으로 핸들링 가능

        // class Person : 사람
        // class Student extends Person : 학생 (학생은 사람이다. Student is a person)
        // class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a person)



        //부모 클래스는 각각의 다른 자식 클래스를 만들 수 있다.
        //부모클래스 객체명 = new 부모클래스 or 자식클래스
        //각각의 객체를 부모클래스로 정의 ==> 부모 클래스에 있는 메소드들만 사용이 가능하다.
        Camera camera = new Camera();
        Camera factorycam = new FactoryCam();
        Camera speedcam = new SpeedCam();


        camera.showMainFeature();
        factorycam.showMainFeature();
        speedcam.showMainFeature();

        System.out.println("--------------------------------------------------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam: cameras)
                {
                    cam.showMainFeature() ;

        }

        if (camera instanceof Camera){
            System.out.println("카메라입니다.");
        }

        if (factorycam instanceof FactoryCam){
            ((FactoryCam)factorycam).detectFire();


        }

        if (speedcam instanceof SpeedCam){
            ((SpeedCam) speedcam).recognizeLicensePlate();
            ((SpeedCam) speedcam).checkSpeed();
//            ((FactoryCam) speedcam).recordVideo(); 여러 클래스를 하나의 타입을 핸들링 가능
        }

        // 자바에서 extends로 부모 자식 관계를 맺지 않아도 사용할 수 있는 클래스 : Object
        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();


    }
}
