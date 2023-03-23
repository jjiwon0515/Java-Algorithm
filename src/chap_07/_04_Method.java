package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.autoReprot(); // 지원 안됨
        Blackbox.canAutoReport = true;
        b1.autoReprot(); //지원됨

        b1.insertMemoryCard(256);

        // 일반 영상 : 1
        // 이벤트 영상 (충돌 감지) : 2
        int fileCount = b1.getVideoFileCount(1); //일반 영상
        System.out.println("일반 영상 파일 수 : " + fileCount + "개");

        fileCount = b1.getVideoFileCount(2); //이벤트 영상
        System.out.println("이벤트 영상 파일 수 : " + fileCount + "개");
    }
}
