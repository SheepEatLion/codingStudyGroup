package src2;
import java.util.*;
import java.util.Map.Entry;
import java.util.Map;
import java.util.HashMap;

public class vending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String,Integer>map = new HashMap<String,Integer>();
        map.put("별빛청하",2700);
        map.put("진로",1800);
        map.put("참이슬",1700);
        map.put("한라산",2100);
        map.put("자몽에이슬",1900);

        int coin;

        while(True) {
            System.out.println("주문 하시겠습니까? (yes or no 입력)");
            String ans;
            ans = sc.nextLine();

            if(ans == "yes") {
                System.out.println("동전을 넣어주세요".);
                coin = sc.nextInt();

                while(coin>10000){                            //마넌이하여야함
                    System.out.println("10000원 이하의 금액을 넣어주세요");
                    coin = sc.nextInt();

                    if(coin<=10000){
                        break;
                    }
                }

                System.out.println("아이템을 선택해주세요.");
                System.out.println("| 별빛청하 | 진로 | 참이슬 | 한라산 | 자몽에이슬 |");

                int item;
                item = sc.nextLine();
                for(Entry<String,Integer> entrySet : map.entrySet()){
                    //map에서 상품 찾기 , 찾은상품을 goods로 두기 /item은 사용자가 선택한 상품 //아직안함


                    if(coin==goods.values()) {
                        coin=coin-goods.values();
                        System.out.println("구매완료!");
                        System.out.println(coin+"원이 반환되었습니다.");
                        coin=0;
                    }
                    else if(coin<goods.values()) {
                        System.out.println("돈이 부족합니다.");
                    }


                }


            }
            else if(ans == "no"){
                break;
            }







        }





    }
}
