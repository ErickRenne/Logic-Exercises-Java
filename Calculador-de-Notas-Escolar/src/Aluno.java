
public class Aluno {
	private float nota1, nota2, nota3, nota4;
	private float mediaFinal;
	private String Aluno, turma;
	
	public Aluno(String aluno,String turma,float nota1,float nota2,float nota3,float nota4) {
		this.Aluno = aluno;
		this.turma = turma;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}

	public String getAluno() {
		return Aluno;
	}

	public void setAluno(String aluno) {
		Aluno = aluno;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getNota3() {
		return nota3;
	}

	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}

	public float getNota4() {
		return nota4;
	}

	public void setNota4(float nota4) {
		this.nota4 = nota4;
	}

	public float getMediaFinal() {
		return mediaFinal;
	}

	public void setMediaFinal(float mediaFinal) {
		this.mediaFinal = mediaFinal;
	}
	
}
