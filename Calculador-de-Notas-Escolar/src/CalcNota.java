
public class CalcNota {
	private	Aluno aluno;

	
	public boolean cadastrarNota(String estudante, String turma,float nota1,float nota2,float nota3,float nota4) {
		aluno = new Aluno(estudante,turma,nota1, nota2, nota3, nota4);
		return true;
	}
	
	public float mediaAritimetica() {
		aluno.setMediaFinal((aluno.getNota1() + aluno.getNota2() + aluno.getNota3() + aluno.getNota4()) / 4);
		return aluno.getMediaFinal();
		
	}
	
	public String verificarAprovado() {
		System.out.println(aluno.getMediaFinal());
		if(aluno.getMediaFinal() >= 6.0) {
			return "Aprovado!";
		}else if(aluno.getMediaFinal() >= 5.0 ) {
			return "Recuperação";
		}else {
			return "Reprovado";
		}
	}
}
