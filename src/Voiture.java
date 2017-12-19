
import java.util.Arrays;

public class Voiture {

    private String licensePlate;
    private String color;
    private String model;
    private int km;
    private int year;

    // getters and setters pour écrire dans des attributs privés :
    public void setYear(int value) {
        if (value > 1900 && value < 2200) {
            year = value;
        }
    }

    String getDescription() {
        String desc = "la voiture est : \n"
                + "\tmodèle : " + getModel() + "\n"
                + "\tplaque d'immatriculation : " + getLicensePlate() + "\n"
                + "\tannée : " + getYear() + "\n"
                + "\tcouleur : " + getColor() + "\n"
                + "\tkilométrage : " + getKm();
        return desc;
    }

    /**
     * @return the licensePlate
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * @param licensePlate the licensePlate to set
     */
    public void setLicensePlate(String licensePlate) {
        if (licensePlate.length() != 7) return;
        licensePlate = licensePlate.toUpperCase();
//        if ('A' <= licensePlate.charAt(0) && licensePlate.charAt(0) <= 'Z' &&
//                'A' <= licensePlate.charAt(1) && licensePlate.charAt(1) <= 'Z' &&
//                'A' <= licensePlate.charAt(2) && licensePlate.charAt(2) <= 'Z' &&
//                licensePlate.charAt(3) == '-' &&
//                Character.isDigit(licensePlate.charAt(4)) &&
//                Character.isDigit(licensePlate.charAt(5)) &&
//                Character.isDigit(licensePlate.charAt(6))) 

// with regex :
        if (licensePlate.matches("[A-Z]{3}-[0-9]{3}"))
        {
            this.licensePlate = licensePlate;
        }
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        String[] colors = {"blanc", "bleu", "jaune", "gris", "vert"};
        if (Arrays.asList(colors).contains(color)) {
            this.color = color;
        }
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        String[] models = {"Maserati", "Porsche", "Ferrari"};
        if (Arrays.asList(models).contains(model)) {
            this.model = model;
        }
    }

    /**
     * @return the km
     */
    public int getKm() {
        return km;
    }

    /**
     * @param km the km to set
     */
    public void setKm(int km) {
        if (km > 0 && km < 1E6) {
            this.km = km;
        }
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }
}
