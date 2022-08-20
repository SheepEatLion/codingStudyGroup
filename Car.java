public class Car {
    private String CarType;

    public Car (String carType) {
        super();
        CarType = carType;
    }

    public String getCarType() {
        return CarType;
    }

    public void setCarType (String carType) {
        CarType = carType;
    }

    void start() {
        System.out.println("차 출발!");
    }
    void stop() {
        System.out.println("차 정지!!");
    }
    @Override
    public String toString() {
        return CarType;
    }
}

