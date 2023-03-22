package tests;

import org.junit.Test;

import exercices.Exo2SupportJeuxElabores;
import tests.utils.TestWithOutputCapture;

public class Test2SupportJeuxElabores extends TestWithOutputCapture {
	@Test
	public void testMatchNul() {
		checkDefeat(Exo2SupportJeuxElabores.exoMatchNul());
		checkOutput("Match nul");
	}

	//------------------------------------------------------
	@Test
	public void testBugge() {
		checkVictory(Exo2SupportJeuxElabores.exoBugge());
		checkOutput("Faute de programmation");
	}

	@Test
	public void testMalConfigure() {
		checkVictory(Exo2SupportJeuxElabores.exoMalConfigure());
		checkOutput("Faute contextuelle");
	}

	//------------------------------------------------------
	@Test
	public void testHeritage() {
		checkVictory(Exo2SupportJeuxElabores.exoHeritage());
		checkOutput("pur h�ritier", "gagn�");
	}

	@Test
	public void testInterface() {
		checkVictory(Exo2SupportJeuxElabores.exoInterface());
		checkOutput("impl�mentation par d�faut", "gagn�");
	}

	@Test
	public void testInterfaceEtHeritage() {
		checkVictory(Exo2SupportJeuxElabores.exoInterfaceEtHeritage());
		checkOutput("h�ritier", "gagn�");
	}

	//------------------------------------------------------
	@Test
	public void testAvecDonneeStatique() {
		checkVictory(Exo2SupportJeuxElabores.exoAvecDonneeStatique());
		checkOutput("gagn�", "gagn�");
	}

	//------------------------------------------------------
	@Test
	public void testGagneOuPerd() {
		checkVictory(Exo2SupportJeuxElabores.exoGagneOuPerd(new String[]{"gagne"}));
		checkOutput("gagn�");
		checkDefeat(Exo2SupportJeuxElabores.exoGagneOuPerd(new String[]{"perd"}));
		checkOutput("dommage");
	}
}
