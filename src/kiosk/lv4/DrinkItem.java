package kiosk.lv4;

public class DrinkItem {

    // 메뉴 이름, 가격, 설명을 필드값으로 선언
    private String menuName;
    private String price;
    private String menuAccount;

    // 선언한 필드를 활용하여 각 메뉴에 맞는 이름, 가격, 설명을 설정해서 반환
    public String cokaCola() {
        menuName = "CokaCola  ";
        price = " | W 2.5 | ";
        menuAccount = "탄산이 기가막힌 코카콜라";
        return menuName + price + menuAccount;
    }

    public String sprite() {
        menuName = "Sprite    ";
        price = " | W 2.5 | ";
        menuAccount = "청량감이 끝내주는 스프라이트";
        return menuName + price + menuAccount;
    }

    public String fanta() {
        menuName = "Fanta     ";
        price = " | W 2.5 | ";
        menuAccount = "환타 오렌지, 환타 파인에플";
        return menuName + price + menuAccount;
    }

    public String pepsi() {
        menuName = "PepsiZero ";
        price = " | W 2.5 | ";
        menuAccount = "제로슈거 팹시 제로";
        return menuName + price + menuAccount;
    }
}
// lv4 끝