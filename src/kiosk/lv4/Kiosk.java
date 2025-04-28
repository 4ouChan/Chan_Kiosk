package kiosk.lv4;

import java.util.Scanner;

public class Kiosk implements Runnable {
    @Override
    public void run() {

        Scanner scanner = new Scanner(System.in);

        MenuItem menuItem = new MenuItem();

        menuItem.addMenu();


        while (true) {

            System.out.println("[ MENU LIST ]");
            System.out.println("1. Burgers");
            System.out.println("2. Drinks");
            System.out.println("3. Desserts");
            System.out.println("0. 종료   |   종료\n");

            System.out.print("원하는 번호를 입력해주세요. (처음 입력한 숫자만 인식합니다.): ");
            char userText = scanner.next().charAt(0);

            if (userText == '0') {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (userText == '1') {
                menuItem.bugerList();
            }

            if (userText == '2') {
                menuItem.drinkList();
            }

            if (userText == '3') {
                menuItem.dessertList();
            }
        }
    }
}

