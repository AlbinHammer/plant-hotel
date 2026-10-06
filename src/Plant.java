public class Plant {
    private String name;//Inkapsling
    private double height;//Inkapsling

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }
    public double getHeight()
    {
        return height;
    }

    public double getVolume() {
        return 0;
    }
    public String getFluid() {
        return null;
    }
    public String getType() {
        return null;
    }

    /*@Override
    public String toString() {
        return "Namn: " +  name + " Längd: " + height;
    }*/
}
