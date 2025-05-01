package kiosk.lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    // 각 카테고리별로 인스턴스화
    BurgerItem bugerItem = new BurgerItem();
    DrinkItem drinkItem = new DrinkItem();
    DessertItem dessertItem = new DessertItem();

    // 각 카테고리별로 컬렉션 생성
    List<String> burgerMenu = new ArrayList<>();
    List<String> drinkMenu = new ArrayList<>();
    List<String> dessertMenu = new ArrayList<>();

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
}
// lv4 끝.