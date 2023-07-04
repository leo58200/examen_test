package exercice_2;

import java.util.Date;

public class medecin {
	public static boolean verifyMedecin(int id)
	{
		if (id > 0)
		{
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean medecinDispo(int id, Date date_rdv)
	{
		return true;
	}
}
