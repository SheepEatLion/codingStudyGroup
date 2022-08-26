package src.junyeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 8월 22일(월) 부터 8월 28일 (일)
 */

public class VendingMachine {
    public static void main(String[] args) {
        Integer[] itemAmount = {5, 10, 20, 15, 7};    // 각 아이템의 재고 선언
        Integer[] price = {2000, 100, 500, 3500, 1000};     // 각 아이템의 가격 선언
        Integer coin = null;    // 사용자에게 입력받을 금액

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   // 사용자 입력기

        while(true){
            if(userWantPlay(reader)) break;
            coin = insertCoin(coin, reader);
            Integer selectedItem = selectItem(reader);
            Integer payResult = pay(coin, itemAmount, price, selectedItem);
            coin = backCoin(payResult);

        }
    }

    public static boolean userWantPlay(BufferedReader reader){
        try {
            System.out.println("주문하시겠습니까?");
            String answer = reader.readLine();
            return answer.equals("n");  // 거절이면 트루를 리턴한다.
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Integer insertCoin(Integer coin, BufferedReader reader){
        try {
            System.out.println("동전을 투입하세요.");
            String answer = reader.readLine();
            return Integer.parseInt(answer);    // 입력받은 동전을 리턴한다.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Integer selectItem(BufferedReader reader){
        String answer = null;
        try {
            System.out.println("원하시는 물건을 선택하세요.");
            System.out.println("1.콜라 2.사이다 3.사과주스 4.쿠키 5.맥주");
            answer = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Integer.parseInt(answer) - 1;        // 배열은 0번부터 사용함으로 1을 빼주고 리턴한다.

    }

    public static Integer pay(Integer coin, Integer[] itemAmount, Integer[] price, Integer selectedItem){
        if(itemAmount[selectedItem] <= 0){
            System.out.println("선택하신 물건의 수량이 부족합니다.");
            return coin;
        }
        if(price[selectedItem] > coin){
            System.out.println("투입하신 요금이 부족합니다.");
            return coin;
        }
        itemAmount[selectedItem] -= 1;  // 수량 차감
        coin -= price[selectedItem];    // 요금 차감
        return coin;
    }

    public static Integer backCoin(Integer payResult){
        System.out.printf("잔액 %d원을 반환합니다.%n감사합니다.%n", payResult);
        return 0;   // 투입된 요금을 0 으로 초기화
    }

}
