package src.jiwong;

/**
 * 8월 29일(월) 부터 9월 3일 (토)
 */

class randomDice{
    int run(){
        return (int)((Math.random()*10000)%6)+1;
    }
}

public class DiceGame {
    public static void main(String[] args) {
        randomDice user1Dice=new randomDice();
        randomDice user2Dice=new randomDice();
        int num1, num2;
        while(true){
            System.out.println("\n\n게임하시겠습니까?  yes/no");//질의
            Scanner sc=new Scanner(System.in);
            String isPlay=sc.nextLine();

            if(isPlay.equals("no"))//탈출조건
                break;

            System.out.print("첫번째 사용자의 주사위는 ");
            num1=user1Dice.run();
            System.out.println(num1);

            System.out.print("두번째 사용자의 주사위는 ");
            num2= user2Dice.run();
            System.out.println(num2);

            if(num2>num1)
                System.out.println("두번째 플레이어의 승리입니다!\n");
            else if (num2<num1)
                System.out.println("첫번째 플레이어의 승리입니다!\n");
            else
                System.out.println("비겼습니다!\n");

        }
    }
}
