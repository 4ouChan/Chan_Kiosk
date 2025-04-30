package challengekiosk.lv1;

import java.util.Scanner;

public class MenuItem {

    private final Scanner scanner = new Scanner(System.in);
    private final Menu menuList = new Menu();

    String userSelectMenu;

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

    public void printMenuList(char userText) {
        if (userText == '1') {
            System.out.println("\n[ BURGER MENU ]");
            for (int i = 0; i < menuList.getBurgerMenu().size(); i++) {
                System.out.println((i + 1) + ". " + menuList.getBurgerMenu().get(i));
            }
        } else if (userText == '2') {
            System.out.println("\n[ DRINK MENU ]");
            for (int i = 0; i < menuList.getDrinkMenu().size(); i++) {
                System.out.println((i + 1) + ". " + menuList.getDrinkMenu().get(i));
            }
        } else if (userText == '3') {
            System.out.println("\n[ DESSERT MENU ]");
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
            switch (userText) {
                case '1' -> userSelectMenu = menuList.getBurgerMenu().get(0);
                case '2' -> userSelectMenu = menuList.getBurgerMenu().get(1);
                case '3' -> userSelectMenu = menuList.getBurgerMenu().get(2);
                case '4' -> userSelectMenu = menuList.getBurgerMenu().get(3);
                case '0' -> System.out.println("\n메인 화면으로 돌아갑니다.\n");
                default -> System.out.print("\n잘못된 입력입니다.\n");
            }
        } else if (userText == '2') {
            System.out.print("제품을 선택해주세요. (처음 입력한 번호만 인식합니다.): ");
            userText = scanner.next().charAt(0);
            switch (userText) {
                case '1' -> userSelectMenu = menuList.getDrinkMenu().get(0);
                case '2' -> userSelectMenu = menuList.getDrinkMenu().get(1);
                case '3' -> userSelectMenu = menuList.getDrinkMenu().get(2);
                case '4' -> userSelectMenu = menuList.getDrinkMenu().get(3);
                case '0' -> System.out.println("\n메인 화면으로 돌아갑니다.\n");
                default -> System.out.print("\n잘못된 입력입니다.\n");
            }
        } else if (userText == '3') {
            System.out.print("제품을 선택해주세요. (처음 입력한 번호만 인식합니다.): ");
            userText = scanner.next().charAt(0);
            switch (userText) {
                case '1' -> userSelectMenu = menuList.getDessertMenu().get(0);
                case '2' -> userSelectMenu = menuList.getDessertMenu().get(1);
                case '3' -> userSelectMenu = menuList.getDessertMenu().get(2);
                case '4' -> userSelectMenu = menuList.getDessertMenu().get(3);
                case '0' -> System.out.println("\n메인 화면으로 돌아갑니다.\n");
                default -> System.out.print("\n잘못된 입력입니다.\n");
            }
        }
    }
}
// 도전기능