public class PlantHouse {

    private static final Plant[] plants = new Plant[100];
    private static int count = 0;

    public void addPlant(Plant plant){
        plants[count] = plant;
        count++;
    }
    public static void printPlants(){//Skriver ut namnen på plantorna
        for(int i = 0; i < count; i++){
            System.out.println("Namn: " + plants[i].getName() + ".  (" + plants[i].getType() + ")");
        }
    }
    public static Plant getPlantsByName(String name){
        for(int i = 0; i < count; i++){
            if(plants[i].getName().equalsIgnoreCase(name.trim()) ){
                return plants[i];
            }
        }
        return null;
    }


}
