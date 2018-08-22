package question1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompteTest {

	@Test
	final void testCompte() {
		System.out.println("----- testCompte -----");
		System.out.println("*** Création d'un compte : ***");
		Personne p1 = new Personne("Dupont Jacques");
		Compte c1 = new Compte(p1);
		System.out.println("Num Compte/Solde : " + c1.toString());
		assertEquals((String)("8 (0 EUR)"), c1.toString());
	}

	@Test
	final void testAjouter() {
		System.out.println("----- testAjouter -----");
		System.out.println("*** Rajout de 200 Euros sur le compte : ***");
		Personne p2 = new Personne("Durant Etienne");
		Compte c2 = new Compte(p2);
		c2.ajouter(200);
		p2.ajouterCompte(c2);
		System.out.println("Num Compte/Solde : " + c2.toString());
		assertEquals((int) 200, Compte.getSolde());
		assertFalse(c2.ajouter(-200));
	}

	@Test
	final void testRetirer() {
		System.out.println("----- testRetirer -----");
		Personne p3 = new Personne("Duprez Jacques");
		Compte c3 = new Compte(p3);
		// Retrait sur base d'un solde non disponible
		System.out.println("*** Retrait de 200 Euros sur base d'un solde de 0 Euros : ***");
		c3.retirer(200);
		System.out.println("Num Compte/Solde : " + c3.toString());
		assertEquals((int) 0, c3.getSolde());
		// On vérifie le cas d'un retrait négatif
		System.out.println("*** Retrait d'un montant négatif d'un compte (-200 Euros) : ***");
		assertFalse(c3.retirer(-200));
		System.out.println("Num Compte/Solde : " + c3.toString());
		assertEquals((int) 0, c3.getSolde());
		// Retrait sur base d'un solde disponible
		System.out.println("*** Retrait d'un montant de 500 Euros sur un disponible de 1500 Euros : ***");
		c3.ajouter(1500);
		c3.retirer(500);
		System.out.println("Num Compte/Solde : " + c3.toString());
		assertEquals((int) 1000, c3.getSolde());
	}

	@Test
	final void testGetSolde() {
		System.out.println("----- testGetSolde -----");
		Personne p4 = new Personne("Arnould Melody");
		Compte c4 = new Compte(p4);
		c4.ajouter(600);
		c4.retirer(350);
		c4.ajouter(2600);
		c4.retirer(1200);
		System.out.println("*** Vérification d'un solde après plusieurs opérations (+600, -350, +2600, -1200) : ***");
		System.out.println("Solde Compte :" + c4.getSolde() + " EUR ***");
		assertEquals((int) 1650 , c4.getSolde());
	}

	@Test
	final void testGetNumero() {
		System.out.println("----- testGetNumero -----");
		Personne p5 = new Personne("Krueger Freddy");
		Compte c5 = new Compte(p5);
		c5.ajouter(0);
		System.out.println(Compte.getNumero());
		assertEquals((int) 9, c5.getNumero());
	}

	@Test
	final void testGetTitulaire() {
		System.out.println("----- testGetTitulaire -----");
		System.out.println("*** Test avec une personne ayant un compte ***");
		Personne p6 = new Personne("Franklin Ariane");
		Compte c6 = new Compte(p6);
		c6.ajouter(300);
		p6.ajouterCompte(c6);
		System.out.println("Num Compte/Solde  : " + c6.toString());
		System.out.println("Personne avec un seul compte : " + p6.toString());
		System.out.println("*** Test avec une personne ayant deux comptes ***");
		Personne p7 = new Personne("Stephen King");
		Compte c7 = new Compte(p7);
		c7.ajouter(200);
		p7.ajouterCompte(c7);
		System.out.println("Num Compte/Solde : " + c7.toString());
		Compte c8 = new Compte(p7);
		c8.ajouter(2000);
		p7.ajouterCompte(c8);
		System.out.println("Num Compte/Solde : " + c8.toString());
		System.out.println("Personne et sa liste de comptes : " + p7.toString());
		Personne p8 = new Personne("Alphonse Brown");
		System.out.println("*** Test avec une personne n'ayant aucun compte ***");
		System.out.println("Personne sans compte : " + p8.toString());
		assertEquals("Franklin Ariane [ 4 (300 EUR) ]", p6.toString());
		assertEquals((String) "Stephen King [ 5 (200 EUR) 6 (2000 EUR) ]", p7.toString());
		assertEquals((String) "Alphonse Brown [ ]", p8.toString());
	}

	@Test
	final void testToString() {
		System.out.println("----- testToString -----");
		Personne p8 = new Personne("Jeka MiAmor");
		Compte c8 = new Compte(p8);
		assertEquals((int) 3 +" ("+ c8.getSolde()+ " EUR)", c8.toString());

	}

}