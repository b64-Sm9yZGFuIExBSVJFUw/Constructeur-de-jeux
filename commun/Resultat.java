package commun;

public enum Resultat {
	GAGNE, PERDU, MATCH_NULL;
	
	@Override
	public String toString() {
		switch(this) {
		case GAGNE: return "gagn�";
		case PERDU: return "dommage";
		case MATCH_NULL: return "Match nul";
		}
		return "";
	}
}