package guia.modificadoresDos;

import guia.modificadoresDeAcceso.Modificador;

public class ModificadorHijo extends Modificador {
	public void usandoProtected() {
		this.shutUP();
		//no se puede acceder porque es package
//		this.tellMeAgain();
	}
}
