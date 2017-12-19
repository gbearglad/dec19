
public class Voiture {

    private String licensePlate;
    private String color;
    private String model;
    private int km;
    private int year;
    // getters and setters pour écrire dans des attributs privés :
    public void setYear(int value) {
        year = value;
        
    }

    String getDescription() {
        return "la voiture est : \n"
                + "\tmodèle :" + model + "\n"
                + "\tplaque d'immatriculation : " + licensePlate + "\n"
                + "\tannée : " + year + "\n"
                + "\tcouleur : " + color + "\n"
                + "\tkilométrage : " + km;
    }
}
