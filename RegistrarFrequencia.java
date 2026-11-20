package SistemaEducacional;

public class RegistrarFrequencia {
	private String data;
	private String alunoPresente;
	private Aluno oAluno;
	private Programas oPrograma;
	
	public RegistrarFrequencia() {
		String data = "";
		String alunoPresente = "";
	}
	
	public RegistrarFrequencia(String data,String alunoPresente,Aluno oAluno,Programas oPrograma) {
		this.data = data;
		this.alunoPresente = alunoPresente;
		this.oAluno = oAluno;
		this.oPrograma = oPrograma;
	}
	
	public void setData(String data) {this.data = data;}
	public void setAlunoPresente(String alunoPresente) {this.alunoPresente = alunoPresente;}
	public void setOaluno(Aluno oAluno) {this.oAluno = oAluno;}
	public void setOprograma(Programas oPrograma) {this.oPrograma = oPrograma;}
	
	public String getData() {return data;}
	public String getAlunoPresente() {return alunoPresente;}
	public Aluno getOAluno() {return oAluno;}
	public Programas getOprograma() {return oPrograma;}
	
	public String toString() {
		return "data:"+getData()+"\nAluno:"+getAlunoPresente();  //chamar oAluno..oPrograma
	}
	
	
	
	
	
	
	
}
//DEPENDENCIA Usuário-ALUNO//Programas