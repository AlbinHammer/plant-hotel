public class MeateatingPlant extends Plant{


    public MeateatingPlant(String name, double height) {
        super(name, height, "Köttätande växt", Fluids.PROTEIN_DRINK);
    }

    @Override
    public double getVolume() {//Räknar ut mängden vätska plantan ska ha per dag.
    return  0.1 + (0.2 * getHeight());
    }

}