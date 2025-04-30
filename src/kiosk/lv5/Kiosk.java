package kiosk.lv5;

import java.util.Scanner;

public class Kiosk implements Runnable {

    @Override
    public void run() {
        // 스캐너 인스턴스화
        Scanner scanner = new Scanner(System.in);

        // MenuItem클래스 인스턴스화
        MenuItem menuItem = new MenuItem();

        // addMenu 기능을 사용하여 각 리스트에 값을 할당
        menuItem.addMenu();

        // 반복문을 활용해 사용자가 특정 값을 입력하기 전까지 반복
        while (true) {


            // 메인 카테고리를 출력 해주는 기능 사용
            menuItem.mainList();

            // 사용자에게 원하는 값 입력받기
            System.out.print("원하는 번호를 입력해주세요. (처음 입력한 숫자만 인식합니다.): ");
            char userText = scanner.next().charAt(0);

            // userText의 값이 0이면, 프로그램 종료
            if (userText == '0') {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // userText의 값이 1, 2, 3이면, 알맞은 기능을 호출하고 그 외 경우엔 잘못된 입력이라는 메시지 출력
            if (userText == '1' || userText == '2' || userText == '3') {
                menuItem.addTotalList(userText);
            } else {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            menuItem.selectMenu(userText);
        }
    }
}
// lv5 구조 개선
