package src.jiwong;
import java.util.*;
import java.util.HashMap;

/**
 * 8월 22일(월) 부터 8월 28일 (일)
 */

public class VendingMachine {
    public static void main(String[] args) {
        HashMap<String, Integer> priceMap=new HashMap<>();//품목별 가격
        priceMap.put("Coke", 2000);
        priceMap.put("Pepsi", 1800);
        priceMap.put("Coffee", 2800);
        priceMap.put("Water", 800);
        HashMap<String, Integer> countMap=new HashMap<>();//품목별 재고
        countMap.put("Coke",3);
        countMap.put("Pepsi", 10);
        countMap.put("Coffee", 7);
        countMap.put("Water", 23);

        while(true){
            System.out.println("\n\n주문하시겠습니까?  yes/no");
            Scanner sc=new Scanner(System.in);
            String isOrder=sc.nextLine();

            if (isOrder.equals("yes") || isOrder.equals("Yes")){//주문을 하는 경우 본격적인 주문과정을 거친다.
                System.out.println("동전을 넣어주세요. 얼마를 넣을건가요?");
                int inputPrice=sc.nextInt();//입력받은 가격
                sc.nextLine();
                System.out.println("입력하신 금액은 총 "+inputPrice+"원 입니다. 어떤 아이템을 선택하시겠나요?");
                System.out.println(priceMap.keySet());
                String item=sc.nextLine();//구매할 아이템 이름

                if(countMap.get(item)<=0){//재고가 부족할 경우
                    System.out.println("재고가 부족합니다!");
                    continue;
                }
                if(priceMap.get(item)>inputPrice){//돈이 부족할 경우
                    System.out.println("돈이 부족합니다!");
                    continue;
                }
                //구매 가능한 경우
                int newCount=countMap.get(item)-1;
                countMap.put(item, newCount);
                System.out.println("거스름돈"+(inputPrice-priceMap.get(item))+"원이 반환되었습니다.");
                continue;
            } else if(isOrder.equals("no") || isOrder.equals("No")){
                continue;
            } else{
                System.out.println("옳지 않은 입력입니다");
                continue;
            }
        }
    }
}
