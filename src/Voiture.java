
public class Voiture {

    String licensePlate;
    String color;
    String model;
    int km;
    int year;

    String getDescription() {
        return "la voiture est : \n"
                + "\tmodèle :" + model + "\n"
                + "\tplaque d'immatriculation : " + licensePlate + "\n"
                + "\tannée : " + year + "\n"
                + "\tcouleur : " + color + "\n"
                + "\tkilométrage : " + km;
    }
}
