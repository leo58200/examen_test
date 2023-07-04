package exercice_1;

public class PaymentProcessor
{
    public static boolean processPayment(double montant, String numCart, String cvv)
    {
        boolean CarteValide = CarteCreditManager.verifyCard(numCart, cvv);
        if (CarteValide && montant > 0)
        {
        	// Si la carte est valide (verifyCard) et que le montant est positif alors bon
            return true;
        } else {
        	// sinon c'est faux
            return false;
        }
    }
}
