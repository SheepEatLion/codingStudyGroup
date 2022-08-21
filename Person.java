package game;

public class Person {
    private String name;
    private int age;
    private String carPossession;

    private String act;
        public void setName(String name){
        this.name = name;
        }
        public void setAge(int age){
        this.age = age;
        }
        public void setCarPossession(String carPossession){
        this.carPossession = carPossession;
        }

        public void setAct(String Act){
            this.act = act;
        }

        public String getName(){
        return name;
        }

        public int getAge(){
            return age;
        }

        public String getCarPossession(){
            return carPossession;
        }

        public String getAct(){
            return act;
        }
    }