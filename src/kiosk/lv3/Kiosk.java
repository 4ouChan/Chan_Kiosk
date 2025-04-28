package kiosk.lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk implements Runnable {
    @Override
    public void run() {
        MenuItem burger = new MenuItem();

        List<String> menuList = new ArrayList<>();

        menuList.add(burger.shackBurger());
        menuList.add(burger.smokeShack());
        menuList.add(burger.cheeseburger());
        menuList.add(burger.hamburger());

        Scanner scanner = new Scanner(System.in);

        char userText = 'K';

        while (userText != '0') {

            System.out.println("\n[ SHAKESHACK MENU ]");

            for (int i = 0; i < menuList.size(); i++) {
                System.out.println((i + 1) + ". " + menuList.get(i));
            }
            System.out.println("0. 종료       | 종료\n");

            System.out.print("원하는 번호를 입력해주세요. (처음 입력한 숫자만 인식합니다.): ");
            userText = scanner.next().charAt(0);

            while (true) {
                switch (userText) {
                    case '1' -> System.out.println("\n선택한 제품: " + menuList.get(0) + "\n");
                    case '2' -> System.out.println("\n선택한 제품: " + menuList.get(1) + "\n");
                    case '3' -> System.out.println("\n선택한 제품: " + menuList.get(2) + "\n");
                    case '4' -> System.out.println("\n선택한 제품: " + menuList.get(3) + "\n");
                    case '0' -> System.out.println("\n프로그램을 종료합니다. ");
                    default -> System.out.print("\n잘못된 입력입니다.\n");
                }
                if (userText == '0') {
                    break;
                } else {
                    System.out.print("계속 하시려면 아무거나 입력 해주세요. (종료는 '0'): ");
                    userText = scanner.next().charAt(0);
                    break;
                }
            }
        }
    }
}
