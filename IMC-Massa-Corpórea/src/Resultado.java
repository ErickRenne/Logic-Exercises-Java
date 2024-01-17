
public class Resultado {
	public static void main(String[]args) {
		CalcIMC cm = new CalcIMC();
		
		cm.dados(1000f, 170f);
		cm.IMC();
		System.out.printf(cm.pazs());
	}
}
