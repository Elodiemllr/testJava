public class App {

    public static void main(String [] args)
    {
        SoftwareRegistration yearActual = new SoftwareRegistration(2020);
        /*
        Maintenant je ne pourrais pas modifié l'expiration year car l'acces est privé
        yearActual.expirationYear = 2022; 
        System.out.println("Valide jusqu'en " +   yearActual.expirationYear);*/

        //on va là directement modifier notre setter et le remettre au getter

        //AVANT 
        //  yearActual.expirationYear(2025);
        //System.out.println(yearActual.expirationYear );
        //APRES
        yearActual.setExpirationYear(2025);
        System.out.println(yearActual.getExpirationYear());
    }
    
}
