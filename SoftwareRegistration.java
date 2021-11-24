//Encapsulation de données 
public class SoftwareRegistration {

    //si je ne le met pas "private" je vais pouvoir aller le modifier dans une autre class
     int expirationYear;

    //accésseur (geteur, seteur, get set)
    //getters: acceder à un attreibut
    // setters : modification d'un attributs
    // a créer dans la class en question

    public SoftwareRegistration(int expiration) {
this.expirationYear = expiration;

System.out.println("Valide jusqu'en " +  this.expirationYear);
    }
     
}
