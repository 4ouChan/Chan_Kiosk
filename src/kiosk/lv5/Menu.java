package kiosk.lv5;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    // 메뉴 생성 기능 사용을 위한 인스턴스화
    private final CreateItem createItem = new CreateItem();

    // 각 카테고리별로 컬렉션 생성
    private final List<String> burgerMenu = new ArrayList<>();
    private final List<String> drinkMenu = new ArrayList<>();
    private final List<String> dessertMenu = new ArrayList<>();



    // burgerMenu컬렉션에 값을 할당하는 기능
    public void addBurgerMenu() {
        burgerMenu.add(createItem.burgerItem("shackBurger  ", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.add(createItem.burgerItem("SmokeShack   ", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.add(createItem.burgerItem("Cheeseburger ", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.add(createItem.burgerItem("Hamburger    ", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    // drinkMenu컬렉션에 값을 할당하는 기능
    public void addDrinkMenu() {
        drinkMenu.add(createItem.drinkItem("CokaCola  ", 2.5, "탄산이 기가막힌 코카콜라"));
        drinkMenu.add(createItem.drinkItem("Sprite    ", 2.5, "청량감이 끝내주는 스프라이트"));
        drinkMenu.add(createItem.drinkItem("Fanta     ", 2.5, "환타 오렌지, 환타 파인에플"));
        drinkMenu.add(createItem.drinkItem("PepsiZero ", 2.5, "제로슈거 팹시 제로"));
    }

    // dessertMenu컬렉션에 값을 할당하는 기능
    public void addDessertMenu() {
        dessertMenu.add(createItem.dessertItem("French Fries      ", 4.5, "갓 튀겨 나온 감자튀김"));
        dessertMenu.add(createItem.dessertItem("Onion Ring        ", 3.5, "달짝지근한 어니언 링"));
        dessertMenu.add(createItem.dessertItem("Mozzarella Sticks ", 3.0, "치즈가 쭈욱 늘어나는 치즈스틱"));
        dessertMenu.add(createItem.dessertItem("Ice Cream Cone    ", 2.0, "향긋한 바닐라향의 아이스크림"));
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
// lv5 끝