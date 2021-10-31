package adapter;

import java.util.Comparator;

import domain.Covid19Pacient;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient p1=new Covid19Pacient("aitor", 35);
		p1.addSymptomByName("fiebre", 1);
		p1.addSymptomByName("nauseas", 2);
		p1.addSymptomByName("disnea", 3);
		p1.addSymptomByName("cefalea", 2);
		p1.addSymptomByName("mareo", 1);
		Sorting s= new Sorting();
		s.sortedIterator(new InvertedIterator(), new SymptomIndexOrder());

	}

}
