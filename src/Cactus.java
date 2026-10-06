public class Cactus extends Plant{

    public Cactus(String name, double height) {
        super(name, height);
    }
    String type = "Kaktus";

    public double getVolume() {//Räknar ut mängden vätska plantan ska ha per dag.
        return 0.2;
    }
    public String getFluid() {
        return Fluids.MINERAL_WATER.getName();
    }
    public String getType() {
        return type;
    }
}