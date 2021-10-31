package domain;

import symptoms.*;

public class SymptomFactory {
	private Symptom createSymptom(String symptomName) {
	if(symptomName.equals("astenia")) return new AsteniaSymptom();
	if(symptomName.equals("cefalea")) return new CefaleaSymptom();
	if(symptomName.equals("congestion conjuntival")) return new CongestionConjuntivalSymptom();
	if(symptomName.equals("congestion nasal")) return new CongestionNasalSymptom();
	if(symptomName.equals("diarea")) return new DiarreaSymptom();
	if(symptomName.equals("disnea")) return new DisneaSymptom();
	if(symptomName.equals("dolor de garganta")) return new DolorDeGargantaSymptom();
	if(symptomName.equals("escalofrios")) return new EscalofriosSymptom();
	if(symptomName.equals("expectoracion")) return new ExpectoracionSymptom();
	if(symptomName.equals("fiebre")) return new FiebreSymptom();
	if(symptomName.equals("hemoptitis")) return new HemoptisisSymptom();
	if(symptomName.equals("mareo")) return new MareoSymptom();
	if(symptomName.equals("milagia")) return new MilagiaSymptom();
	if(symptomName.equals("nauseas")) return new NauseasSymptom();
	if(symptomName.equals("tos seca")) return new TosSecaSymptom();
	if(symptomName.equals("vomitos")) return new VomitosSymptom();
	return null;
	
	}

}
