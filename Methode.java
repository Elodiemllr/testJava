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
        System.out.println(getNumberTwo()); 
        System.out.println(getNumber ()); 

        //execution de la methode avec params
        say("test ", 5);
        say("Ola ", 6);

        System.out.println(mySum(2, 5));

        System.out.println(mySum(2.3, 4.5));
    }

    //on va créer une methode
    //ça nous évite de faire des répetitions, d'organiser 
    //Uné methode ne doit faire qu'une seule chose à la fois 
    public static void myMethode() {
        System.out.println("bonjour " );
        System.out.println("comment allez vous ? " );
    }

    //ici autre type de méthode, qui a un return
    //int sera le retour qu'on attends, ici nous attendons que notre methode nous retourn un chiffre, d'ou l'utilisaiton de int
    public static int getNumberTwo() {
        //là on veut que notre méthode/function nous retourne le chiffre 2;
        //lorsqu'il y'a un return, cela arrête ensuite notre methode (comme en js)
        return 2;
    }

    //autre exemple
    public static int getNumber() {
        boolean info = false;

        //si info = true 
        if (info) {
            return 1;
         //sinon
        } else {
            return 0;
        }
    }

    //une méthode peut aussi avoir des paramètre
    //cette méthode va prendre en paramètres un message 
    //cette méthode aura pour function de nous afficher le message pris en params
   //là on peut retrouver le params modifié dans main (voir plus haut)
    public static void say(String msg, int nb) {
        System.out.println(msg); 

    }

    //en Java on peut  créer des méthodes avec le même nom tant qu'elle ont une signature, des paramètres ou un retour différent 
    // ici l'une renvoie un int, l'autre un float 
    public static int mySum(int a, int b) {
        return a + b;
    }
    public static double mySum(double a, double b) {
        return a + b;
    }
}
