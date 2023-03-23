package chap_08.camera;

public abstract class Camera { // abstract 추가
        public void takePicture(){
            System.out.println("동영상을 녹화합니다.");
        }

        public void recordVideo(){
            System.out.println("동영상을 녹화합니다.");
        }

        public abstract void showMainFeature(); // 구현해야 하는 메소드
        }


