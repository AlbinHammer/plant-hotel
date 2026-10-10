//Interface: Plant implementerar Waterable
public abstract class Plant implements Waterable {
    private static final double MIN_HEIGHT = 0;
    private static final String NEGATIVE_HEIGHT_MESSAGE = "Felaktig inmatning, höjden måste vara positiv";

    //Inkapsling: Fälter är privata och nås endast via getters
    private final String name;//Inkapsling
    private final double height;
    private final String type;
    private final Fluids fluid;

    public Plant(String name, double height, String type, Fluids fluid) { //Konstruktor som fångar upp felaktig inmatning för höjden.
        if(height<MIN_HEIGHT) {
            throw new IllegalArgumentException(NEGATIVE_HEIGHT_MESSAGE);
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
    public abstract double getVolume();// Varje subklass räknar ut sitt eget värde

}
