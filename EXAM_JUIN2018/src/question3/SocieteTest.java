package question3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SocieteTest {

	@Test
	final void test() {
		
		System.out.println("*** Exemple Employé ***");
		Employe e1 = new Employe("Dupont", "Etienne", 1, 1200);
		System.out.println("On vérifie que notre employé est bien un travailleur");
		System.out.print("Info de l'employé : ");
		System.out.println(e1.toString());
		assertEquals("1 - Dupont Etienne", e1.toString());
		System.out.println("*** Exemple Employé qui est un commercial ***");
		Commercial com1 = new Commercial("Davis","Philippe", 1 ,1800);
		System.out.print("Info du commercial : ");
		System.out.println(com1.toString());
		assertEquals("1 - Davis Philippe [0 vente(s) ce mois]", com1.toString());
		com1.ajouteVente();
		com1.ajouteVente();
		com1.ajouteVente();
		System.out.print("On rajoute trois ventes pour le mois en cours : ");
		System.out.println(com1.toString());
		System.out.print("On calcule le salaire auquel il a droit sur base de ses ventes : ");
		System.out.println(com1.getSalaire() + " EUR");
		assertEquals(2100, com1.getSalaire());
		System.out.print("On remet les ventes à zéro pour un nouveau mois commencé : ");
		com1.razVente();
		System.out.println(com1.toString());
		System.out.println("*** Exemple Employé qui est un cadre ***");
		Cadre cadre1 = new Cadre("CEO","Ochon", "Paul", 1, 3500);
		System.out.println("Rajout de 2 subordonnés au cadre");
		cadre1.ajouteSubordonne();
		cadre1.ajouteSubordonne();
		System.out.print("Info du cadre : ");
		System.out.println(cadre1.toString());
		System.out.print("On calcule le salaire auquel a droit ce cadre : ");
		System.out.println(cadre1.getSalaire() + " EUR");
		assertEquals(3500, cadre1.getSalaire());
		assertEquals("CEO 1 - Paul Ochon (2 subordonnés)", cadre1.toString());
		System.out.println("**************************************************************************************************");
		
	}
}


