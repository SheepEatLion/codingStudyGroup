package game;

import java.util.Scanner;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("[프로그램 시작]");
        System.out.println("캐릭터를 생성하세요!");
        Person person = new Person();
        System.out.print("이름을 입력하세요!");
        person.setName(in.next());
        System.out.print("나이를 입력하세요!");
        person.setAge(in.nextInt());
        System.out.print("자동차 보유 여부를 입력하세요(BMW/KIA/NO)");
        person.setCarPossession(in.next());
        System.out.print("1. 차 구매 2. 차고 가기 3. 탑승");
        person.setAct(in.next());
        BMW bmw = new BMW();
        KIA kia = new KIA();
        if(person.getAct().equals("1")) {
            if (person.getCarPossession().equals("NO")) {
                System.out.print("구매하시고 싶은 차를 선택하세요 1. BMW 2. KIA");
                int want = in.nextInt();
                if (want == 1) {
                    System.out.print("당신은 bmw를 구매하셨습니다!");
                        else{
                        System.out.print("당신은 kia를 구매하셨습니다!");
                    }
                }
            } else {
                System.out.print("당신은 차를 구매하실 수 없습니다!");
            }
        }
        else if(person.getAct().equals("2")){
            System.out.print(person.getCarPossession());
            }
        else{
            if (person.getCarPossession().equals("NO")) {
                System.out.print("가지고 있는 차가 없습니다.");
                else if (person.getCarPossession().equals("BMW")) {
                    System.out.print("1. 출발하기 2. 정지하기");
                    int do = in.nextInt();
                    if(do == 1){
                        bmw.start();
                    }
                    else{
                        bmw.stop();
                    }
                }
            }
                else{
                    System.out.print("1. 출발하기 2. 정지하기");
                    int do = in.nextInt();
                    if(do == 1){
                        kia.start();
                    }
                    else{
                        kia.stop();
                    }
                }
        }
    }

}