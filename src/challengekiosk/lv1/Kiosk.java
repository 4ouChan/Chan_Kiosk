package challengekiosk.lv1;

import java.util.ArrayList;
import java.util.List;
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

        List<String> userSelectMenu = new ArrayList<>();

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
                menuItem.printMenuList(userText);
            } else {
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            // 메뉴를 선택하고 선택한 메뉴를 출력하는 기능 호출
            while (userText != '0') {
                menuItem.selectMenu(userText);
                if (menuItem.userSelectMenu == null) {
                    System.out.println("\n메인 화면으로 돌아갑니다.\n");
                    break;
                }
                String userMenu = menuItem.userSelectMenu;
                System.out.println("\n선택한 제품: " + menuItem.userSelectMenu + "\n");
                System.out.println("선택한 제품을 장바구니에 추가하시겠습니까?\n");
                System.out.print("1. 추가   |   2. 취소  : ");
                userText = scanner.next().charAt(0);
                if (userText == '1') {
                    userSelectMenu.add(userMenu);
                    System.out.println("장바구니에 추가되었습니다.\n");
                    System.out.println("추가된 메뉴\n");
                    for (String shoppingMenu : userSelectMenu) {
                        System.out.println(shoppingMenu);
                    }
                    System.out.print("\n계속 하시려면 아무거나 입력해주세요. 메인 화면으로 돌아갑니다.: ");
                    userText = scanner.next().charAt(0);
                    break;
                } else if (userText == '2') {
                    System.out.println("취소되었습니다.");
                    System.out.print("계속 하시려면 아무거나 입력해주세요. 메인 화면으로 돌아갑니다.: ");
                    userText = scanner.next().charAt(0);
                    break;
                } else {
                    System.out.println("잘못된 입력입니다.");
                    continue;
                }
            }
        }
    }
}
// 도전기능
