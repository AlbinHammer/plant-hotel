public class Demo {
    public static void main(String[] args) {
        Palm palm = new Palm("Laura", 5);
        MeateatingPlant mean = new MeateatingPlant("Meatloaf", 0.7);
        System.out.println("Namn: " + palm.getName() + "\nTyp: " + palm.getType() + "\nVätska: " +  palm.getFluid() + "\nMängd: " +  palm.getVolume() + " liter");
        System.out.println("Namn: " + mean.getName() + "\nTyp: " + mean.getType() + "\nVätska: " +  mean.getFluid() + "\nMängd: " +  mean.getVolume() + " liter");



    }

}
