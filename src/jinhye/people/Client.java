package src.jinhye.people;

public class Client {
    private String name;
    private int age;
    private int money=0;
    private String carname;

    public void setName(String name){
        this.name=name;
    };
    public void setAge(int age){
        this.age=age;
    };

    public String getName() {
        return name;
    }

    public void buyCar(String carname){
        this.carname=carname;
        System.out.print(this.carname+"을(를) 구매했다!");
    };

}
