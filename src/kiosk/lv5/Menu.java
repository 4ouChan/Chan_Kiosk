package kiosk.lv5;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    // 각 카테고리별로 인스턴스화
    private final BugerItem bugerItem = new BugerItem();
    private final DrinkItem drinkItem = new DrinkItem();
    private final DessertItem dessertItem = new DessertItem();

    // 각 카테고리별로 컬렉션 생성
    private final List<String> burgerMenu = new ArrayList<>();
    private final List<String> drinkMenu = new ArrayList<>();
    private final List<String> dessertMenu = new ArrayList<>();

    // 카테고리 목록을 보여주는 기능
    public void mainList() {
        System.out.println("[ MENU LIST ]");
        System.out.println("1. Burgers");
        System.out.println("2. Drinks");
        System.out.println("3. Desserts");
        System.out.println("0. 종료   |   종료\n");
    }

    // burgerMenu컬렉션에 값을 할당하는 기능
    public List<String> addBurgerMenu() {
        burgerMenu.add(bugerItem.shackBurger());
        burgerMenu.add(bugerItem.smokeShack());
        burgerMenu.add(bugerItem.cheeseburger());
        burgerMenu.add(bugerItem.hamburger());
        return burgerMenu;
    }

    // drinkMenu컬렉션에 값을 할당하는 기능
    public void addDrinkMenu() {
        drinkMenu.add(drinkItem.cokaCola());
        drinkMenu.add(drinkItem.sprite());
        drinkMenu.add(drinkItem.fanta());
        drinkMenu.add(drinkItem.pepsi());
    }

    // dessertMenu컬렉션에 값을 할당하는 기능
    public void addDessertMenu() {
        dessertMenu.add(dessertItem.frenchFries());
        dessertMenu.add(dessertItem.onionRing());
        dessertMenu.add(dessertItem.mozzarellaSticks());
        dessertMenu.add(dessertItem.iceCreamCone());
    }

    // 캡슐화한 컬렉션에 접근할 수 있는 게터
    public List<String> getBurgerMenu() {
        return burgerMenu;
    }

    // 캡슐화한 컬렉션에 접근할 수 있는 게터
    public List<String> getDrinkMenu() {
        return drinkMenu;
    }

    // 캡슐화한 컬렉션에 접근할 수 있는 게터
    public List<String> getDessertMenu() {
        return dessertMenu;
    }

}
