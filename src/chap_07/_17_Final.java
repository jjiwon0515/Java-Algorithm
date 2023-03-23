package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;
// final : 상속을 막는 역할, 변수를 고정시키는 역할, 메소드 사용을 막는 역할,.....
public class _17_Final {
    public static void main(String[] args) {
        // Final

        // public (final) class
        // pubic (final) void
        // public > abstract > static > final > ...
        ActionCam actioncam = new ActionCam();
//        actioncam.Lens = "표준렌즈";
        actioncam.recordVideo();
        actioncam.makeVideo();

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVideo();


    }
}
