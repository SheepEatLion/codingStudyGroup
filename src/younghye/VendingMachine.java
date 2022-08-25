package src.younghye;
import java.util.HashMap;
import java.util.Scanner;


/**
 * 8월 22일(월) 부터 8월 28일 (일)
 */

public class study1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("초코송이", 1500);
        map.put("칸초", 1000);
        map.put("홈런볼", 2500);
        map.put("칙촉", 2000);
        map.put("몽쉘", 3000);

        HashMap<String, Integer> stockmap = new HashMap<>();
        stockmap.put("초코송이", 11);
        stockmap.put("칸초", 3);
        stockmap.put("홈런볼", 7);
        stockmap.put("칙촉", 16);
        stockmap.put("몽쉘", 10);

        while (true) {
            System.out.print("주문 하시겠습니까?\n" + "Yes OR No : ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();

            if(answer.equals("Yes") ) {
                System.out.print("금액을 입력해주세요 : ");
                int coin = sc.nextInt();

                while (coin > 10000) {
                    System.out.print("10000원 이하의 금액을 넣어주세요");
                    coin = sc.nextInt();
                }
                if (coin <= 10000){
                    System.out.println("아이템을 골라주세요");
                    System.out.println(map.keySet());
                    System.out.println("5개 중에 하나를 골라주세요 : ");
                    String item = sc.nextLine();

                    if(map.get(item) < coin) {

                    }

                    if(stockmap.get(item)<0) {
                        System.out.println("재고가 부족합니다");
                        continue;
                    }

                }


            }

        }
    }
}
