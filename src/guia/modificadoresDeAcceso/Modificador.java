package guia.modificadoresDeAcceso;

public class Modificador {

	//solo desde la propia clase
	private boolean tellMe() {
		return true;
	}
	//pacakge desde cualquier clase si esta en el mismo paquete
	boolean tellMeAgain() {
		return true;
	}
	// desde cualquier package si extiende 
	protected boolean shutUP() {
		return true;
	}
	//desde cualquier sitio
	public boolean reUseing() {
		return tellMe();
	}
}
