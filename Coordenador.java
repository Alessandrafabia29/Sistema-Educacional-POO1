package SistemaEducacional;

public class Coordenador extends Usuario {
	private String departamentoCoord;
	
	
	public Coordenador() {
		super();
		String departamentoCoord = "";
	}
	
	public Coordenador(int idUsuario,String nome,int idade,String telefone,Endereco oEndereco,String departamentoCoord,Programas oPrograma) {
		super(idUsuario,nome,idade,telefone,oEndereco,oPrograma);
		this.departamentoCoord = departamentoCoord;
		
	}
	
	public void setDepartamentoCoord(String departamentoCoord) {this.departamentoCoord = departamentoCoord;}
	public String getDepartamentoCoord() {return departamentoCoord;}
	
	public String toString() {
		return
				super.toString()+"\nDepartamento:"+getDepartamentoCoord();
	}

	
}

//Herança Usuario//sub classe