//  Methode = nom donnée pour une function dans une class 
//class
public class Methode {

//methode main
//public = accessibilité
//static = 
// void = pour décrire ce que cette function va nous retourner, ici rien donc 
//on utilise void
// entre parenthese = params
    public static void main (String []args) 
    { 
        //par exemple là on utilise dans cette methode, une methode native à Java
        //Elle est égale à un console.log en js
        System.out.println("coucou");
        //on peut aussi créer des méthodes (des function) (comme en js) pour par exemple ne pas faire de repetition de code
        //ici j'appelle ma méthode une première fois, je dois la mettre à chaque fois que je veux afficher de nouveau 
        myMethode ();
        myMethode ();
    }

    //on va créer une methode
    //ça nous évite de faire des répetitions, d'organiser 
    //Uné methode ne doit faire qu'une seule chose à la fois 
    public static void myMethode() {
        System.out.println("bonjour " );
        System.out.println("comment allez vous ? " );
    }
}
