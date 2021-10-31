package observer;

import java.util.Observable;
import java.util.Observer;

import domain.Covid19Pacient;

public class Main {
	public static void main(String args[]){
		Observable pacient=new Covid19PacientObservable("aitor", 35);
		new PacientObserverGUI (pacient);
		new SemaphorGUI (pacient);
		new PacientThermometerGUI (pacient);
		new PacientSymptomGUI ((Covid19PacientObservable) pacient);
		
		Observable pacient2=new Covid19PacientObservable("Juan", 35);
		new PacientObserverGUI (pacient2);
		new SemaphorGUI (pacient2);
		new PacientThermometerGUI (pacient2);
		new PacientSymptomGUI ((Covid19PacientObservable) pacient2);
	}
}
