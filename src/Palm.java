public class Palm extends Plant{

    public Palm(String name, double height) {
        super(name, height);
    }
    String fluid = "Kranvatten";
    String type = "Palm";


    public double getVolume() { //Räknar ut mängden vätska plantan ska ha per dag.
    return 0.5 * getHeight();
    }
    public String getFluid() {
        return fluid;
    }
    public String getType() {
        return type;
    }
}
