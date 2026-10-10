public abstract class Plant implements Waterable {
    private final String name;//Inkapsling
    private final double height;
    private final String type;
    private final Fluids fluid;

    public Plant(String name, double height, String type, Fluids fluid) { //Konstruktor som fångar upp felaktig inmatning för höjden.
        if(height<0) {
            System.out.println("Felaktig inmatning, höjden måste vara positiv");
        }
        this.name = name;
        this.height = height;
        this.type = type;
        this.fluid = fluid;
    }

    public String getName() {
        return name;
    }
    public double getHeight()
    {
        return height;
    }
    public String getType() {
        return type;
    }

    @Override
    public String getFluid() {
        return fluid.getName();
    }

    @Override
    public abstract double getVolume();//Polymorfism

}
