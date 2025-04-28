package kiosk.lv4;

public class Main {

    // lv2에서 메인 클래스에서 실행하던 프로그램을 Kiosk 클래스를 생성하여 넘겨주고, 쓰레드로 메인에서 실행시키도록 변경
    public static void main(String[] args) {
        // Kiosk 클래스를 사용할 myKiosk 인스턴스 생성
        Kiosk myKiosk = new Kiosk();
        // myKiosk를 실행시킬 kioskThread 인스턴스 생성
        Thread kioskThread = new Thread(myKiosk);
        // kioskThread 실행
        kioskThread.start();
    }
}
// lv4 끝