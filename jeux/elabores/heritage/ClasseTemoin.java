package jeux.elabores.heritage;

//Ce fichier ne doit pas être modifié.
public class ClasseTemoin {
	public void heritage() {
		System.out.println((this instanceof InterfaceTemoin ? "" : "pur ") + "héritier");
	}
}
