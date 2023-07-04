package exercice_2;

import java.util.Date;

public class Reservation
{
    public boolean RDV(int patient_id, int medecin_id, Date date_rdv) {
        // V�rifier si le patient et le m�decin sont valides
        if (!patient.verifyPatient(patient_id) || !medecin.verifyMedecin(medecin_id)) {
            return false;
        }

        // V�rifier si le m�decin est disponible � la date et heure du rendez-vous
        if (!medecin.medecinDispo(medecin_id, date_rdv)) {
            return false;
        }

        return true;
    }
}
