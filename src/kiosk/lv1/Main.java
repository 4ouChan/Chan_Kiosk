package kiosk.lv1;

import java.util.Scanner;

public class Main {

    String burgerName;
    String price;
    String burgerAccount;

    public String shackBurger() {
        burgerName = "1. shackBurger  ";
        price = " | W 6.9 | ";
        burgerAccount = "토마토, 양상추, 쉑소스가 토핑된 치즈버거";
        return burgerName + price + burgerAccount;
    }

    public String smokeShack() {
        burgerName = "2. SmokeShack   ";
        price = " | W 8.9 | ";
        burgerAccount = "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거";
        return burgerName + price + burgerAccount;
    }

    public String cheeseburger() {
        burgerName = "3. Cheeseburger ";
        price = " | W 6.9 | ";
        burgerAccount = "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거";
        return burgerName + price + burgerAccount;
    }

    public String hamburger() {
        burgerName = "4. Hamburger    ";
        price = " | W 5.4 | ";
        burgerAccount = "비프패티를 기반으로 야채가 들어간 기본버거";
        return burgerName + price + burgerAccount;
    }

    public static void main(String[] args) {

        Main burger = new Main();
        Scanner scanner = new Scanner(System.in);
        char userText = 'b';
        String printBuger;
        while (userText != '0') {
            System.out.println("\n[ SHAKESHACK MENU ]");

            printBuger = burger.shackBurger();
            System.out.println(printBuger);
            printBuger = burger.smokeShack();
            System.out.println(printBuger);
            printBuger = burger.cheeseburger();
            System.out.println(printBuger);
            printBuger = burger.hamburger();
            System.out.println(printBuger);
            System.out.println("0. 종료       | 종료\n");

            System.out.print("원하는 번호를 입력해주세요. (처음 입력한 숫자만 인식합니다.): ");
            userText = scanner.next().charAt(0);


            while (true) {
                switch (userText) {
                    case '1' -> System.out.println("\n선택한 제품: " + burger.shackBurger() + "\n");
                    case '2' -> System.out.println("\n선택한 제품: " + burger.smokeShack() + "\n");
                    case '3' -> System.out.println("\n선택한 제품: " + burger.cheeseburger() + "\n");
                    case '4' -> System.out.println("\n선택한 제품: " + burger.hamburger() + "\n");
                    case '0' -> System.out.println("\n프로그램을 종료합니다. ");
                    default ->  {
                        System.out.print("\n잘못된 입력입니다.\n");
                        break;
                    }
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


