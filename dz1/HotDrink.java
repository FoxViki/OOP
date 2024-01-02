package dz1;


public class HotDrink extends Product {
    
    private double volume;
    private double temperature;

    public HotDrink(String name, int cost, double volume, double temperature) {
        super(name, cost);
        this.volume = volume;
        this.temperature = temperature;
    }
    
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
            "name='" + super.getName() + '\'' +
            ", cost=" + super.getCost() +
            ", volume=" + volume +
            ", temperature=" + temperature +
            '}';
    }

}
