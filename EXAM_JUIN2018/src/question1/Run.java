package question1;

public class Run {
	
	public static void main(String[] args) {
		Personne p1 = new Personne("Dupont Jacques");
		p1.toString();
		Compte c1 = new Compte(p1);
		System.out.println(c1.toString());
	}
	
}
