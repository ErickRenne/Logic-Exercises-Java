
public class CalcIMC {
	MassaCorpórea mc;
	
	public Boolean dados(float peso, float altura) {
		mc = new MassaCorpórea(peso, altura);
		return true ;
	}
	
	public float IMC() {
		mc.setResultado((mc.getPeso()/(mc.getAltura()*mc.getAltura())*10000));
		return mc.getResultado();
	
	}
	
	public String pazs() {
		if(mc.getResultado() < 18.5D) {
			String result = String.format("%.1f", mc.getResultado());
			return "Puro Osso " + result;
		}else if (mc.getResultado() <= 18.6D || mc.getResultado() < 24.9D) {
			String result = String.format("%.1f", mc.getResultado());
			return "OSSO E CARNE "+ result;
		}else if(mc.getResultado() <= 25.0D || mc.getResultado() < 29.9D) {
			String result = String.format("%.1f", mc.getResultado());
			return "CARNE E GORDURA "+ result;
		}else if(mc.getResultado() <= 30.0D || mc.getResultado() < 34.9D) {
			String result = String.format("%.1f", mc.getResultado());
			return "GORDURA E DIABETES "+ result;
		}else if(mc.getResultado() <= 35.0D || mc.getResultado() < 39.9D) {
			String result = String.format("%.1f", mc.getResultado());
			return "QUASE MORTO "+ result;
		}else if(mc.getResultado() > 40) {
			String result = String.format("%.1f", mc.getResultado());
			return "TÁ VIVO AINDA??? " + result;
		}
		return null;
	}
}
