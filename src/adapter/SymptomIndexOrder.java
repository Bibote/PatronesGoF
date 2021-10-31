package adapter;

import java.util.Comparator;

import domain.Symptom;

public class SymptomIndexOrder implements Comparator<Object> {


	@Override
	public int compare(Object o1, Object o2) {
		Symptom s1= (Symptom) o1;
		Symptom s2= (Symptom) o2;
		if(s1.getSeverityIndex()<s2.getSeverityIndex())return -1;
		if(s1.getSeverityIndex()==s2.getSeverityIndex())return 0;
		else return 1;
	}



}
