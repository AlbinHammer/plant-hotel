//Arv: MeatEatingPlant ärver från Plant
public class MeatEatingPlant extends Plant{
    private static final String TYPE = "Köttätande växt";
    private static final double BASE_VOLUME = 0.1;
    private static final double VOLUME_PER_METER = 0.2;

    public MeatEatingPlant(String name, double height) {
        super(name, height, TYPE, Fluids.PROTEIN_DRINK);
    }

    //Polymorfism: egen version av getVolume()
    @Override
    public double getVolume() {//Räknar ut mängden vätska plantan ska ha per dag.
    return  BASE_VOLUME + (VOLUME_PER_METER * getHeight());
    }

}