package Numero;

public class NumerosInteiros {
	private int numero;
	private int resultado;
	
	public NumerosInteiros(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "NumerosInteiros [numero = " + numero ;
	}
	
}
