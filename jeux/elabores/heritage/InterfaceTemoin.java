package jeux.elabores.heritage;

// Ce fichier ne doit pas �tre modifi�.
public interface InterfaceTemoin {
	default void heritage() {
		System.out.println("impl�mentation par d�faut");
	}
}
