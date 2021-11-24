public class App {

    public static void main(String [] args)
    {
        SoftwareRegistration yearActual = new SoftwareRegistration(2020);
        SoftwareRegistration yearActual2 = new SoftwareRegistration(2040);
        SoftwareRegistration yearActual3 = new SoftwareRegistration(2050);
        SoftwareRegistration yearActual4 = new SoftwareRegistration(2032); 
        SoftwareRegistration yearActual5 = new SoftwareRegistration(2033); 

    

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

        System.out.println(yearActual2.getExpirationYear());
        
        System.out.println(yearActual3.getExpirationYear());
        System.out.println(yearActual4.getExpirationYear());
        System.out.println(yearActual5.getExpirationYear());

    }
    
}
