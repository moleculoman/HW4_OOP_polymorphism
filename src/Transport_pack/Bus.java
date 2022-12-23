package Transport_pack;

//Задание 2
public class Bus extends Transport implements Competing {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public String startMoving() {
        return super.startMoving();
    }

    @Override
    public String stopMoving() {
        return super.stopMoving();
    }

    @Override
    public String takePitStop() {
        return takePitStop().toString();
    }

    @Override
    public String bestLapTime() {
        return bestLapTime().toString();
    }

    @Override
    public String maxSpeed() {
        return maxSpeed().toString();
    }
}
