 //class = entité 
 // nom du fichier = nom de la class

 //on met public pour pouvoir acceder à main partout 
 public class MainApp 
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
         
         System.out.println(" \t Hello  world"); // = console.log()
     }
 }

 // Compilation, dans le terminal : javac monfichier.java
 // Executer : java monfichier

 

 /* 
 On peut noter nos nombre entier sous différente façon : 
Nombre entier : 14
                18666
                100000
Mais pour que ça soit plus clair on peut mettre des séparations pour que ça soit plus clair, tout les 3 chiffres, exemple :
                100_000
                14_000


On peut aussi avoir différentes bases numériques :
Base décimale       (10 => nombre de 0 à 9 )
Base binaire        (2 => 0 & 1) 0b
Base Octale         (8 => 0 à 7) 0
Base hexadécimale   (16 => 0 & f) ox

Java à prévu des notations spéciales pour ces types aussi, comme pour les séparations, exemple pour une valeur binaire 
binaire => 0b devant le nombre, donc 0b110112101
Octale => 0 devant, donc 07546
Héxadécimale 0xAF542B
 */

 /* Caractères spéciaux, à utiliser dans le texte :
 \n : retour  à la ligne
 \t : tabulation, espace avant texte
 \r retour chariot
 \b : retour arrière
 \f : nouvelle page
 \' : comme sur js pour les "" '' 
 */


