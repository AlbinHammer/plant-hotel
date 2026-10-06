public class MeateatingPlant extends Plant{


    public MeateatingPlant(String name, double height) {
        super(name, height);
    }
    String type = "Köttätande växt";

    public double getVolume() {//Räknar ut mängden vätska plantan ska ha per dag.
    return  0.1 + (0.2 * getHeight());
    }
    public String getFluid() {
        return Fluids.PROTEIN_DRINK.getName();
    }
    public String getType() {
        return type;
    }
}