package challengekiosk.lv1;

public class Main {

    public static void main(String[] args) {

        // Kiosk 클래스를 사용할 myKiosk 인스턴스 생성
        Kiosk myKiosk = new Kiosk();
        // myKiosk를 실행시킬 kioskThread 인스턴스 생성
        Thread kioskThread = new Thread(myKiosk);
        // kioskThread 실행
        kioskThread.start();
    }
}
// 도전 장바구니