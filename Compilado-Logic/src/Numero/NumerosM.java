package Numero;

public class NumerosM {
	private NumerosInteiros ni;
	
	public boolean cadastraNumero(int numero) {
		ni = new NumerosInteiros(numero);
		return true;
	}
	
	public int numeroSucessor() {
		ni.setResultado(ni.getNumero() + 1);  
		return ni.getResultado();
	}
	
	public int numeroAntecessor() {
		ni.setResultado(ni.getNumero() - 1);	
		return ni.getResultado();
	}
	
	public int metadeNumero() {
		ni.setResultado(ni.getNumero()/2);
		return ni.getResultado();
	}
	
	public String parOrImpa() {
		ni.setResultado(ni.getNumero()% 2);
	
		if(ni.getResultado() == 0) {
			return "par é "+ ni.getNumero() ;
		}else {
			return "Impar é " + ni.getNumero();
		}
	}
}
