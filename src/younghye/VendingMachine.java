package src.younghye;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 8월 22일(월) 부터 8월 28일 (일)
 */

// 1. 재고설정 = 아이템을 각각 몇 개씩 있게 하기
// 2. item 1 = 10;

// <조건>
// 1. "주문 하시겠습니까? 입력 yes no
// 2. 동전 입력받기
// 3. 아이템 선택하기
// 4. 아이템의 가격과 현재 투입된 동전을 비교하기
// 살 수 있으면 구매처리 -> 내가 투입한 동전에서 아이템 값과 재고를 - 하기
// 살 수 없으면 "돈이 부족합니다."
// 남은돈 반환 "n원이 반환되었습니다" 투입된 돈은 0처리
public class Study1 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>(); // 메뉴
        map.put("초코송이", 1500);
        map.put("칸초", 1000);
        map.put("홈런볼", 2500);
        map.put("칙촉", 2000);
        map.put("몽쉘", 3000);

        HashMap<String, Integer> stockmap = new HashMap<>(); // 재고설정
        stockmap.put("초코송이", 11);
        stockmap.put("칸초", 3);
        stockmap.put("홈런볼", 7);
        stockmap.put("칙촉", 16);
        stockmap.put("몽쉘", 10);

        while (true) {
            System.out.print("주문 하시겠습니까?\n" + "Yes OR No : "); // 1
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();

            if (answer.equals("Yes")) {
                System.out.print("금액을 입력해주세요 : "); // 2
                int coin = sc.nextInt();

                while (coin > 10000) {
                    System.out.print("10000원 이하의 금액을 넣어주세요");
                    coin = sc.nextInt();
                }
                if (coin <= 10000) {
                    System.out.println("아이템을 골라주세요"); // 3
                    System.out.println(map.keySet());
                    System.out.println("5개 중에 하나를 골라주세요 : ");
                    String item = sc.next();
                    // System.out.println("아이템을 몇개 구매하실지 숫자를 입력해주세요: ");
                    //int stock = sc.nextInt();

                    if (map.get(item) <= coin) {
                        int newStock = stockmap.get(item) - 1;
                        stockmap.put(item, newStock);
                        System.out.println("남은 돈" + (coin - map.get(item)) + "원 입니다");
                        break;

                    } else {
                        System.out.println("돈이 부족합니다.");

                    }
                }


                if (stockmap.get(stockmap) < 0) {
                    System.out.println("재고가 부족합니다");
                    continue;



                }
            }
            if (answer.equals("No")) {
                System.out.print("프로그램을 종료합니다."); // 1
            }


        }
    }
}
