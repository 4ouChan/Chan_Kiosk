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
        burgerMenu.add(bugerItem.burgerItem("shackBurger  ", " | W 6.9 | ", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.add(bugerItem.burgerItem("SmokeShack   ", " | W 8.9 | ", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.add(bugerItem.burgerItem("Cheeseburger ", " | W 6.9 | ", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.add(bugerItem.burgerItem("Hamburger    ", " | W 5.4 | ", "비프패티를 기반으로 야채가 들어간 기본버거"));
        return burgerMenu;
    }

    // drinkMenu컬렉션에 값을 할당하는 기능
    public void addDrinkMenu() {
        drinkMenu.add(drinkItem.drinkItem("CokaCola  ", " | W 2.5 | ", "탄산이 기가막힌 코카콜라"));
        drinkMenu.add(drinkItem.drinkItem("Sprite    ", " | W 2.5 | ", "청량감이 끝내주는 스프라이트"));
        drinkMenu.add(drinkItem.drinkItem("Fanta     ", " | W 2.5 | ", "환타 오렌지, 환타 파인에플"));
        drinkMenu.add(drinkItem.drinkItem("PepsiZero ", " | W 2.5 | ", "제로슈거 팹시 제로"));
    }

    // dessertMenu컬렉션에 값을 할당하는 기능
    public void addDessertMenu() {
        dessertMenu.add(dessertItem.dessertItem("French Fries      ", " | W 4.5 | ", "갓 튀겨 나온 감자튀김"));
        dessertMenu.add(dessertItem.dessertItem("Onion Ring        ", " | W 3.5 | ", "달짝지근한 어니언 링"));
        dessertMenu.add(dessertItem.dessertItem("Mozzarella Sticks ", " | W 3.0 | ", "치즈가 쭈욱 늘어나는 치즈스틱"));
        dessertMenu.add(dessertItem.dessertItem("Ice Cream Cone    ", " | W 2.0 | ", "향긋한 바닐라향의 아이스크림"));
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
// lv5 1차 수정