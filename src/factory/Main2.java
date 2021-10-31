package factory;

import domain.Medicament;

public class Main2 {
	public static void main(String[] args) {
		Medicament m=new Medicament("Ibuprofeno");
		MedicalGUI mgui=new MedicalGUI(m);
		}

}
