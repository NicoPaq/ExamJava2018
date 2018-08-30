package question1;

/* 
 * @author NicoPaq
 * */


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompteTest {

	@Test
	final void testCompte() {
		System.out.println("----- testCompte -----");
		System.out.println("*** Création d'un compte : ***");
		Personne p8 = new Personne("Dupont Jacques");
		p8.ajouterCompte();
		Compte cpt8 = p8.getCompte(8);
		System.out.println("Num Compte/Solde : " + cpt8.toString());
		assertEquals((String)("8 (0 EUR)"), cpt8.toString());
	}

	@Test
	final void testAjouter() {
		System.out.println("----- testAjouter -----");
		System.out.println("*** Rajout de 200 Euros sur le compte : ***");
		Personne p2 = new Personne("Durant Etienne");
		p2.ajouterCompte();
		Compte cpt2 = p2.getCompte(2);
		if (cpt2 != null) {
			p2.getSolde(cpt2);
			p2.depot(cpt2, 200);
			System.out.println("Num Compte/Solde : " + cpt2.toString());
			assertEquals((int) 200, p2.getSolde(cpt2));
			assertFalse(cpt2.ajouter(-200));
		}
	}

	@Test
	final void testRetirer() {
		System.out.println("----- testRetirer -----");
		Personne p7 = new Personne("Duprez Jacques");
		p7.ajouterCompte();
		// Retrait sur base d'un solde non disponible
		System.out.println("*** Retrait de 200 Euros sur base d'un solde de 0 Euros : ***");
		Compte cpt7 = p7.getCompte(7);
		p7.retrait(cpt7, 200);
		System.out.println("Num Compte/Solde : " + cpt7.toString());
		assertEquals((int) 0, p7.getSolde(cpt7));
		// On vérifie le cas d'un retrait négatif
		System.out.println("*** Retrait d'un montant négatif d'un compte (-200 Euros) : ***");
		assertFalse(cpt7.retirer(-200));
		System.out.println("Num Compte/Solde : " + cpt7.toString());
		assertEquals((int) 0, cpt7.getSolde());
		// Retrait sur base d'un solde disponible
		System.out.println("*** Retrait d'un montant de 500 Euros sur un disponible de 1500 Euros : ***");
		p7.depot(cpt7, 1500);
		p7.retrait(cpt7,  500);
		System.out.println("Num Compte/Solde : " + cpt7.toString());
		assertEquals((int) 1000, cpt7.getSolde());
	}

	@Test
	final void testGetSolde() {
		System.out.println("----- testGetSolde -----");
		Personne p1 = new Personne("Arnould Melody");
		p1.ajouterCompte();
		Compte cpt1 = p1.getCompte(1);
		p1.depot(cpt1, 600);
		p1.retrait(cpt1, 350);
		p1.depot(cpt1, 2600);
		p1.retrait(cpt1, 1200);
		System.out.println("*** Vérification d'un solde après plusieurs opérations (+600, -350, +2600, -1200) : ***");
		System.out.println("Solde Compte :" + p1.getSolde(cpt1) + " EUR ***");
		assertEquals((int) 1650 , p1.getSolde(cpt1));
	}

	@Test
	final void testGetNumero() {
		System.out.println("----- testGetNumero -----");
		Personne p5 = new Personne("Krueger Freddy");
		Compte c5 = new Compte(p5);
		c5.ajouter(0);
		System.out.println(c5.getNumero());
		assertEquals((int) 9, c5.getNumero());
	}

	@Test
	final void testGetTitulaire() {
		System.out.println("----- testGetTitulaire -----");
		System.out.println("*** Test avec une personne ayant un compte ***");
		Personne p4 = new Personne("Franklin Ariane");
		p4.ajouterCompte();
		Compte cpt4 = p4.getCompte(4);
		p4.depot(cpt4, 300);
		System.out.println("Num Compte/Solde  : " + cpt4.toString());
		System.out.println("Personne avec un seul compte : " + p4.toString());
		System.out.println("*** Test avec une personne ayant deux comptes ***");
		Personne p5 = new Personne("Stephen King");
		p5.ajouterCompte();
		Compte cpt5 = p5.getCompte(5);
		p5.depot(cpt5, 200);
		System.out.println("Num Compte/Solde : " + cpt5.toString());
		p5.ajouterCompte();
		Compte cpt6 = p5.getCompte(6);
		p5.depot(cpt6, 2000);
		System.out.println("Num Compte/Solde : " + cpt6.toString());
		System.out.println("Personne et sa liste de comptes : " + p5.toString());
		Personne p6 = new Personne("Alphonse Brown");
		System.out.println("*** Test avec une personne n'ayant aucun compte ***");
		System.out.println("Personne sans compte : " + p6.toString());
		assertEquals("Franklin Ariane [ 4 (300 EUR) ]", p4.toString());
		assertEquals((String) "Stephen King [ 5 (200 EUR) 6 (2000 EUR) ]", p5.toString());
		assertEquals((String) "Alphonse Brown [ ]", p6.toString());
	}

	@Test
	final void testToString() {
		System.out.println("----- testToString -----");
		Personne p3 = new Personne("Dean Koontz");
		p3.ajouterCompte();
		Compte cpt3 = p3.getCompte(3);
		System.out.println("Num Compte/Solde : " + cpt3.toString());
		assertEquals((int) 3 +" ("+ p3.getSolde(cpt3)+ " EUR)", cpt3.toString());

	}

}