package exercice_2;

import java.util.Date;

public class Reservation
{
    public boolean RDV(int patient_id, int medecin_id, Date date_rdv) {
        // Vérifier si le patient et le médecin sont valides
        if (!patient.verifyPatient(patient_id) || !medecin.verifyMedecin(medecin_id)) {
            return false;
        }

        // Vérifier si le médecin est disponible à la date et heure du rendez-vous
        if (!medecin.medecinDispo(medecin_id, date_rdv)) {
            return false;
        }

        return true;
    }
}
