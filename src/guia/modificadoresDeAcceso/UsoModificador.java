package guia.modificadoresDeAcceso;

public class UsoModificador {

	public void usandoCosas() {
		Modificador modificador=new Modificador();
		//en el mismo paquete
		modificador.tellMeAgain();
		modificador.shutUP();
		String ff;
	}
}
