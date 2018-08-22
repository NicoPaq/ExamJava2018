package question4;

public class Calculateur {

	private int number;
	
	public Calculateur(int number) {
		this.number = number;
	}
	
	public int valeurAbsolue() {
		// Inutile de vérifier le cas > 0 vu que çà sera tjs égal au nombre renseigné.
		if(number<0) {
			this.number = -(number);
		}
		if(number==0) {
			this.number = 0;
		}	
		return this.number;
	}

	public String toString() {
		return "Valeur absolue : " + valeurAbsolue();
	}
	
}
