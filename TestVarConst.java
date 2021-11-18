 // nommage variable : Camel Case, exemple : uneVariable
 // nommage class : Pascal Case, exemple MyClass
 
 public class TestVarConst {
        
    public static void main(String[] args)
    {
        /*ici cette valuer (porté des variable), n'existera que dans cette méthode, pareil pour celle aussi, 
     elle ne sont pas pour le moment accessible dans d'autre*/
        int ageUser = 0;
        System.out.println(ageUser);

        //si maintenant je veux changer la valeur
        ageUser = 24;
        System.out.println(ageUser);

             //Les constantes :
     //final mot clef pour dire constantes
     // En general on écrit le mot clef d'une constante en MAJ pour mieux les differencier visuellement des variables
     final int BIRTH_YEAR = 1900;
     System.out.println(BIRTH_YEAR);

     // Une constante, une variable 'final', ne pourras plus être modifié, sa valeur ne pourras plus changer
   /*  birthYear = 1905;
     System.out.println(birthYear);*/


     //test perso :
     boolean likeMovie = false;
     System.out.println(likeMovie);
     likeMovie = true;
     System.out.println(likeMovie);

     } 
 
}

