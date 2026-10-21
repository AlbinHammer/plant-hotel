public class Main {

    private static final PlantCollection plantCollection = new PlantCollection();
    private static final DialogView view = new DialogView();

    // Startar programmet, skapar växterna och visar menyn tills användaren stänger av programmet.
    public static void main(String[] args) {
        addPlant();
        boolean running = true;
        while (running) {
            running = handleInput(view.askPlantName(plantCollection.getPlants()));
        }

    }

    //Skapar objekten
    private static void addPlant() {
        plantCollection.addPlant(new Cactus("Igge", 0.2));
        plantCollection.addPlant(new Palm("Laura", 5));
        plantCollection.addPlant(new MeatEatingPlant("Meatloaf", 0.7));
        plantCollection.addPlant(new Palm("Olof", 1));
    }


    // Hanterar användarens input, returnerar false när programmet avslutas
    private static boolean handleInput(String input) {
        // Avslutar programmet om användaren skriver "avsluta"(spelar ingen roll om stor eller liten bokstav används)
        if (input == null) {
            return false;
        }
        if (input.isBlank()) { // Skriver ut felmeddelande om användaren skriver in blankt tecken.
            view.emptyInput();
            return true;
        }
        Plant found = plantCollection.findPlantsByName(input); // Skriver ut om input matchar objektens namn.
        if (found != null) {
            view.showResult(found);
        } else { //Skriver ut felmeddelande om input inte matchar något objekt
            view.inputNotFound();
        }
        return true;
    }


}
