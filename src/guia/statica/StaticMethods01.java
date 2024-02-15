package guia.statica;

public class StaticMethods01 {

	public int valor;
	public static int valorEstatico;
	public static boolean giveME() {
		return true;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public static int getValorEstatico() {
		return valorEstatico;
	}
	public static void setValorEstatico(int valorEstatico) {
		StaticMethods01.valorEstatico = valorEstatico;
	}
	
	
}
