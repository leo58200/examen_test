package exercice_2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ReservationTest {

	
	
	@Test
	public void testReservationValide() {
		int patient_id = 1;
		int medecin_id = 1;
		Date date_rdv = ;
		assertTrue(Reservation.RDV());
	}
	
	@Test
	public void testReservationPatientInvalide() {
		assertFalse();
	}
	
	@Test
	public void testReservationMedecinInvalide() {
		assertFalse();
	}
	
	@Test
	public void testReservationDateIndisponible() {
		assertFalse();
	}
	
	@Test
	public void testReservationPatientOccupe() {
		assertFalse();
	}
	
	@Test
	public void testReservationMedecinOccupe() {
		assertFalse();
	}
	
	@ParameterizedTest
	@ValueSource()
	public void testReservationParametre() {
		// ?????
	}
}
