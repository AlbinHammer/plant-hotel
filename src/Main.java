import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static Planthouse planthouse = new Planthouse("Greenest");

    public static void main(String[] args) {
        addPlant();
        try (Scanner scanner = new Scanner(System.in)) {

            boolean running = true;
            while (running) {
                showMenu();
                String input = scanner.nextLine();
                running = userChoise(input, scanner);

            }
        } catch (NoSuchElementException e) {
            System.out.println("Avslutar");

        }
    }

    private static void showMenu() { //Meny
        System.out.println("Vilken planta ska få vätska?");
        Planthouse.printPlants();
        System.out.println("Skriv (" + "avsluta" + ") för att avsluta");
        System.out.println("Skriv namn: ");
    }

    private static void addPlant() { //Skapar objekten
        planthouse.addPlant(new Cactus("Igge", 0.2));
        planthouse.addPlant(new Palm("Laura", 5));
        planthouse.addPlant(new MeateatingPlant("Meatloaf", 0.7));
        planthouse.addPlant(new Palm("Olof", 1));
    }

    public static boolean userChoise(String choice, Scanner scanner) {
        if (choice.trim().equalsIgnoreCase("avsluta")) {
            System.out.println("Avslutar.");
            return false;
        }
        Plant found = Planthouse.getPlantsByName(choice);
        if (found != null) {
            System.out.println(found.getName() + " (" + found.getType() + ") " + " Ska ha " + found.getVolume() + " liter " + found.getFluid().toLowerCase() + " per dag.");
        } else {
            System.out.println("Hittade ej någon växt med det namnet");
        }
        return true;
    }




}
