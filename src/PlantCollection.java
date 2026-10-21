import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlantCollection {

    // Inkapsling, listan nås bara via metoderna i klassen
    private final List<Plant> plants = new ArrayList<>();

    // lägger till ett objekt i listan
    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    // Söker efter namnet på objektet i listan oavsett stora eller små bokstäver, returnerar null om inget hittas
    public Plant findPlantsByName(String name) {
        for (Plant plant : plants) {
            if (plant.getName().equalsIgnoreCase(name.trim())) {
                return plant;
            }
        }
        return null;
    }

    //Returnerar en skyddad vy av listan
    public List<Plant> getPlants() {
        return Collections.unmodifiableList(plants);
    }
}
