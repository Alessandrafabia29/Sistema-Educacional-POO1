package SistemaEducacional;

public class Usuario {
	private int idUsuario;
	private String nome;
	private int idade;
	private String telefone;
	private Endereco oEndereco;
	private Programas oPrograma;
	
	public Usuario() {
		int idUsuario = 0;
		String nome = "";
		int idade = 0;
		String telefone = "";
	}
	
	public Usuario(int idUsuario,String nome,int idade,String telefone,Endereco oEndereco,Programas oPrograma) {
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.oEndereco = oEndereco; 
		this.oPrograma = oPrograma;
	}
	
	public void setIdUsuario(int idUsuario) {this.idUsuario = idUsuario;}
	public void setNome(String nome) {this.nome = nome;}
	public void setIdade(int idade) {this.idade = idade;}
	public void setTelefone(String telefone) {this.telefone = telefone;}
	public void setOendereco(Endereco oEndereco) {this.oEndereco = oEndereco;} 
	public void setOprograma(Programas oPrograma) {this.oPrograma = oPrograma;}
	
	public int getIdUsuario() {return idUsuario;}
	public String getNome() {return nome;}
	public int getIdade() {return idade;}
	public String getTelefone() {return telefone;}
	public Endereco getOEndereco() {return oEndereco;}
	public Programas getOprograma() {return oPrograma;}
	
	public String toString() {
		return "idUsuario:"+getIdUsuario()+"\nNome:"+getNome()+"\nIdade:"+getIdade()+"\nTelefone:"+getTelefone()+"\n"+oEndereco.toString()+"\n"+oPrograma.toString();
	}
	

}
//Usuário é uma classe pai-mãe