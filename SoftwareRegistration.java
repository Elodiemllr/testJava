//Encapsulation de données 
public class SoftwareRegistration {

    private int expirationYear;

    //accésseur (geteur, seteur, get set)
    //getters: acceder à un attreibut
    // setters : modification d'un attributs
    // a créer dans la class en question

    public SoftwareRegistration(int expiration) {
this.expirationYear = expiration;

System.out.println("Valide jusqu'en " +  this.expirationYear);
    }
     
}
