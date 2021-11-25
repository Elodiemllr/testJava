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
    }
    
}
