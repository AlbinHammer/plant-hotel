public class MeateatingPlant extends Plant{


    // Formel: en basnivå på 0,1 liter per dag plus 0,2 liter gånger längden i meter
    //Exempel: en köttätande växt som är 50 cm hög behöver 0,1 + (0,2 × 0,5) = 0,2 liter per dag
    public MeateatingPlant(String name, double height) {
        super(name, height);
    }
    String fluid = "Proteindryck";
    String type = "Köttätande växt";

    public double getVolume() {//Räknar ut mängden vätska plantan ska ha per dag.
    return  0.1 + (0.2 * getHeight());
    }
    public String getFluid() {
        return fluid;
    }

    public String getType() {
        return type;
    }
}