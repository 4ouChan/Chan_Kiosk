package kiosk.lv2;

public class MenuItem {
    private String burgerName;
    private String price;
    private String burgerAccount;

    public String shackBurger() {
        burgerName = "shackBurger  ";
        price = " | W 6.9 | ";
        burgerAccount = "토마토, 양상추, 쉑소스가 토핑된 치즈버거";
        return burgerName + price + burgerAccount;
    }

    public String smokeShack() {
        burgerName = "SmokeShack   ";
        price = " | W 8.9 | ";
        burgerAccount = "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거";
        return burgerName + price + burgerAccount;
    }

    public String cheeseburger() {
        burgerName = "Cheeseburger ";
        price = " | W 6.9 | ";
        burgerAccount = "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거";
        return burgerName + price + burgerAccount;
    }

    public String hamburger() {
        burgerName = "Hamburger    ";
        price = " | W 5.4 | ";
        burgerAccount = "비프패티를 기반으로 야채가 들어간 기본버거";
        return burgerName + price + burgerAccount;
    }
}
// lv2 끝