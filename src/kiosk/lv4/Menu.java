package kiosk.lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    MenuItem menuItem = new MenuItem();

    List<String> burgerMenu = new ArrayList<>();
    List<String> drinkMenu = new ArrayList<>();
    List<String> dessertMenu = new ArrayList<>();

    public List<String> addBurgerMenu() {
        burgerMenu.add(menuItem.shackBurger());
        burgerMenu.add(menuItem.smokeShack());
        burgerMenu.add(menuItem.cheeseburger());
        burgerMenu.add(menuItem.hamburger());
        return burgerMenu;
    }

    public List<String> addDrinkMenu() {
        drinkMenu.add(menuItem.cokaCola());
        drinkMenu.add(menuItem.sprite());
        drinkMenu.add(menuItem.fanta());
        drinkMenu.add(menuItem.pepsi());
        return drinkMenu;
    }

    public List<String> addDessertMenu() {
        dessertMenu.add(menuItem.frenchFries());
        dessertMenu.add(menuItem.onionRing());
        dessertMenu.add(menuItem.mozzarellaSticks());
        dessertMenu.add(menuItem.iceCreamCone());
        return dessertMenu;
    }

}
