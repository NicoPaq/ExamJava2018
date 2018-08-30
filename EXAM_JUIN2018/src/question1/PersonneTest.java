package question1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonneTest {

	@Test
	final void testPersonne() {
		System.out.println("----- testPersonne -----");
		System.out.println("*** Création d'une personne sans compte : ***");
		Personne p1 = new Personne("Comte Dracula");
		System.out.println("Personne : " + p1.toString());
		assertEquals("Comte Dracula [ ]", p1.toString());
	}

	@Test
	final void testAjouterCompte() {
		System.out.println("----- testAjouterCompte -----");
		System.out.println("*** Ajout d'un compte pour une personne : ***");
		Personne p2 = new Personne("Colin Mc Rae");
		p2.ajouterCompte();
		System.out.println("Num Compte/Solde  : " + p2.toString());
		System.out.println("Personne et sa liste de comptes : " + p2.toString());
		assertEquals("Colin Mc Rae [ 5 (0 EUR) ]", p2.toString());
	}

	@Test
	final void testToString() {
		System.out.println("----- testToString() -----");
		System.out.println("*** Nom de la personne et sa liste de comptes : ***");
		Personne p3 = new Personne("Dave Grohl");
		p3.ajouterCompte();
		Compte cpt1 = p3.getCompte(1);
		p3.depot(cpt1, 15200);
		p3.ajouterCompte();
		Compte cpt2 = p3.getCompte(2);
		p3.depot(cpt2,25000);
		p3.ajouterCompte();
		Compte cpt3 = p3.getCompte(3);
		p3.depot(cpt3, 1600000);
		p3.ajouterCompte();
		Compte cpt4 = p3.getCompte(4);
		p3.depot(cpt4, 50000);
		System.out.println("Personne et sa liste de comptes: " + p3.toString());
		assertEquals((String) "Dave Grohl [ 1 (15200 EUR) 3 (1600000 EUR) 4 (50000 EUR) 2 (25000 EUR) ]", p3.toString());
	}

}
