
public class DecNineTeenth {

    public static void main(String[] args) {
//        Voiture titine;
//        titine = new Voiture();
//        titine.year = 2006;
//        titine.km = 153000;
//        titine.color = "Red";
//        titine.model = "Peugeot 206";
//        titine.licensePlate = "DTF 888";
//        System.out.println("Kilométrage : " + titine.km);
//        System.out.println("Modèle : " + titine.model);
//        System.out.println("Plaque d'immatriculation : " +titine.licensePlate);


//   Voiture maserati = new Voiture();
//   maserati.color = "Blanche";
//   maserati.licensePlate = "AAA-123";
//   maserati.model = "Fast one";
//   maserati.km = 123456;
//   maserati.year = 2015;
//   maserati.print();
   
   // important de séparer les classes métier des cotés techniques : ici on lie 
   // une classe métier "Voiture" à la console de l'ordinateur : pas bien. mieux 
   // ci dessous : 
   
   
   /*
        Bonnes pratiques, universelles dans Java : 
        Encapsulation : ne pas permettre l'accès aux données en 
        dehors de la classe.
        Setters and Getters permettent de manipuler les objets. 
        
   */
   Voiture maserati = new Voiture();
   maserati.setYear(1963);
        System.out.println(maserati.getDescription());
   
    }
    
}
