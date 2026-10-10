public class Palm extends Plant{

    public Palm(String name, double height) {
        super(name, height, "Palm", Fluids.TAP_WATER);
    }

    @Override
    public double getVolume() { //Räknar ut mängden vätska plantan ska ha per dag.
    return 0.5 * getHeight();
    }

}
