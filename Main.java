import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human();

        Car c1 = new Car("VOLVO");
        Car c2 = new Car("FERRARI");

        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("사람을 생성하세요 \n 이름을 입력하세요: ");
        h1.setName(sc.next());
        System.out.println("이름: " + h1.getName());
        System.out.println("나이를 입력해주세요: ");
        h1.setAge(sc.nextInt());
        System.out.println("나이는 : " + h1.getAge());

        System.out.println("차량을 구매하시겠습니까?\n Yes : 1 / No : 2");
        choice = sc.nextInt();

    }
}
