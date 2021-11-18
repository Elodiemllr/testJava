/* Les opérateurs 
 = Affecation
 + concaténation 
 
 opérateurs mathématiques comme en js
 + - * / % ()pour des soustractions, multiplication, modulo (le reste d'une division) etc 
 
 opérateurs de comparaison comme en js 
 == (on verifie juste la valeur) 
 === (ici on verifie la valeur et son type) 
 (different) !=
 < > !monmot (inverse de mon mot)
<= => && ||



 opérateurs de l'incrementation
 ++ --(ajouter, enlever) += -= *= %= le égale permet de racourcir l'opération, au lieu de 
 xp = xp +10 => xp =+ 10
 A++ post incrémentation
 ++A pré incrémentation 
 idem pour le moins 
 */

public class TestOperateur {
    
    public static void main(String[] args) {

        // 24 est une affectation  
        int number = 5 % 2;
        int result = number;
//concaténation comme en JS
        System.out.println("J\'ai "+ result +" ans");

        //incrémentation
        int xp = 0;
        xp =+ 10;
        xp ++;
        System.out.println(xp);

      
    

    }
}
