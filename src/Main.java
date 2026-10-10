import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    private static final PlantCollection plantCollection = new PlantCollection();

    public static void main(String[] args) {
        addPlant();//Lägger till objekten i arrayen
        try (Scanner scanner = new Scanner(System.in)) {//Visar meny samt hanterar användarens inmatningar.
            boolean running = true;
            while (running) {
                showMenu();
                running = handleChoice(scanner.nextLine());
            }
        } catch (NoSuchElementException e) {// Avlutar programmet vid EOF-kommando.
            System.out.println("Avslutar");
        }
    }

    //Meny
    private static void showMenu() {
        System.out.println("Vilken växt ska få vätska?");
        System.out.println("---------------------------------");
        plantCollection.printPlants();
        System.out.println("---------------------------------");
        System.out.println("Skriv (" + "avsluta" + ") för att avsluta");
        System.out.print("Skriv namn: ");
    }

    //Skapar objekten
    private static void addPlant() {
        plantCollection.addPlant(new Cactus("Igge", 0.2));
        plantCollection.addPlant(new Palm("Laura", 5));
        plantCollection.addPlant(new MeatEatingPlant("Meatloaf", 0.7));
        plantCollection.addPlant(new Palm("Olof", 1));
    }

    //Interface: Metoden tar emot allt som är Waterable och skriver ut mängd och typ av vätska
    private static void printWateringInfo(Waterable item) {
        //Polymorfism: Ger rätt getVolume och getFluid beroende på objektets subklass
        System.out.println("ska ha: " + item.getVolume() + " liter " + item.getFluid() + ".\n");
    }

    //Metod för att hantera användarens input
    public static boolean handleChoice(String choice) {
        if (choice.isBlank()){
            System.out.println("Inget namn skrevs in\n");
            return true;
        }
        // Avslutar programmet om användaren skriver "avsluta"(spelar ingen roll om stor eller liten bokstav används)
        if (choice.trim().equalsIgnoreCase("avsluta")) {
            System.out.print("Avslutar.");
            return false;
        }
        // Skriver ut om input matchar objektens namn.
        Plant found = plantCollection.findPlantsByName(choice);
        if (found != null) {
            System.out.println("\n" + found.getName() + " (" + found.getType() + ")");
            printWateringInfo(found);
            //Skriver ut felmeddelande om input inte matchar något objekt
        } else {
            System.out.println("\nHittade ej någon växt med det namnet\n");
        }
        return true;
    }




}
