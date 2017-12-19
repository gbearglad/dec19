
public class Voiture {

    private String licensePlate;
    private String color;
    private String model;
    private int km;
    private int year;
    // getters and setters pour écrire dans des attributs privés :
    public void setYear(int value) {
        if (value > 1900 && value < 2200){
        year = value;
        }
    }

    String getDescription() {
        String desc = "la voiture est : \n"
                + "\tmodèle :" + model + "\n"
                + "\tplaque d'immatriculation : " + licensePlate + "\n"
                + "\tannée : " + year + "\n"
                + "\tcouleur : " + color + "\n"
                + "\tkilométrage : " + km;
    return desc ;
    }
}
