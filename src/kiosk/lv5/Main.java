package kiosk.lv5;

public class Main {

    public static void main(String[] args) {

        Kiosk myKiosk = new Kiosk();

        Thread kioskThread = new Thread(myKiosk);

        kioskThread.start();
    }
}
