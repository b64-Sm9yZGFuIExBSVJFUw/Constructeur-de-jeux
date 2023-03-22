package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import exercices.Exo1JeuxBasiques;
import tests.utils.TestWithOutputCapture;

public class Test1JeuxBasiques extends TestWithOutputCapture {
	@Test
	public void testPileOuFace() {
		Boolean b = Exo1JeuxBasiques.exoPileOuFace();
		assertNotNull("La m�thode doit retourner une valeur", b);
		if (b)
			assertEquals("gagn�" + System.lineSeparator(), getOut());
		else
			assertEquals("dommage" + System.lineSeparator(), getOut());
	}

	@Test
	public void testJoueur() {
		checkVictory(Exo1JeuxBasiques.exoJoueur(true));
		checkOutput("gagn�");
		checkDefeat(Exo1JeuxBasiques.exoJoueur(false));
		checkOutput("dommage");
		// 2 appels successifs (test la bonne r�initialisatiion)
		checkVictory(Exo1JeuxBasiques.exoJoueur(true));
		checkDefeat(Exo1JeuxBasiques.exoJoueur(false));
		checkOutput("gagn�", "dommage");
	}
}
