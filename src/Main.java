import Transport_pack.*;

public class Main {
    public static void main(String[] args) {

        /*
        Passenger_car ford = new Passenger_car("Ford", "Escape", 3.0);
        Passenger_car bmw = new Passenger_car("BMW", "3", 1.8);
        Passenger_car toyota = new Passenger_car("Toyota", "Corolla", 1.6);
        Passenger_car nissan = new Passenger_car("Nissan", "Murrano", 3.5);

        Cargo_car man = new Cargo_car("MAN", "TGX", 10.5);
        Cargo_car scania = new Cargo_car("SCANIA", "R-Series", 12);
        Cargo_car renault = new Cargo_car("Renault", "Magnum", 12.8);
        Cargo_car kenworth = new Cargo_car("KENWORTH", "T800", 11.0);

        Bus volkswagen = new Bus("Volkswagen", "Crafter", 2.0);
        Bus fiat = new Bus("Fiat", "Ducato", 2.3);
        Bus iveco = new Bus("Iveco", "Daily", 3.0);
        Bus peugeot = new Bus("Peugeot", "Boxer", 2.2);
        */


        Bus<Driver_D> anna1 = new Bus<>("Volkswagen", "Crafter", 2.0);
        Cargo_car<Driver_C> pavel1 = new Cargo_car<>("MAN", "TGX", 10.5);
        Passenger_car<Driver_B> alex1 = new Passenger_car<>("Nissan", "Murrano", 3.5);

        System.out.println(anna1.toString());
        System.out.println(pavel1.toString());
        System.out.println(alex1.toString());
    }
}