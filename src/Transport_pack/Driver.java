package Transport_pack;

public class Driver {
    private String fullName;
    private boolean isHaveLicense;
    private int experience;

    public Driver(String fullName, boolean isHaveLicense, int experience) {
        this.fullName = fullName;
        this.isHaveLicense = isHaveLicense;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public boolean isHaveLicense() {
        return isHaveLicense;
    }
    public void setHaveLicense(boolean haveLicense) {
        isHaveLicense = haveLicense;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String fuelTheCar() {
        return "Идет процесс заправки автомобиля";
    }

    public String startMoving(){
        return "Поехали!";
    }
    public String stopMoving(){
        return "Остановись!";
    }

    @Override
    public String toString() {
        return "Водитель{" +
                "с именем ='" + getFullName() + '\'' +
                ", управляет автомобилем =" + isHaveLicense +
                ", experience=" + getExperience() +
                '}';
    }
}
