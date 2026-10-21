import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    private static final PlantCollection plantCollection = new PlantCollection();
    private static final ConsoleView view = new ConsoleView();

    public static void main(String[] args) {
        addPlant();//Lägger till objekten i arrayen
        try (Scanner scanner = new Scanner(System.in)) {//Visar meny samt hanterar användarens inmatningar.
            boolean running = true;
            while (running) {
                view.showMenu(plantCollection.getPlants());
                running = handleChoice(scanner.nextLine());
            }
        } catch (NoSuchElementException e) {// Avlutar programmet vid CTRL-D (EOF).
            System.out.println("Avslutar");
        }
    }

    //Skapar objekten
    private static void addPlant() {
        plantCollection.addPlant(new Cactus("Igge", 0.2));
        plantCollection.addPlant(new Palm("Laura", 5));
        plantCollection.addPlant(new MeatEatingPlant("Meatloaf", 0.7));
        plantCollection.addPlant(new Palm("Olof", 1));
    }


    //Metod för att hantera användarens input
    private static boolean handleChoice(String choice) {
        // Skriver ut felmeddelande om användaren skriver in blankt tecken.
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
            view.printWateringInfo(found);
            //Skriver ut felmeddelande om input inte matchar något objekt
        } else {
            System.out.println("\nHittade ej någon växt med det namnet\n");
        }
        return true;
    }




}
