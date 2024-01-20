package base;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcHoraTrab ch = new CalcHoraTrab();
		
		ch.cadastroTrabalhador("Erick", "noiteMadrugada", 21, 6, 5);
		ch.calHoras();
		
		System.out.println(ch.salario());
	}

}
