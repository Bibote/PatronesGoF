package adapter;

import java.util.Comparator;

import domain.Symptom;

public class SymptomIndexOrder implements Comparator<Symptom> {


	@Override
	public int compare(Symptom o1, Symptom o2) {
		if(o1.getSeverityIndex()<o2.getSeverityIndex())return -1;
		if(o1.getSeverityIndex()==o2.getSeverityIndex())return 0;
		else return 1;
	}

}
