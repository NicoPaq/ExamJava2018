package question2;

/* 
 * @author NicoPaq
 * */

public class Box <T> {
	
	private T object;
	
	// Constructeur par d�faut, pas besoin de lui passer des param�tres
	public Box() {
		this.object = null;
	}
	
	// M�thode get �quivalente � getValeur by the way.
	// On retourne l'objet dans la bo�te, null si il n'y a rien
	public T get() {
		// Pas traitement sp�cifique.
		return this.object;
	}
	
	// M�thode put �quivalente � setValeur by the way pour mettre un �l�ment dans la bo�te.
	// On met un objet dans la bo�te en remplacant l'objet existant le cas �ch�ant.
	public void put(T val) {
		this.object = val;
	}
	
	
}
