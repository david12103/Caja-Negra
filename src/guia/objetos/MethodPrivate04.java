package guia.objetos;

public class MethodPrivate04 {

	private boolean tellMe() {
		return true;
	}
	
	public boolean usadorDePrivado() {
		boolean tell = tellMe();
		return !tell;
	}
}
