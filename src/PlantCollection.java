import java.util.ArrayList;
import java.util.List;

public class PlantCollection {

    // Inkapsling, listan nås bara via metoderna i klassen
    private final List<Plant> plants = new ArrayList<>();

    // Sparar objekten i listan
    public void addPlant(Plant plant){
            plants.add(plant);
    }

    // Hittar namnet på objektet i listan
    public Plant findPlantsByName(String name){
        for(Plant plant: plants){
            if(plant.getName().equalsIgnoreCase(name.trim()) ){
                return plant;
            }
        }
        return null;
    }
    public List<Plant> getPlants() {
    return plants;
    }


}
