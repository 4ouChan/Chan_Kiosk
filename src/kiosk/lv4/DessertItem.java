package kiosk.lv4;

public class DessertItem {

    private String menuName;
    private String price;
    private String menuAccount;

    public String frenchFries() {
        menuName = "French Fries      ";
        price = " | W 4.5 | ";
        menuAccount = "갓 튀겨 나온 감자튀김";
        return menuName + price + menuAccount;
    }

    public String onionRing() {
        menuName = "Onion Ring        ";
        price = " | W 3.5 | ";
        menuAccount = "달짝지근한 어니언 링";
        return menuName + price + menuAccount;
    }

    public String mozzarellaSticks() {
        menuName = "Mozzarella Sticks ";
        price = " | W 3.0 | ";
        menuAccount = "치즈가 쭈욱 늘어나는 치즈스틱";
        return menuName + price + menuAccount;
    }

    public String iceCreamCone() {
        menuName = "Ice Cream Cone    ";
        price = " | W 2.0 | ";
        menuAccount = "향긋한 바닐라향의 아이스크림";
        return menuName + price + menuAccount;
    }
}
