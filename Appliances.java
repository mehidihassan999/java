public abstract class Appliance {

    protected String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Brand : " + brand);
    }

    public void turnOn() {
        System.out.println("Power ON");
    }

    public void turnOff() {
        System.out.println("Power OFF");
    }

    // Every appliance must define what "operating" means for it
    public abstract void operate();
}

// ---------- Given / template appliances ----------

class WashingMachine extends Appliance {
    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Washing clothes...");
    }
}

class Refrigerator extends Appliance {
    public Refrigerator(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Store food & beverages...");
    }
}

// ---------- Two additional appliances (Activity #2) ----------

class AirConditioner extends Appliance {
    public AirConditioner(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Cooling the room...");
    }
}

class Microwave extends Appliance {
    public Microwave(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Heating food...");
    }
}
