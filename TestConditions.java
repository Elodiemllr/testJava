//Les conditions 

public class TestConditions {
    public static void main (String[] arg) {
        int myValue = 13;
//IF 
        //condition si myValue est égal a 24 alors je console log myValue
        if (myValue == 24 || myValue == 20 ) {
        System.out.println( "yes it's " + myValue );
    } else {
        System.out.println( "not " + myValue );

    }

    if (myValue < 20  ) {
        //là au dessus on sait que si on rentre dans cette conditions alors myValue est deja inférieur à 20
        //donc je peux re faire une condition pour en savoir plus
        if (myValue < 15 && myValue > 5){
        System.out.println( "you're teen" );}
    } else if (myValue > 30) {
        System.out.println( "your old");

    } else {
        System.out.println( "your at the best age");

    }

    //Switch peut aussi nous permettre de verifier du texte
int option = 1;

switch(option) {
    //dans le cas ou ça vaut un
    case 4: 
    System.out.println( "you can eat one cake");
    //ça, ça nous permet de sortir du switch 
    break;

    //default = else
    default : 
    System.out.println( "you can eat a lot of cake");
    break;

}
/*
String myName = "Elodie";
switch(option) {

case "Elodie":
System.out.println( "you have a pretty name");
break;

case "b":
System.out.println( "you have a weird name");
break;
default :
System.out.println( "you have a name..it's cool");
break;
    }
*/
}
 
}
