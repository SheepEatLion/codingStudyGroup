import java.util.Scanner;
public class na_young_park_dice {
    public static void main(String[] args) {
        while(true) {
            String op;
            Scanner input = new Scanner(System.in);
            System.out.println("주사위 게임 >> 게임을 진행하려면 yes를 진행 의사가 없으면 no를 입력하세요");
            op = input.nextLine();

            if(op.equals("yes")) {
                int i = (int)(Math.random() * 6) + 1;
                int j=(int)(Math.random()*6)+1;

                System.out.println("A의 숫자는 "+i+" B의 숫자는 "+j);
                if(i>j) {
                    System.out.println("승리자는 A");
                }else if(i==j) {
                    System.out.println("비겼습니다.");
                }else {
                    System.out.println("승리자는 B");
                }
            }
            if(op.equals("no")) {
                System.out.println("게임이 끝났습니다!");
                break;
            }
        }
    }
}
