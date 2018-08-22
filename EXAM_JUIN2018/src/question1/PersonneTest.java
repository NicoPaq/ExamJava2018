package question1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonneTest {

	@Test
	final void testPersonne() {
		System.out.println("----- testPersonne -----");
		System.out.println("*** Création d'une personne : ***");
		Personne p1 = new Personne("Comte Dracula");
		System.out.println("Personne : " + p1.toString());
		assertEquals("Comte Dracula [ ]", p1.toString());
	}

	@Test
	final void testAjouterCompte() {
		System.out.println("----- testAjouterCompte -----");
		System.out.println("*** Ajout d'un compte pour une personne : ***");
		Personne p2 = new Personne("Colin Mc Rae");
		Compte c1 = new Compte(p2);
		p2.ajouterCompte(c1);
		System.out.println("Num Compte/Solde  : " + c1.toString());
		System.out.println("Personne et sa liste de comptes : " + p2.toString());
		assertEquals("Colin Mc Rae [ 5 (0 EUR) ]", p2.toString());
	}

	@Test
	final void testToString() {
		System.out.println("----- testToString() -----");
		System.out.println("*** Nom de la personne et sa liste de comptes : ***");
		Personne p3 = new Personne("Dave Grohl");
		Compte c2 = new Compte(p3);
		c2.ajouter(15200);
		p3.ajouterCompte(c2);
		Compte c3 = new Compte(p3);
		c3.ajouter(25000);
		p3.ajouterCompte(c3);
		Compte c4 = new Compte(p3);
		c4.ajouter(1600000);
		p3.ajouterCompte(c4);
		Compte c5 = new Compte(p3);
		c5.ajouter(50000);
		p3.ajouterCompte(c5);
		System.out.println("Personne et sa liste de comptes: " + p3.toString());
		assertEquals((String) "Dave Grohl [ 1 (15200 EUR) 2 (25000 EUR) 3 (1600000 EUR) 4 (50000 EUR) ]", p3.toString());
	}

}
