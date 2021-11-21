//Notre class doit comporter le même nom que notre fichier
//la porté: public (class accessible partout, sans restriction) ou private (pas accessible)
public class ClassConstruction {
 
    public static void main(String[] args)
    {

//pour créer un objet à partir d'une class (donc pour créer une instance) 
//new cat = nouvelle instance, nous avont instancié un chat 
        //Java sait tout seul acceder au fichier donc pas besoin d'import
//cat = class
// miaou = instance de cat
Cat miaou = new Cat();
//là, chaque objet (chaque chat), chaque instance de notre class "cat" aura sa zone mémoire, sera unique
Cat miaou1 = new Cat();

}
     
}
