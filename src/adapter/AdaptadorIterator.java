package adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

import domain.Covid19Pacient;
import domain.Symptom;

public class AdaptadorIterator<Symptoms> implements InvertedIterator {
	private int pos;
	private Symptom sintoma;
	private Covid19Pacient paciente;
	
	public AdaptadorIterator (Covid19Pacient paciente) {
		this.paciente=paciente;
	}
	@Override
	public Object previous() {
		int i=0;
		for(Symptom s:paciente.getSymptoms()) {
			if(i==pos) return s;
		}
		return null;
	}

	@Override
	public boolean hasPrevious() {
		if(pos==0) return false;
		return true;
	}

	@Override
	public void goLast() {
		pos=paciente.getSymptoms().size();
		
	}

}
