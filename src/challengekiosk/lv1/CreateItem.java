package challengekiosk.lv1;

public class CreateItem {

    // 메뉴를 생성하고, 합쳐주는 기능.
    public String burgerItem(String menuName, double price, String menuAccount){
        return menuName + "  " + " | W " +  price + " | " + menuAccount;
    }

    public String dessertItem(String menuName, double price, String menuAccount){
        return menuName + "  " + " | W " +  price + " | " + menuAccount;
    }

    public String drinkItem(String menuName, double price, String menuAccount){
        return menuName + "  " + " | W " +  price + " | " + menuAccount;
    }
}
// 도전기능