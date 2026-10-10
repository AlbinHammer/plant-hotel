import java.util.ArrayList;
import java.util.List;

public class PlantCollection {

    private final List<Plant> plants = new ArrayList<>();

    public void addPlant(Plant plant){
            plants.add(plant);
    }
    public void printPlants(){//Skriver ut namnen på plantorna
        for(Plant plant: plants){
            System.out.println(plant.getName() + "  (" + plant.getType() + ")");
        }
    }
    public Plant findPlantsByName(String name){
        for(Plant plant: plants){
            if(plant.getName().equalsIgnoreCase(name.trim()) ){
                return plant;
            }
        }
        return null;
    }


}
