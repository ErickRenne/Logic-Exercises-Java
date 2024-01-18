
public class Teste {
	public  static void main(String[]args) {
		CalcNota cn = new CalcNota();
		
		cn.cadastrarNota(null,null,10, 10, 6, 10);
		cn.mediaAritimetica();
		
		System.out.println(cn.verificarAprovado());
	}
	
}
