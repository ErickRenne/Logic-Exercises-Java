package base;

public class Trabalho {
	private int horasEntrada, horaSaida, salarioPorHora, salario;
	private String nome, turno;
	
	public Trabalho(String nome,String turno, int horasEntrada, int horaSaida, int salarioPorHora) {
		this.nome = nome;
		this.horasEntrada = horasEntrada;
		this.horaSaida = horaSaida;
		this.turno = turno;
		this.salarioPorHora = salarioPorHora;
	}
	
	@Override
	public String toString() {
		return "Trabalho [salario = " + getSalario() + "]";
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getHorasEntrada() {
		return horasEntrada;
	}
	public void setHorasEntrada(int horasEntrada) {
		this.horasEntrada = horasEntrada;
	}
	public int getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}
	public int getSalarioPorHora() {
		return salarioPorHora;
	}
	public void setSalarioPorHora(int salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
