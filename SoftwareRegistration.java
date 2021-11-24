//Encapsulation de données 
public class SoftwareRegistration {

    //variable de class 
    // on veut pouvoir enregistrer des logiciel mais jusqu'à 4 licence 
    //au bout de 4 je ne pourais plus faire de logiciel 
    private static int numberOfRegistration = 4;

    

    //si je ne le met pas "private" je vais pouvoir aller le modifier dans une autre class
     private int expirationYear;

    //accésseur (geteur, seteur, get set)
    //getters: acceder à un attreibut
    // setters : modification d'un attributs
    // a créer dans la class en question

    public SoftwareRegistration(int expiration) {

        //si notre nombre de registration est supérieur à 0 
        if (numberOfRegistration > 0)  {
            //alors on créer une licence 
        this.expirationYear = expiration;
        //puis je retire 1 
        numberOfRegistration--;
        System.out.println("Valide jusqu'en " +  this.expirationYear + " nombre restant " + this.numberOfRegistration); 
        //quand on a plus de licence dispo, on arrête
        } else {
            System.out.println("Plus de licence disponible"); 
        }
        
    }

    //pour chaque attribut on va creer deux methodes supplémentaire 
    //c'est pour garder ce principe d'encapsulation des données
    //on va modifier via nos accesseur (set get)

    //ACCESSEUR = 1 attribut = 1 setter + 1 getter

    //getter
    //en general un getter ne prends pas de parametres
    //il va retourner notre attrivuts
    //on 'get' (recupère)  notre int
    public int getExpirationYear() {
        return this.expirationYear;

        //on peut interdir la lecture d'un attribut en modifiant le int par void et en faisant aussi un return
    }

    //setter
    //le setter ne va rien retourner
    // pour la modification
     public void setExpirationYear(int myExpiration) {
        this.expirationYear = myExpiration;

        //SI ON VEUT BLOQUER LA MODIFE
        // return;
        //du coup il ne pourra rien retourner (void)

     }
}
