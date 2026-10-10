//Arv: Palm ärver från Plant
public class Palm extends Plant{
    private static final String TYPE = "Palm";
    private static final double VOLUME_PER_METER = 0.5;

    public Palm(String name, double height) {
        super(name, height, TYPE, Fluids.TAP_WATER);
    }

    //Polymorfism: egen version av getVolume()
    @Override
    public double getVolume() { //Räknar ut mängden vätska plantan ska ha per dag.
    return VOLUME_PER_METER * getHeight();
    }

}
