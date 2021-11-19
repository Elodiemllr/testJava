public class TestBoucles {
    public static void main (String[] arg) 
    {

        //BOUCLE WHILE IF BREAK, DO WHILE
        //"repete une suite d'opérations tant que ce n'est pas résolu"
        int i = 0;
        //"Tant que" i est différent de 10 alors ajoute +1 et console.log(i) 
        //une fois qu'on atteint 20 notre boucle s'arrête
        while (i != 20) 
        {
            i++;
            System.out.println(i);

        //On peut aussi utiliser break pour s'arreter a un chiffre précis (ici 10)
        // on a aussi le mot clef "continue" , qui dit que on continue et on arrête pas à 
            if (i == 10) 
            break;
        }


        //On peut aussi faire la boucle while dans ce sens
        // fait 'cette instruction' tant que ''
        do {
            i++;
            System.out.println(i);
        } while (i != 10 || i < 20);


        //BOUCLE FOR 
        //i = 0 , tant que i est inferieur à 10, alors incrémente le 
        for (i = 0; i < 10; i++) {
            System.out.println(i);

        }

    }
}
