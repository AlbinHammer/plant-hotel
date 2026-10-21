import java.util.List;

public class ConsoleView {
    //Meny
    public void showMenu(List<Plant> plants) {
        System.out.println("Vilken växt ska få vätska?");
        System.out.println("---------------------------------");
        printPlants(plants);
        System.out.println("---------------------------------");
        System.out.println("Skriv (" + "avsluta" + ") för att avsluta");
        System.out.print("Skriv namn: ");
    }

    // Skriver ut namn och typ på objekten i listan
    public void printPlants(List<Plant> plants) {
        for (Plant plant : plants) {
            System.out.println(plant.getName() + "  (" + plant.getType() + ")");
        }
    }

    //Interface: Metoden tar emot allt som är Waterable och skriver ut mängd och typ av vätska
    public void printWateringInfo(Waterable item) {
        //Polymorfism: Ger rätt getVolume och getFluid beroende på objektets subklass
        System.out.println("ska ha: " + item.getVolume() + " liter " + item.getFluid() + ".\n");
    }
}
