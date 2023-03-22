package tests;

import org.junit.Test;

import exercices.Exo3CompositionsSimples;
import tests.utils.TestWithOutputCapture;

public class Test3CompositionsSimples extends TestWithOutputCapture {
	@Test
	public void testPuisSinon() {
		checkVictory(Exo3CompositionsSimples.exoPuisSinon(false, true));
		checkOutput("dommage", "gagn�");
		checkDefeat(Exo3CompositionsSimples.exoPuisSinon(false, false));
		checkOutput("dommage", "dommage");
		checkVictory(Exo3CompositionsSimples.exoPuisSinon(true, true));
		checkOutput("gagn�");
		checkVictory(Exo3CompositionsSimples.exoPuisSinon(true, false));
		checkOutput("gagn�");
	}

	//------------------------------------------------------
	@Test
	public void testEtAussi() {
		checkVictory(Exo3CompositionsSimples.exoEtAussi(true, true));
		checkOutput("gagn�", "gagn�");
		checkDefeat(Exo3CompositionsSimples.exoEtAussi(true, false));
		checkOutput("gagn�", "dommage");
		checkDefeat(Exo3CompositionsSimples.exoEtAussi(false, true));
		checkOutput("dommage");
		checkDefeat(Exo3CompositionsSimples.exoEtAussi(false, false));
		checkOutput("dommage");
	}
	
	//------------------------------------------------------
	@Test
	public void testEnAuPlus() {
		for (int i = 1; i < 3; ++i) {
			checkVictory(Exo3CompositionsSimples.exoEnAuPlus(true, 3));
			checkOutput("gagn�");
		}
		checkDefeat(Exo3CompositionsSimples.exoEnAuPlus(false, 3));
		checkOutput("dommage", "dommage", "dommage");
	}
	
	//------------------------------------------------------
	@Test
	public void testJusquaLaVictoire() {
		checkVictory(Exo3CompositionsSimples.exoJusquaLaVictoire());
		checkOutput("gagn�");
	}
}
