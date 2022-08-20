package testJava;

public class Person {

    public String name;
    public int age;
    public String car_possession;

    public void buy(){
        Car car = new Car();
        System.out.println("car를 구매하셨습니다");
    }

}
