package SistemaEducacional;

public class Programas {
	private String nomeProjeto;
	private int tipo;
	private String duracao;
	private String dataInicial;
	private String dataFinal;
	private int sala;
	private String departamento;
	
	public Programas() {
		String nomeProjeto = "";
		int tipo = 0;
		int duracao = 0;
		String dataInicial = "";
		String dataFinal = "";
		int sala = 0;
		String departamento = "";
	}
	
	public Programas(String nomeProjeto,int tipo,String duracao,String dataInicial,String dataFinal,int sala,String departamento) {
		this.nomeProjeto= nomeProjeto;
		this.tipo = tipo;
		this.duracao = duracao;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.sala = sala;
		this.departamento = departamento;
		}
	
	public void setNome(String nomeProjeto) {this.nomeProjeto = nomeProjeto;}
	public void setTipo(int tipo) {this.tipo = tipo;}
	public void setDuracao(String duracao) {this.duracao = duracao;}
	public void setDataInicial(String dataInicial) {this.dataInicial = dataInicial;}
	public void setDataFinal(String dataFinal) {this.dataFinal = dataFinal;}
	public void setSala(int sala) {this.sala = sala;}
	public void setDepartamento(String departamento) {this.departamento=departamento;}
	
	public String getNomeProjeto() {return nomeProjeto;}
	public int getTipo() {return tipo;}
	public String getDuracao() {return duracao;}
	public String getDataInicial() {return dataInicial;}
	public String getDataFinal() {return dataFinal;}
	public int getSala() {return sala;}
	public String getDepartamento() {return departamento;}
	
	public String toString() {
		String tipoPrograma;
		if (this.tipo==1) {
			tipoPrograma = "Projeto Extensao";
		}else if (this.tipo==2) {
			tipoPrograma = "Pesquisa";
		}else if (this.tipo ==3) {
			tipoPrograma = "Monitoria";
		}else if (this.tipo ==4) {
			tipoPrograma = "Atividade Complementar";
		}else {
			tipoPrograma = "Inválido.";
		}
		
		return "Nome do Projeto:"+getNomeProjeto()+"\nTipo:"+tipoPrograma+"\nDuracao:"+getDuracao()+"\nData Inicial:"+getDataInicial()+"\nData Final:"+getDataFinal()+"\nSala:"+getSala()+"\nDepartamento:"+getDepartamento();
	}
}

//Associação-Usuário//