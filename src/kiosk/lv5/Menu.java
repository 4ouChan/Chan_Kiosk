package kiosk.lv5;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private final BugerItem bugerItem = new BugerItem();
    private final DrinkItem drinkItem = new DrinkItem();
    private final DessertItem dessertItem = new DessertItem();

    private final List<String> burgerMenu = new ArrayList<>();
    private final List<String> drinkMenu = new ArrayList<>();
    private final List<String> dessertMenu = new ArrayList<>();

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

    public List<String> getBurgerMenu() {
        return burgerMenu;
    }

    public List<String> getDrinkMenu() {
        return drinkMenu;
    }

    public List<String> getDessertMenu() {
        return dessertMenu;
    }

}
