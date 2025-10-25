package racingcar;

public abstract class Car {

    protected String carName;
    protected int totalDistance;

    public Car(String carName) {

        this.carName = carName;
    }

    public void move() {

        if(RandomNumberPicking.pickRandomNumber() >= 4) {
            //이동할 때마다 누적 거리를 계산
            System.out.println(carName);
            totalDistance = totalDistance + 1;
        }
    }

    public String getCarName() {

        return carName;
    }

    public int getTotalDistance() {

        return totalDistance;
    }

    public void stop() {

        //정의할 필요가 있나?
    }
}
