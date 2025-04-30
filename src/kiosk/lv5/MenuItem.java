package kiosk.lv5;

import java.util.Scanner;

public class MenuItem {

    private final Scanner scanner = new Scanner(System.in);
    private final Menu menuList = new Menu();


    public void addMenu() {
        menuList.addBurgerMenu();
        menuList.addDrinkMenu();
        menuList.addDessertMenu();
    }

    // 카테고리 목록을 보여주는 기능
    public void mainList() {
        System.out.println("[ MENU LIST ]");
        System.out.println("1. Burgers");
        System.out.println("2. Drinks");
        System.out.println("3. Desserts");
        System.out.println("0. 종료   |   종료\n");
    }

    public void addTotalList(char userText) {
        System.out.println("\n[ BURGER MENU ]");
        if (userText == '1') {
            for (int i = 0; i < menuList.getBurgerMenu().size(); i++) {
                System.out.println((i + 1) + ". " + menuList.getBurgerMenu().get(i));
            }
        } else if (userText == '2') {
            for (int i = 0; i < menuList.getDrinkMenu().size(); i++) {
                System.out.println((i + 1) + ". " + menuList.getDrinkMenu().get(i));
            }
        } else if (userText == '3') {
            for (int i = 0; i < menuList.getDessertMenu().size(); i++) {
                System.out.println((i + 1) + ". " + menuList.getDessertMenu().get(i));
            }
        }
        System.out.println("0. 뒤로가기   |   뒤로가기\n");
    }



    public void selectMenu(char userText) {
        if (userText == '1') {
            System.out.print("제품을 선택해주세요. (처음 입력한 번호만 인식합니다.): ");
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
        } else if (userText == '2') {
            System.out.print("제품을 선택해주세요. (처음 입력한 번호만 인식합니다.): ");
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
        } else if (userText == '3') {
            System.out.print("제품을 선택해주세요. (처음 입력한 번호만 인식합니다.): ");
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
}
// lv5 구조 개선