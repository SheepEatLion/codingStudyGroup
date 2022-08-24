package src.jinwoo;

import java.util.Hashmap;
import java.util.Map;
import java.util.Scanner;
/**
 * 8월 22일(월) 부터 8월 28일 (일)
 */

public class VendingMachine {
    public static void main(String[] args) {
        Map<String, int> item = new HashMap<String, int>();
        item.put("Coca_Cola", "1300");
        item.put("Sprite", "1100");
        item.put("Water", "500");
        item.put("Coffee", "800");
        item.put("Juice", "700");

        N1 = 10;
        N2 = 12;
        N3 = 43;
        N4 = 64;
        N5 = 23;

        int Cash = 0;

        Scanner sc = new Scanner(System.in);



        do{
            System.out.print(주문 하시겠습니까?);
            ans = scan.nextInt();

            if(ans == "no"){
                System.out.print("END");
                break;
            }
        }
            while((N1>0) || (N2>0) || (N3>0) || (N4>0) || (N5>0)
        ){
                Cash = sc.nextInt();
                System.out.print(Cash + "만큼 있습니다.");
                System.out.print("아이템을 선택하세요 1.Coca_cola 2.Sprite 3. Water 4. Coffee 5. Juice");
                select = sc.next();
                System.out.print("당신은 " + select + "를 선택하셨습니다");

                if(select == "Coca_cola"){
                    if(Cash >= map.get(select)){
                        Cash - map.get(select);
                        N1 = N1-1;
                        System.out.print(select + "를 구매하셨습니다");
                    }
                    else{
                        System.out.print("돈이 부족합니다");
                        System.out.print(Cash + "원이 반환되었습니다");
                        Cash = Cash - Cash;
                    }
                }

                else if(select == "Sprite"){
                    if(Cash >= map.get(select)){
                        Cash - map.get.(select);
                        N2 = N2 - 1;
                        System.out.print(select + "를 구매하셨습니다");
                    }
                    else{
                        System.out.print("돈이 부족합니다");
                        System.out.print(Cash + "원이 반환되었습니다");
                        Cash = Cash - Cash;
                    }
                }

                else if(select == "Water"){
                    if(Cash >= map.get(select)){
                        Cash - map.get.(select);
                        N3 = N3 - 1;
                        System.out.print(select + "를 구매하셨습니다");
                    }
                    else{
                        System.out.print("돈이 부족합니다");
                        System.out.print(Cash + "원이 반환되었습니다");
                        Cash = Cash - Cash;
                    }
                }
                else if(select == "Coffee"){
                    if(Cash >= map.get(select)){
                        Cash - map.get.(select);
                        N4 = N4 - 1;
                        System.out.print(select + "를 구매하셨습니다");
                    }
                    else{
                        System.out.print("돈이 부족합니다");
                        System.out.print(Cash + "원이 반환되었습니다");
                        Cash = Cash - Cash;
                    }
                }
                else if(select == "Juice"){
                    if(Cash >= map.get(select)){
                        Cash - map.get.(select);
                        N5 = N4 - 1;
                        System.out.print(select + "를 구매하셨습니다");
                    }
                    else{
                        System.out.print("돈이 부족합니다");
                        System.out.print(Cash + "원이 반환되었습니다");
                        Cash = Cash - Cash;
                    }
                }


        }
    }
}
