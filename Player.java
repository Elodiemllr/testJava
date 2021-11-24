    //methode constructor 
    public class Player {

        //Au final par défault tout est public donc attention
        private String Name;
        private int Level; 

        public Player () {
            //Ici on a trois type de constructeur , et on voit lorsqu'on execute
            //si notre user n'a pas de nom et de lvl par default il aura Incconnue et 1
            this.Name = "Inconnue";
            this.Level = 1;
            System.out.println(this.Name  );
            System.out.println(  this.Level);
        }
        public Player (String name) {
        //si notre user n'a pas  de lvl par default il aura 1
            this.Name = name;
            this.Level = 1;
            System.out.println(this.Name  );
            System.out.println(  this.Level);
        }
        public Player (String name, int level) {
            this.Name = name;
            this.Level = level;
            System.out.println(this.Name  );
            System.out.println(  this.Level);
        }

        public void attack() {
            System.out.println(this.Name + "Attaque !");
        }
 
    }