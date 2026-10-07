import java.util.ArrayList;
import java.util.List;

public class PlantHouse {

    private static final List<Plant> plants = new ArrayList<>();

    public void addPlant(Plant plant){
            plants.add(plant);

    }
    public static void printPlants(){//Skriver ut namnen på plantorna
        for(Plant plant: plants){
            System.out.println(plant.getName() + ".  (" + plant.getType() + ")");
        }
    }
    public static Plant getPlantsByName(String name){
        for(Plant plant: plants){
            if(plant.getName().equalsIgnoreCase(name.trim()) ){
                return plant;
            }
        }
        return null;
    }


}
