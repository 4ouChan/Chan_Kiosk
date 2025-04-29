package kiosk.lv5;

import java.util.Scanner;

public class MenuItem {

    private final Scanner scanner = new Scanner(System.in);
    private final Menu menuList = new Menu();
    private char userText;

    public void addMenu() {
        menuList.addBurgerMenu();
        menuList.addDrinkMenu();
        menuList.addDessertMenu();
    }

    public void bugerList() {
        System.out.println("\n[ BURGER MENU ]");

        for (int i = 0; i < menuList.getBurgerMenu().size(); i++) {
            System.out.println((i + 1) + ". " + menuList.getBurgerMenu().get(i));
        }
        System.out.println("0. 뒤로가기   |   뒤로가기\n");

        System.out.print("원하는 번호를 입력해주세요. (처음 입력한 숫자만 인식합니다.): ");
        userText = scanner.next().charAt(0);

        while (true) {
            switch (userText) {
                case '1' -> System.out.println("\n선택한 제품: " + menuList.getBurgerMenu().get(0) + "\n");
                case '2' -> System.out.println("\n선택한 제품: " + menuList.getBurgerMenu().get(1) + "\n");
                case '3' -> System.out.println("\n선택한 제품: " + menuList.getBurgerMenu().get(2) + "\n");
                case '4' -> System.out.println("\n선택한 제품: " + menuList.getBurgerMenu().get(3) + "\n");
                case '0' -> System.out.println("\n메인 화면으로 돌아갑니다.\n");
                default -> System.out.print("\n잘못된 입력입니다.\n");
            }
            if (userText == '0') {
                break;
            } else {
                System.out.print("계속 하시려면 아무거나 입력해주세요. 메인 화면으로 돌아갑니다.: ");
                userText = scanner.next().charAt(0);
                break;
            }
        }
    }

    public void drinkList() {
        System.out.println("\n[ DRINK MENU ]");

        for (int i = 0; i < menuList.getDrinkMenu().size(); i++) {
            System.out.println((i + 1) + ". " + menuList.getDrinkMenu().get(i));
        }
        System.out.println("0. 뒤로가기   |   뒤로가기\n");

        System.out.print("원하는 번호를 입력해주세요. (처음 입력한 숫자만 인식합니다.): ");
        userText = scanner.next().charAt(0);

        while (true) {
            switch (userText) {
                case '1' -> System.out.println("\n선택한 제품: " + menuList.getDrinkMenu().get(0) + "\n");
                case '2' -> System.out.println("\n선택한 제품: " + menuList.getDrinkMenu().get(1) + "\n");
                case '3' -> System.out.println("\n선택한 제품: " + menuList.getDrinkMenu().get(2) + "\n");
                case '4' -> System.out.println("\n선택한 제품: " + menuList.getDrinkMenu().get(3) + "\n");
                case '0' -> System.out.println("\n메인 화면으로 돌아갑니다.\n");
                default -> System.out.print("\n잘못된 입력입니다.\n");
            }
            if (userText == '0') {
                break;
            } else {
                System.out.print("계속 하시려면 아무거나 입력해주세요. 메인 화면으로 돌아갑니다.: ");
                userText = scanner.next().charAt(0);
                break;
            }
        }
    }

    public void dessertList() {
        System.out.println("\n[ DESSERT MENU ]");

        for (int i = 0; i < menuList.getDessertMenu().size(); i++) {
            System.out.println((i + 1) + ". " + menuList.getDessertMenu().get(i));
        }
        System.out.println("0. 뒤로가기   |   뒤로가기\n");

        System.out.print("원하는 번호를 입력해주세요. (처음 입력한 숫자만 인식합니다.): ");
        userText = scanner.next().charAt(0);

        while (true) {
            switch (userText) {
                case '1' -> System.out.println("\n선택한 제품: " + menuList.getDessertMenu().get(0) + "\n");
                case '2' -> System.out.println("\n선택한 제품: " + menuList.getDessertMenu().get(1) + "\n");
                case '3' -> System.out.println("\n선택한 제품: " + menuList.getDessertMenu().get(2) + "\n");
                case '4' -> System.out.println("\n선택한 제품: " + menuList.getDessertMenu().get(3) + "\n");
                case '0' -> System.out.println("\n메인 화면으로 돌아갑니다.\n");
                default -> System.out.print("\n잘못된 입력입니다.\n");
            }
            if (userText == '0') {
                break;
            } else {
                System.out.print("계속 하시려면 아무거나 입력해주세요. 메인 화면으로 돌아갑니다.: ");
                userText = scanner.next().charAt(0);
                break;
            }
        }
    }
}
// lv5 1차 수정










