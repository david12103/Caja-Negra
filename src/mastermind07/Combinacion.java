package mastermind07;

public class Combinacion {

	int[] cadena;
	int colors = 5;

	public Combinacion(int size, int colors) {
		super();
		cadena = new int[size];
		this.colors = colors;
	}

	public Combinacion(int array[],int colors) {
		cadena=array;
		this.colors=colors;
	}
	public void generarCombinacion() {
		for (int i = 0; i < cadena.length; i++)
			cadena[i] = (int) (Math.random() * colors) + 1;
	}

	public void rellenarCombinacion(int array[]) {
		for (int i = 0; i < array.length; i++) {
			cadena[i] = array[i];
		}
	}

	public int getColors() {
		return colors;
	}

	public int getSize() {
		return cadena.length;
	}

	public int[] getCadena() {
		return cadena;
	}
}
