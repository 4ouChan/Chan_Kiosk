package kiosk.lv4;

import java.util.Scanner;

public class Kiosk implements Runnable {
    @Override
    public void run() {

        Scanner scanner = new Scanner(System.in);

        Menu menuList = new Menu();
        menuList.addBurgerMenu();
        menuList.addDrinkMenu();
        menuList.addDessertMenu();

        char userText = 'K';

        while (true) {

            System.out.println("[ MENU LIST ]");
            System.out.println("1. Burgers");
            System.out.println("2. Drinks");
            System.out.println("3. Desserts");
            System.out.println("0. 종료   |   종료\n");

            System.out.print("원하는 번호를 입력해주세요. (처음 입력한 숫자만 인식합니다.): ");
            userText = scanner.next().charAt(0);

            if (userText == '0') {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (userText == '1') {

                System.out.println("\n[ BURGER MENU ]");

                for (int i = 0; i < menuList.burgerMenu.size(); i++) {
                    System.out.println((i + 1) + ". " + menuList.burgerMenu.get(i));
                }
                System.out.println("0. 뒤로가기   |   뒤로가기\n");

                System.out.print("원하는 번호를 입력해주세요. (처음 입력한 숫자만 인식합니다.): ");
                userText = scanner.next().charAt(0);

                while (userText != '0') {
                    switch (userText) {
                        case '1' -> System.out.println("\n선택한 제품: " + menuList.burgerMenu.get(0) + "\n");
                        case '2' -> System.out.println("\n선택한 제품: " + menuList.burgerMenu.get(1) + "\n");
                        case '3' -> System.out.println("\n선택한 제품: " + menuList.burgerMenu.get(2) + "\n");
                        case '4' -> System.out.println("\n선택한 제품: " + menuList.burgerMenu.get(3) + "\n");
                        case '0' -> System.out.println("\n메인 화면으로 돌아갑니다.");
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

            if (userText == '2') {

                System.out.println("\n[ DRINK MENU ]");

                for (int i = 0; i < menuList.drinkMenu.size(); i++) {
                    System.out.println((i + 1) + ". " + menuList.drinkMenu.get(i));
                }
                System.out.println("0. 뒤로가기   |   뒤로가기\n");

                System.out.print("원하는 번호를 입력해주세요. (처음 입력한 숫자만 인식합니다.): ");
                userText = scanner.next().charAt(0);

                while (userText != '0') {
                    switch (userText) {
                        case '1' -> System.out.println("\n선택한 제품: " + menuList.drinkMenu.get(0) + "\n");
                        case '2' -> System.out.println("\n선택한 제품: " + menuList.drinkMenu.get(1) + "\n");
                        case '3' -> System.out.println("\n선택한 제품: " + menuList.drinkMenu.get(2) + "\n");
                        case '4' -> System.out.println("\n선택한 제품: " + menuList.drinkMenu.get(3) + "\n");
                        case '0' -> System.out.println("\n메인 화면으로 돌아갑니다. ");
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


            if (userText == '3') {

                System.out.println("\n[ DESSERT MENU ]");

                for (int i = 0; i < menuList.dessertMenu.size(); i++) {
                    System.out.println((i + 1) + ". " + menuList.dessertMenu.get(i));
                }
                System.out.println("0. 뒤로가기   |   뒤로가기\n");

                System.out.print("원하는 번호를 입력해주세요. (처음 입력한 숫자만 인식합니다.): ");
                userText = scanner.next().charAt(0);

                while (userText != '0') {
                    switch (userText) {
                        case '1' -> System.out.println("\n선택한 제품: " + menuList.dessertMenu.get(0) + "\n");
                        case '2' -> System.out.println("\n선택한 제품: " + menuList.dessertMenu.get(1) + "\n");
                        case '3' -> System.out.println("\n선택한 제품: " + menuList.dessertMenu.get(2) + "\n");
                        case '4' -> System.out.println("\n선택한 제품: " + menuList.dessertMenu.get(3) + "\n");
                        case '0' -> System.out.println("\n메인 화면으로 돌아갑니다. ");
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
}

