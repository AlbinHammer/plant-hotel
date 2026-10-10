//Arv: Cactus ärver från Plant
public class Cactus extends Plant{
    private static final String TYPE = "Kaktus";
    private static final double BASE_VOLUME = 0.02;

    public Cactus(String name, double height) {
        super(name, height,  TYPE, Fluids.MINERAL_WATER);
    }

    //Polymorfism: egen version av getVolume()
    @Override
    public double getVolume() {//Räknar ut mängden vätska plantan ska ha per dag.
        return BASE_VOLUME;
    }

}