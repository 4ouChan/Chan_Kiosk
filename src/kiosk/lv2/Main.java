package kiosk.lv2;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // 여기서부터 메인 메서드
    public static void main(String[] args) {

        // 클래스 외부에 생성한 기능을 사용하기 위해 인스턴스화
        MenuItem burger = new MenuItem();

        // 메뉴 정보를 가져오기 위해 리스트 생성
        List<String> menuList = new ArrayList<>();

        // 리스트에 원하는 순서대로 값을 입력
        menuList.add(burger.shackBurger());
        menuList.add(burger.smokeShack());
        menuList.add(burger.cheeseburger());
        menuList.add(burger.hamburger());

        // 스캐너 기능을 사용하기 위해 인스턴스화
        Scanner scanner = new Scanner(System.in);

        // 반목문을 반복시키기 위해 userText의 값을 초기화
        char userText = 'K';

        // 반목문을 이용해 userText의 값이 0이 되면, 반복문을 종료하도록 설계
        while (userText != '0') {

            // 타이틀을 출력
            System.out.println("\n[ SHAKESHACK MENU ]");

            // menuList에서 값을 순서대로 출력
            System.out.println(menuList.get(0));
            System.out.println(menuList.get(1));
            System.out.println(menuList.get(2));
            System.out.println(menuList.get(3));
            System.out.println("0. 종료       | 종료\n");

            System.out.print("원하는 번호를 입력해주세요. (처음 입력한 숫자만 인식합니다.): ");

            // 사용자가 원하는 값을 입력 받을 때 입력받은 값에서 첫 번째 문자 하나만 입력
            userText = scanner.next().charAt(0);

            // 첫 번째 선택 중 메뉴를 선택하여 입력하면 반복문에 의해 바로 메뉴판이 출력되는데,
            //  이를 막고자 내부 반복문을 선언하여 사용자의 추가 선택 의사를 묻고, 사용자의 입력에 따라 실행여부 결정.
            while (true) {
                // 입력받은 값과 리스트의 인덱스를 맞춰 입력 순서에 맞게 선택한 제품을 출력
                switch (userText) {
                    case '1' -> System.out.println("\n선택한 제품: " + menuList.get(0) + "\n");
                    case '2' -> System.out.println("\n선택한 제품: " + menuList.get(1) + "\n");
                    case '3' -> System.out.println("\n선택한 제품: " + menuList.get(2) + "\n");
                    case '4' -> System.out.println("\n선택한 제품: " + menuList.get(3) + "\n");
                    case '0' -> System.out.println("\n프로그램을 종료합니다. ");
                    // 의도한 케이스 외에는 잘못된 입력으로 처리
                    default -> System.out.print("\n잘못된 입력입니다.\n");
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
// lv2 끝
