package chap_07.camera;

public class ActionCam extends Camera{
    // final : 아예 변수를 고정시킨다.
    public final String Lens; //= "광각렌즈";
    public ActionCam() {
        super("액션 카메라");
        Lens ="광각렌즈";
    }

    public final void makeVideo(){
        System.out.println(this.name + " : " + this.Lens + " : 멋진 비디오를 제작합니다.");
    }
}
