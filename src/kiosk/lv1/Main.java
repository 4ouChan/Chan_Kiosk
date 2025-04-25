package kiosk.lv1;

import java.util.Scanner;

public class Main {

    // 클래스 외부에 메서드 생성
    String burgerName;
    String price;
    String burgerAccount;

    // shackBurger의 정보를 저장하고 불러오는 기능
    public String shackBurger() {
        burgerName = "1. shackBurger  ";
        price = " | W 6.9 | ";
        burgerAccount = "토마토, 양상추, 쉑소스가 토핑된 치즈버거";
        return burgerName + price + burgerAccount;
    }

    // smokeShack의 정보를 저장하고 불러오는 기능
    public String smokeShack() {
        burgerName = "2. SmokeShack   ";
        price = " | W 8.9 | ";
        burgerAccount = "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거";
        return burgerName + price + burgerAccount;
    }

    // cheeseburger의 정보를 저장하고 불러오는 기능
    public String cheeseburger() {
        burgerName = "3. Cheeseburger ";
        price = " | W 6.9 | ";
        burgerAccount = "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거";
        return burgerName + price + burgerAccount;
    }

    // hamburger의 정보를 저장하고 불러오는 기능
    public String hamburger() {
        burgerName = "4. Hamburger    ";
        price = " | W 5.4 | ";
        burgerAccount = "비프패티를 기반으로 야채가 들어간 기본버거";
        return burgerName + price + burgerAccount;
    }

    // 여기서부터 메인 메서드
    public static void main(String[] args) {

        // 클래스 외부에 생성한 기능을 사용하기 위해 인스턴스화
        Main burger = new Main();

        // 스캐너 기능을 사용하기 위해 인스턴스화
        Scanner scanner = new Scanner(System.in);

        // 반목문을 반복시키기 위해 userText의 값을 초기화
        char userText = 'K';

        // 불러온 버거의 정보를 담을 변수 선언
        String printBurger;

        // 반목문을 이용해 userText의 값이 0이 되면, 반복문을 종료하도록 설계
        while (userText != '0') {

            // 타이틀을 출력
            System.out.println("\n[ SHAKESHACK MENU ]");

            // printBurger의 값을 원하는 순서로 초기화 후 출력
            printBurger = burger.shackBurger();
            System.out.println(printBurger);
            printBurger = burger.smokeShack();
            System.out.println(printBurger);
            printBurger = burger.cheeseburger();
            System.out.println(printBurger);
            printBurger = burger.hamburger();
            System.out.println(printBurger);
            System.out.println("0. 종료       | 종료\n");

            System.out.print("원하는 번호를 입력해주세요. (처음 입력한 숫자만 인식합니다.): ");

            // 사용자가 원하는 값을 입력 받을 때 입력받은 값에서 첫 번째 문자 하나만 입력
            userText = scanner.next().charAt(0);

            // 첫 번째 선택 중 메뉴를 선택하여 입력하면 반복문에 의해 바로 메뉴판이 출력되는데,
            //  이를 막고자 내부 반복문을 선언하여 사용자의 추가 선택 의사를 묻고, 사용자의 입력에 따라 실행여부 결정.
            while (true) {
                // 입력받은 값에따라 클래스 외부에서 생성한 기능을 출력
                switch (userText) {
                    case '1' -> System.out.println("\n선택한 제품: " + burger.shackBurger() + "\n");
                    case '2' -> System.out.println("\n선택한 제품: " + burger.smokeShack() + "\n");
                    case '3' -> System.out.println("\n선택한 제품: " + burger.cheeseburger() + "\n");
                    case '4' -> System.out.println("\n선택한 제품: " + burger.hamburger() + "\n");
                    case '0' -> System.out.println("\n프로그램을 종료합니다. ");
                    // 의도한 케이스 외에는 잘못된 입력으로 처리
                    default ->  System.out.print("\n잘못된 입력입니다.\n");
                }
                // switch 조건문을 빠져나온 후 다시 조건을 주어 userText가 0일 경우 바로 내부 반복문을 탈출하여 외부 반복문의 종결조건 확인
                if (userText == '0') {
                    break;
                    // userText의 값이 0이 아닌 경우엔 추가 사용 여부를 묻고, userText의 값을 변경한 후 내부 반복문 탈출 -> 외부 반복문의 종결조건 확인
                } else {
                    System.out.print("계속 하시려면 아무거나 입력 해주세요. (종료는 '0'): ");
                    userText = scanner.next().charAt(0);
                    break;
                }
            }
        }
    }
}
// lv1 끝

