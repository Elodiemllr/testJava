public class Tableau {
/*
        si on veut faire un tableau sans rien declarer dedans
          int[] tab = new int[]
          int tab[] / int[] tab 
          int tab[] = {1, 2, 3 } / int tab[] = new int{1, 2, 3}
          int tab[] = new int[3] 
           
        
*/
    public static void main (String[] args) {
    

        int[] tab = new int[] {1, 2, 3};
        //boucle for pour parcourir notre tableau
        for (int i=0; i < tab.length; ++i) {
        System.out.println(tab[i]);
        }

        //pour chaque element de tab (chaque element sera stocké dans el) 
        for(int el: tab) {
            System.out.println("chifre " + el  );
        }

        //Tableau à deux dimensions = un tableau ou chacun de ses elements sont aussi des tableaux
        int[][] tab2 = {{1, 2, 3}, {4, 5, 6} };

        //JE VEUX LE CHIFFRE 5 DU DEUXIEME TABLEAU
        System.out.println(tab2[1][1]);

        //si on veut boucler il va fallor  eux boucles, une premiere pour parcourire notre premier { } puis une deuxieme pour un tab individuel
        for(int i = 0; i < tab2.length; i++) {
            for(int j =0; j < tab2[i].length;  ++j) {
                System.out.println(tab2[i][j] + " boucle tableau deux dimensions");
            }
        }

        for(int[] i : tab2) {
            for (int number: i) {
                System.out.println(number + " meilleur boucle");
        }
    }
}
    
}
