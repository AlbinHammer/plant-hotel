public class Cactus extends Plant{

    public Cactus(String name, double height) {
        super(name, height,  "Cactus", Fluids.MINERAL_WATER);
    }

    @Override
    public double getVolume() {//Räknar ut mängden vätska plantan ska ha per dag.
        return 0.02;
    }

}