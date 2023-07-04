package exercice_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class paiement_test {
	String mon_numéro_true = "1234567890123456";
	String mon_numéro_false = "123456723456";
	String mon_numéro_pas_numerique = "salutjesuispabon";
	
	String bon_cvv = "123";
	String mauvais_cvv = "abc";
	
	double montant = 50.00;
	
	@Test
	public void verifiyCardTrue() { // test si tout est bon pour la vérif de carte
		assertTrue(CarteCreditManager.verifyCard(mon_numéro_true, bon_cvv));
	}
	
	@Test
	public void processPaymentTrue() { // test si tout est bon pour le paiement
		assertTrue(PaymentProcessor.processPayment(montant, mon_numéro_true, bon_cvv));
	}
	
	@Test
	public void verifiyCardFalse() { // test si le numéro n'est pas d'une longueur de 16
		assertFalse(CarteCreditManager.verifyCard(mon_numéro_false, bon_cvv));
	}
	
	@Test
	public void verifiyCardFale() { // test si le cvv est faux
		assertFalse(CarteCreditManager.verifyCard(mon_numéro_true, mauvais_cvv));
	}
	
	@Test
	public void verifiyCardFase() { // test si le numéro de carte est en lettre
		assertFalse(CarteCreditManager.verifyCard(mon_numéro_pas_numerique, bon_cvv));
	}
	
	@Test
	public void processPaymentFalse() { // test avec un montant négatif
		assertFalse(PaymentProcessor.processPayment(-50.00, mon_numéro_true, bon_cvv));
	}
	
	@Test
	public void processPaymentFale() { // test avec une carte non valide
		assertFalse(PaymentProcessor.processPayment(montant, mon_numéro_pas_numerique, bon_cvv));
	}
}
