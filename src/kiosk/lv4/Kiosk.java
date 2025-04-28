package kiosk.lv4;

import java.util.Scanner;

public class Kiosk implements Runnable {
    @Override
    public void run() {
        // 스캐너 인스턴스화
        Scanner scanner = new Scanner(System.in);

        // MenuItem클래스 인스턴스화
        MenuItem menuItem = new MenuItem();

        // Menu 클래스 인스턴스화
        Menu myMenu = new Menu();

        // addMenu 기능을 사용하여 각 리스트에 값을 할당
        menuItem.addMenu();

        while (true) {

            // 메인 카테고리를 출력 해주는 기능 사용
            myMenu.mainList();

            // 사용자에게 원하는 값 입력받기
            System.out.print("원하는 번호를 입력해주세요. (처음 입력한 숫자만 인식합니다.): ");
            char userText = scanner.next().charAt(0);

            // userText의 값이 0이면, 프로그램 종료
            if (userText == '0') {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // userText의 값이 1이면, burgerList 호출
            if (userText == '1') {
                menuItem.bugerList();
            }

            // userText의 값이 2면, drinkList 호출
            if (userText == '2') {
                menuItem.drinkList();
            }

            // userText의 값이 3이면, dessertList 호출
            if (userText == '3') {
                menuItem.dessertList();
            }
        }
    }
}

