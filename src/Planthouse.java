public class Planthouse {

    private static Plant[] plants = new Plant[100];
    private static int count = 0;
    private String name;

    public Planthouse(String name) {
        this.name = name;
    }
    public void addPlant(Plant plant){
        plants[count] = plant;
        count++;
    }
    public static void printPlants(){//Skriver ut namnen på plantorna
        for(int i = 0; i < count; i++){
            System.out.println("Namn " + plants[i].getName() + " Typ: " + plants[i].getType());
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
