package base;

public class CalcHoraTrab {
	Trabalho trampo;
	
	public boolean cadastroTrabalhador(String nome, String turno, int horasEntrada, int horaSaida, int salarioPorHora) {
		trampo = new Trabalho(nome,turno ,horasEntrada, horaSaida, salarioPorHora);
		return true;
	}
	
	public int calHoras() {
		if(trampo.getTurno() == "Noite/Madrugada") {
			trampo.setSalario(((trampo.getHoraSaida() -trampo.getHorasEntrada() ) + 24)* trampo.getSalarioPorHora() );
			return trampo.getSalario();
		}else {
			 trampo.setSalario(((trampo.getHorasEntrada() - trampo.getHoraSaida())*-1)* trampo.getSalarioPorHora());
			return trampo.getSalario();
		}
	}
	public String salario() {
		return trampo.toString();
	}
}
