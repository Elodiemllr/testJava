public class Cat {

//Notre attribut va avoir un type, ici Name
//Un attribut est en soit une variable appartenant à une class
//De base on mettra les attribut en privée 
 private String name;
private int age;

    //ici on va faire un constructor (une methode) qui nous permettra de créer notre objet 
    //Notre concteur aura des params 
    public Cat (String name, int age ) {
        this.name = name;
        this.age = age;
        //this est un therme qui fera réference à l'objet que l'on vient de créer
        // this = l'instance en cours 
        //this fera reference à miaou 1 etc crée dans ClassConstructor
        //notre constructeur/methode cat pourra être réutilisé partout car il est public 
        System.out.println("coucou le chats : " + this.name +  " " + this.age);

    }
    
}
 