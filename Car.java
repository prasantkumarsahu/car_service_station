public class Car {
    private int basicServicing;
    private int engineFixing;
    private int clutchFixing;
    private int brakeFixing;
    private int gearFixing;

    public Car(int basicServicing, int engineFixing, int clutchFixing, int brakeFixing, int gearFixing) {
        this.basicServicing = basicServicing;
        this.engineFixing = engineFixing;
        this.clutchFixing = clutchFixing;
        this.brakeFixing = brakeFixing;
        this.gearFixing = gearFixing;
    }

    public int getBasicServicing() {
        return basicServicing;
    }

    public void setBasicServicing(int basicServicing) {
        this.basicServicing = basicServicing;
    }

    public int getEngineFixing() {
        return engineFixing;
    }

    public void setEngineFixing(int engineFixing) {
        this.engineFixing = engineFixing;
    }

    public int getClutchFixing() {
        return clutchFixing;
    }

    public void setClutchFixing(int clutchFixing) {
        this.clutchFixing = clutchFixing;
    }

    public int getBrakeFixing() {
        return brakeFixing;
    }

    public void setBrakeFixing(int brakeFixing) {
        this.brakeFixing = brakeFixing;
    }

    public int getGearFixing() {
        return gearFixing;
    }

    public void setGearFixing(int gearFixing) {
        this.gearFixing = gearFixing;
    }

    
}
