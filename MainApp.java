 //class = entité 
 // nom du fichier = nom de la class

 class MainApp 
 {
     //function à l'interieur d'une class = methode 

     //main = function /methode de départ du programm, obligatoire car il veut demarrer par  celle ci
     //String[] args  = paramètre/argument qu'on veut passer à notre function, obligatoire de signer 
     //void = car aucun retour attendu 
     //static = méthode executable ici
     /// public car accessble partout, meme en dehors de la classe 
     // Tout ici est obligatoire,   public static void main(String[] args) pour commencer nos class 
     public static void main(String[] args)
     { 
         //System est une class native de java, lié au system
         /// out est un attribu, une variable dans une class 
         // Println est aussi une function disponible qui nous permet d'affficher quelque chose à la sortie (comme console.log), ln = retour à la ligne 
         System.out.println("Hello world");
     }
 }

 // Compilation, dans le terminal : javac monfichier.java
 // Executer : java monfichier

 
 class Test 
 {
     public static void main(String[] args)
     { }
 }