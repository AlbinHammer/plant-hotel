import javax.swing.JOptionPane;
import java.util.List;

public class DialogView {
    // Visar en ruta som frågar vilken planta som ska få vätska samt visar en lista på sparade plantor
    public String askPlantName(List<Plant> plants) {
        String plantName = "Skriv in namnet på den planta som ska få vätska\n\n";
        for(Plant plant : plants)  {
            plantName += plant.getName() + " (" + plant.getType() + ")\n\n";
        }
        return JOptionPane.showInputDialog(null,  plantName, "Fråga", JOptionPane.QUESTION_MESSAGE);

    }
    // Visar en ruta med namn, typ, vätskemängd och vätsketyp
    public void showResult(Plant plant) {
        String message = plant.getName() + " (" + plant.getType() + ")\nska ha " + getWateringText(plant) + ".";
        JOptionPane.showMessageDialog(null, message, "Resultat", JOptionPane.INFORMATION_MESSAGE);
    }

    // Visar felmeddelande när inget skrivits in
    public void emptyInput() {
        JOptionPane.showMessageDialog(null, "Inget namn skrevs in", "Fel", JOptionPane.WARNING_MESSAGE);
    }

    // Visar felmeddelande när input inte matchar namn på någon växt
    public void inputNotFound() {
        JOptionPane.showMessageDialog(null, "Hittade ingen växt med det namnet", "Fel", JOptionPane.WARNING_MESSAGE);
    }

    //Interface: Metoden tar emot allt som är Waterable och skriver ut mängd och typ av vätska
    public String getWateringText(Waterable item) {
        //Polymorfism: Ger rätt getVolume och getFluid beroende på objektets subklass
        return item.getVolume() + " liter " + item.getFluid();
    }


}
