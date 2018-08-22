package question4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateurTest {

	@Test
	final void test() {
		System.out.println("Exemple pour un nombre positif");
		Calculateur c1 = new Calculateur(12);
		System.out.println(c1.toString());
		assertEquals((int)12,c1.valeurAbsolue());
		System.out.println("Exemple pour un nombre négatif");
		Calculateur c2 = new Calculateur(-12);
		System.out.println(c2.toString());
		assertEquals((int)12,c2.valeurAbsolue());
		System.out.println("Exemple pour un nombre = 0");
		Calculateur c3 = new Calculateur(0);
		System.out.println(c3.toString());
		assertEquals((int)0,c3.valeurAbsolue());
	}

}
