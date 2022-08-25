package src.younghye;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 8월 22일(월) 부터 8월 28일 (일)
 */

public class VendingMachine {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("초코송이", 1500);
        map.put("칸초", 1000);
        map.put("홈런볼", 2500);
        map.put("칙촉", 2000);
        map.put("몽쉘", 3000);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("초코송이", 11);
        map.put("칸초", 3);
        map.put("홈런볼", 7);
        map.put("칙촉", 16);
        map.put("몽쉘", 10);

        while (true) {
            System.out.println("주문 하시겠습니까?\n" + "YES OR NO : ");
            Scanner sc = new Scanner(System.in);
            String answer;
            answer = sc.nextInt();

            if(answer = "YES") {
                System.out.println("금액을 입력해주세요");
                coin = sc.nextInt();

                if(coin > 10000) {
                    System.out.println("10000원 이하의 동전을 넣어주세요");
                    coin = sc.nextInt();
                }
                else {
                    break;
                }

                System.out.println("아이템을 골라주세요");
                System.out..print("1.초코송이 (1500원)", "2.칸초 (1000원)", "3.홈런볼 (2500원)", "4.칙촉 (2000원)", "5.몽쉘 (3000원)" )
            }

        }
    }
}
