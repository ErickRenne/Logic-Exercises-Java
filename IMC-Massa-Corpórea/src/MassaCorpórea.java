
public class MassaCorpórea {
	private int idade;
	private float altura;
	private float peso;
	private boolean genero;
	private float resultado;
	
	public MassaCorpórea(float peso, float altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "MassaCorpórea [resultado=" + resultado + "]";
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public boolean isGenero() {
		return genero;
	}

	public void setGenero(boolean genero) {
		this.genero = genero;
	}

	public float getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
	
}
