import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static final PlantHouse planthouse = new PlantHouse();

    public static void main(String[] args) {
        addPlant();//Lägger till objekten i arrayen
        try (Scanner scanner = new Scanner(System.in)) {//Visar meny samt hanterar användarens inmatningar.
            boolean running = true;
            while (running) {
                showMenu();
                String input = scanner.nextLine();
                running = handleChoice(input);
            }
        } catch (NoSuchElementException e) {// Avlutar programmet vid EOF-kommando.
            System.out.println("Avslutar");
        }
    }

    private static void showMenu() { //Meny
        System.out.println("Vilken planta ska få vätska?");
        System.out.println("---------------------------------");
        PlantHouse.printPlants();
        System.out.println("---------------------------------");
        System.out.println("Skriv (" + "avsluta" + ") för att avsluta");
        System.out.print("Skriv namn: ");
    }

    private static void addPlant() { //Skapar objekten
        planthouse.addPlant(new Cactus("Igge", 0.2));
        planthouse.addPlant(new Palm("Laura", 5));
        planthouse.addPlant(new MeateatingPlant("Meatloaf", 0.7));
        planthouse.addPlant(new Palm("Olof", 1));
    }

    public static boolean handleChoice(String choice) {//Metod för att hantera användarens input
        if (choice.trim().equalsIgnoreCase("avsluta")) {// Avslutar programmet om användaren skriver "avsluta"(spelar ingen roll om stor eller liten bokstav används)
            System.out.print("Avslutar.");
            return false;
        }
        Plant found = PlantHouse.getPlantsByName(choice);
        if (found != null) { // Skriver ut om input matchar objektens namn.
            System.out.println("\n" + found.getName() + " (" + found.getType() + ")" + " Skall ha " + found.getVolume() + " liter " + found.getFluid() + "\n");
        } else {//Skriver ut felmeddelande om input inte matchar något objekt
            System.out.println("\nHittade ej någon växt med det namnet\n");
        }
        return true;
    }




}
