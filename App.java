public class App {

    public static void main(String [] args)
    {
        SoftwareRegistration yearActual = new SoftwareRegistration(2020);
        yearActual.expirationYear = 2022; 
        System.out.println("Valide jusqu'en " +   yearActual.expirationYear);

    }
    
}
