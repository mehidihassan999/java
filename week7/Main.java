
public class Main {
    public static void main(String[] args) {

        Appliance washingMachine = new WashingMachine("LG");
        Appliance refrigerator = new Refrigerator("Panasonic");

        washingMachine.displayBrand();
        washingMachine.turnOn();
        washingMachine.operate();
        washingMachine.turnOff();

        System.out.println();

        refrigerator.displayBrand();
        refrigerator.turnOn();
        refrigerator.operate();
        refrigerator.turnOff();

        System.out.println();

   
        Appliance airConditioner = new AirConditioner("Daikin");
        Appliance microwave = new Microwave("Samsung");

        airConditioner.displayBrand();
        airConditioner.turnOn();
        airConditioner.operate();
        airConditioner.turnOff();

        System.out.println();

        microwave.displayBrand();
        microwave.turnOn();
        microwave.operate();
        microwave.turnOff();
    }
}