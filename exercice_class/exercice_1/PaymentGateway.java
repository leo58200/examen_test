package exercice_1;
import java.util.UUID;

public class PaymentGateway
{
	public String makePaiement(double montant)
	{
		// l'id est généré avec java.util.UUID et est retourné
		String id_transaction = UUID.randomUUID().toString();
		return id_transaction;
	}
}
