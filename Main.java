package testJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person per = new Person();
        System.out.print("이름을 입력하세요!");
        per.name=in.next();
        System.out.print("나이를 입력하세요!");
        per.age=in.nextInt();
        System.out.print("자동차 보유 여부를 입력하세요(Y/N)");
        per.car_possession=in.next();
        if(per.car_possession.equals("Y")){
            System.out.print("당신은 차를 구매하실 수 없습니다.");
        }
        else{
            Car car = new Car();
            System.out.print("사고싶은 자동차의 브랜드를 입력하세요");
            car.brand=in.next();
            System.out.print("사고싶은 자동차의 연식을 입력하세요");
            car.year=in.nextInt();
            Person buy = new Person();
            System.out.println(car.brand+"의 " +car.year+"년식 차를 구매하셨습니다");
        }
    }

}