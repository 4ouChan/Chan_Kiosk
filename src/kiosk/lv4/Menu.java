package kiosk.lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    BugerItem bugerItem = new BugerItem();
    DrinkItem drinkItem = new DrinkItem();
    DessertItem dessertItem = new DessertItem();

    List<String> burgerMenu = new ArrayList<>();
    List<String> drinkMenu = new ArrayList<>();
    List<String> dessertMenu = new ArrayList<>();

    public List<String> addBurgerMenu() {
        burgerMenu.add(bugerItem.shackBurger());
        burgerMenu.add(bugerItem.smokeShack());
        burgerMenu.add(bugerItem.cheeseburger());
        burgerMenu.add(bugerItem.hamburger());
        return burgerMenu;
    }

    public void addDrinkMenu() {
        drinkMenu.add(drinkItem.cokaCola());
        drinkMenu.add(drinkItem.sprite());
        drinkMenu.add(drinkItem.fanta());
        drinkMenu.add(drinkItem.pepsi());
    }

    public void addDessertMenu() {
        dessertMenu.add(dessertItem.frenchFries());
        dessertMenu.add(dessertItem.onionRing());
        dessertMenu.add(dessertItem.mozzarellaSticks());
        dessertMenu.add(dessertItem.iceCreamCone());
    }
}
