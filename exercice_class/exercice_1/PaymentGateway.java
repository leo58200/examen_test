package exercice_1;
import java.util.UUID;

public class PaymentGateway
{
	public String makePaiement(double montant)
	{
		// l'id est g�n�r� avec java.util.UUID et est retourn�
		String id_transaction = UUID.randomUUID().toString();
		return id_transaction;
	}
}
