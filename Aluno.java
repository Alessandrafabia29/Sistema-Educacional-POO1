package SistemaEducacional;

public class Aluno extends Usuario {
	private int matricula;
	
	public Aluno() {
		super();
		int matricula = 0;
	}
	
	public Aluno(int matricula,Programas oPrograma,int idUsuario,String nome,int idade,String telefone,Endereco oEndereco) {
		super(idUsuario,nome,idade,telefone,oEndereco,oPrograma);
		this.matricula = matricula;
		
	}
	
	public void setMatricula(int matricula) {this.matricula = matricula;}
	public int getMatricula() {return matricula;}
	
	public String toString() {
		return
		super.toString()+"\nMatricula:"+getMatricula();
	}
	

}

//Herança Usuário//sub classe