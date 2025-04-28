package kiosk.lv5;

public class BugerItem {

    private String menuName;
    private String price;
    private String menuAccount;

    public String shackBurger() {
        menuName = "shackBurger  ";
        price = " | W 6.9 | ";
        menuAccount = "토마토, 양상추, 쉑소스가 토핑된 치즈버거";
        return menuName + price + menuAccount;
    }

    public String smokeShack() {
        menuName = "SmokeShack   ";
        price = " | W 8.9 | ";
        menuAccount = "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거";
        return menuName + price + menuAccount;
    }

    public String cheeseburger() {
        menuName = "Cheeseburger ";
        price = " | W 6.9 | ";
        menuAccount = "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거";
        return menuName + price + menuAccount;
    }

    public String hamburger() {
        menuName = "Hamburger    ";
        price = " | W 5.4 | ";
        menuAccount = "비프패티를 기반으로 야채가 들어간 기본버거";
        return menuName + price + menuAccount;
    }
}
