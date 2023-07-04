package exercice_1;

public class CarteCreditManager {
    public static boolean verifyCard(String numCarte, String cvv)
    {
    	if ((numCarte.length() == 16) && numCarte.matches("\\d+") && cvv.length() == 3 && cvv.matches("\\d+"))
    	{
    		// Si numéro de carte longueur de 16 et en chiffres et idem pour le cvv avec 3 chiffres alors c'est bon
    		return true;
    	} else {
    		// sinon c'est faux
    		return false;
    	}
    }
}
