public class Cactus extends Plant{

    public Cactus(String name, double height) {
        super(name, height);
    }
    String fluid = "Mineralvatten";
    String type = "Cactus";

    public double getVolume() {//Räknar ut mängden vätska plantan ska ha per dag.
        return 0.2;
    }
    public String getFluid() {
        return fluid;
    }
    public String getType() {
        return type;
    }
}