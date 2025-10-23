package racingcar;

public abstract class Car {

    protected String carName;
    protected int totalDistance;

    public Car(String carName) {

        this.carName = carName;
    }

    public void move() {

        System.out.println(carName);
        totalDistance = totalDistance + 1;
    }

    public int getTotalDistance() {

        return totalDistance;
    }

    public void stop() {

        //정의할 필요가 있나?
    }
}
