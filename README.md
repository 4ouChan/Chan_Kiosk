# 클래스 다이어그램

<details><summary>클래스 다이어그램</summary>
<p>

<details><summary>Lv.1</summary>
<img src="https://github.com/user-attachments/assets/9bcdf30d-aa02-4a90-96bd-1d81f75f4107" width="200" heigth="250" /> 
</details>

<details><summary>Lv.2</summary>
<img src="https://github.com/user-attachments/assets/f6ce6aa5-ac2d-4994-8baf-b99c8e628a3b" width="200" heigth="250" />
</details>

<details><summary>Lv.3</summary>
<img src="https://github.com/user-attachments/assets/32b6d4cd-891f-4424-8f9d-4559a072db3b" width="200" heigth="250" />
</details>

<details><summary>Lv.4</summary>
<img src="https://github.com/user-attachments/assets/a0610d9c-13c3-42a4-bfec-2385d9e082bc" width="200" heigth="250" />
</details>

<details><summary>Lv.5</summary>
<img src="https://github.com/user-attachments/assets/16fa919c-75ea-4060-9b1b-a636bfa28ed9" width="200" heigth="250" /> 
</details>
</details>

# 키오스크 만들기 개요
+ 키오스크 만들기를 1단계부터 5단계까지 단계별로 진행했습니다.
  우선 손이 가는대로 작성하며 요구하는 기능을 구현하는것에 힘썼습니다.
+ `Java`, `IntelliJ`

## Lv.1 설명
+ 스캐너와 조건문, 반복문을 사용해 햄버거 메뉴 출력 및 선택하기

하나의 클래스에서 1단계를 끝내고자 했고, 메인 메서드 외부(메인 클래스 내부)에 `burgerName`, `price`, `burgerAccount`를 속성으로 선언하고, 메뉴별 출력 기능을 생성하여, 메인 메서드 내부에서 사용했습니다.

## Lv.2 설명
+ `MenuItem`클래스를 생성하고, 메뉴를 `List`로 관리하기

앞서 1단계를 진행하며, 메인 메서드 외부에 만들어둔것들을 그대로 생성한 클래스로 옮겨 사용했습니다. 이 후 메인 클래스에서 메뉴를 담을 리스트를 생성한 후, 옮겨둔 기능을 불러와 리스트에 값을 할당했습니다.

## LV.3 설명
+ `Kiosk`클래스를 생성하여 프로그램 관리 및 사용자 입력을 처리하기

`Kiosk`클래스를 생성하고, `Runnable`인터페이스를 이용해 실행할 내용을 메인 클래스에 있던 내용 그대로 옮겨왔습니다. 이 후 메인 클래스에서 `Thread`를 인스턴스화 시킨 후 `Start`메서드를 사용했습니다.

## LV.4 설명
+ `Menuitem`을 관리할 `Menu`클래스를 생성하여 활용하기
+ 버거 메뉴 외에도 음료나, 디저트 메뉴 추가하기

`Menu`클래스를 생성하고, 버거, 음료, 디저트를 담을 컬렉션을 각각 선언하였습니다. 각각의 메뉴 또한 `BurgerItem`, `DrinkItem`, `DessertItem`
이렇게 세 가지 클래스로 나누어서 같은 양식으로 이름, 가격, 설명 부분만 바꾸어 사용했습니다.


## Lv.5 설명
+ 각 클래스 및 필드 캡슐화하여 직접 접근 제어하기

각 클래스의 필드를 `private`으로 선언하고, 게터를 활용하여 접근하는 방식으로 사용했습니다.  <br> 
여기까지 진행하고나서 코드 구조를 개선했습니다. 개선 내용은 블로그에 기재하였으므로, 블로그 링크를 남깁니다. <br> <br>
[구조 개선 사항] : https://velog.io/@4ou_chan/%ED%82%A4%EC%98%A4%EC%8A%A4%ED%81%AC-%EB%A7%8C%EB%93%A4%EA%B8%B0-%EA%B5%AC%EC%A1%B0-%EA%B0%9C%EC%84%A0


### 도전 기능 Lv.1 진행사항
장바구니를 추가하고, 장바구니에 추가한 내용을 출력하는 부분까지 구현하였습니다. 그러나 도중에 막혀 더이상 진행하지 못했습니다.
