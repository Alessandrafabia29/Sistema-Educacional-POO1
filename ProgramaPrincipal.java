package SistemaEducacional;
import java.util.Scanner;
import java.util.ArrayList;

/*Implementação do estudo de caso de um Sistema Educacional para gerenciamento de informações. 
  Aluna: Fabia Alessandra*/

public class ProgramaPrincipal {
	static Scanner s = new Scanner(System.in);
	static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
	static ArrayList<Programas> listaProgramas = new ArrayList<>();
	static ArrayList<RegistrarFrequencia> listaFrequencias = new ArrayList<>();

	public static void main(String[] args) {
		int opcao ;  //Menu de opções 
		do {
			System.out.println("--SISTEMA INTEGRADO DE GESTAO ATIVIDADES ACADEMICAS--");
			System.out.println("[1] CADASTRAR PROGRAMA");
			System.out.println("[2] CADASTRAR USUARIO");
			System.out.println("[3] PESQUISAR USUARIO");
			System.out.println("[4] REGISTRAR FREQUENCIA");
			System.out.println("[5] MOSTAR DADOS CADASTRADOS");
			System.out.println("[6] MOSTAR PROGRAMAS CADASTRADOS");
			System.out.println("[7] MOSTAR FREQUENCIAS CADASTRADAS");
			System.out.println("[0]SAIR");
			System.out.println("Informe a opcao desejada:");
			opcao = Integer.parseInt(s.nextLine());
			
			switch (opcao) {
			case 1: cadastrarPrograma();
			break;
			case 2: cadastrarUsuario();
			break;
			case 3: pesquisarUsuario();
			break;
			case 4: registrarPresenca();
			break;
			case 5: mostraDados();
			break;
			case 6: mostraProgramas();
			break;
			case 7: mostraFrequencias();
			break;
			case 0: System.out.println("Encerrando o sistema...");
			break;
			default: System.out.println("Opcao invalida.");
			}
			
			
		}while(opcao != 0);
		
		
		
		
		
	}
		
		
		public static void cadastrarPrograma() {
		String continuar ="";
		
		do { 
			
			System.out.println("---CADASTRAR PROGRAMA---");
			System.out.println("Informe o tipo de Programa:[1]Projeto Extensão [2]Pesquisa [3]Monitoria [4]Atividade complementar");
			int tipo = Integer.parseInt(s.nextLine());
			System.out.println("Informe o nome do projeto:");
			String nomeProjeto = s.nextLine();
			System.out.println("Informe a duracao:");
			String duracao = s.nextLine();
			System.out.println("Informe a data de inicio:"); //atributos
			String dataInicial = s.nextLine();
			System.out.println("Informe a data Final:");
			String dataFinal = s.nextLine();
			System.out.println("Informe a sala:");
			int sala = Integer.parseInt(s.nextLine());
			System.out.println("Informe o departamento:");
			String departamento = s.nextLine();
			
			Programas oPrograma = new Programas(nomeProjeto,tipo,duracao,dataInicial,dataFinal,sala,departamento);
			//instanciando objeto e seus atributos
			
			listaProgramas.add(oPrograma); //adiciona o objeto na lista Array
			System.out.println("Programa cadastrado com Sucesso.");
			
			
			
			System.out.println("Deseja cadastrar outro programa: [Sim/Nao]");
			continuar = s.nextLine();
			
		}while(continuar.equalsIgnoreCase("SIM")); 
		
			
		
	}
		
	public static void cadastrarUsuario() {
		if (listaProgramas.isEmpty()) { //verificar se o arrayList está vazio
			System.out.println("ATENÇAO..NENHUM PROGRAMA CADASTRADO. Por favor, cadastre primeiro um programa (opcao 1) ");
			return;
		}
		String continuar = "";
		do {
			
		System.out.println("----CADASTRAR USUARIO----");
		
		System.out.println("---CADASTRO DO ENDERECO---");
		System.out.println("Informe a rua:");
		String rua = s.nextLine();
		System.out.println("Informe o bairro:");
		String bairro = s.nextLine();
		System.out.println("Informe o CEP:");
		String cep = s.nextLine();
		System.out.println("Informe a cidade:");
		String cidade = s.nextLine();
		System.out.println("Informe a Uf:");
		String uf = s.nextLine();
		
		Endereco oEndereco = new Endereco(rua,bairro,cep,cidade,uf);
		
		System.out.println("---CADASTRO DADOS PESSOAIS---");
		System.out.println("Informe o idUsuario:");
		int idUsuario = Integer.parseInt(s.nextLine());
		System.out.println("Informe o nome:");
		String nome = s.nextLine();
		System.out.println("Informe a idade:");  //atributos da classe pai-herança
		int idade = Integer.parseInt(s.nextLine());
		System.out.println("Informe o telefone:");
		String telefone = s.nextLine();
		
		System.out.println("Cadastrar Aluno ou Coordenador:");
		String opcao = s.nextLine();
		Usuario oUsuario;  //declara objeto para condicional herança-sub classe
		if (opcao.equalsIgnoreCase("ALUNO")) {
			
			System.out.println("Informe numero da matricula:");
			int matricula = Integer.parseInt(s.nextLine());
			
			System.out.println("Programas Cadastrados:"); //varre arrayList para confirmar indice do programa
			for(int i=0;i< listaProgramas.size();i++) {
				System.out.println("["+i+"]"+listaProgramas.get(i).getNomeProjeto());
			}
			System.out.println("Confirme o numero do programa:");
			int indice = Integer.parseInt(s.nextLine());
			if (indice < 0 || indice >= listaProgramas.size()) {
				System.out.println("Programa invalido. Cadastro cancelado."); //condicional validaçao de programas
				return;
			}
			Programas oPrograma = listaProgramas.get(indice); //armazena confirmação do indice
			
			oUsuario = new Aluno(matricula,oPrograma,idUsuario,nome,idade,telefone,oEndereco); //objeto oAluno
			System.out.println("--CADASTRO REALIZADO COM SUCESSO--");
			
			
		}else {   /*Coordenador*/
			System.out.println("Informe o departamento:");
			String departamentoCoord = s.nextLine();
			
			System.out.println("Programas Cadastrados:");
			for(int i=0;i< listaProgramas.size();i++) {
			System.out.println("["+i+"]"+listaProgramas.get(i).getNomeProjeto());}
			System.out.println("Confirme o numero do programa:");
			int indice = Integer.parseInt(s.nextLine());
			if (indice < 0 || indice > listaProgramas.size()) {
				System.out.println("Programa invalido. Cadastro cancelado."); //condicional validaçao
				return;
			}
			Programas oPrograma = listaProgramas.get(indice);
			oUsuario = new Coordenador(idUsuario,nome,idade,telefone,oEndereco,departamentoCoord,oPrograma);
			System.out.println("--CADASTRO REALIZADO COM SUCESSO--");
		}
		
	
		listaUsuarios.add(oUsuario);  //adiciona objeto lista Array
		
		System.out.println("Cadastrar outro usuario: [Sim/Nao]");
		continuar = s.nextLine();
		
		}while(continuar.equalsIgnoreCase("SIM"));
		
		
	}
	
	public static void registrarPresenca() {
		String continuar = "";
		do {
		System.out.println("----REGISTRO DE FREQUENCIA----");
		System.out.println("Informe a data:");
		String data = s.nextLine();
		System.out.println("informe o Aluno:");
		String alunoPresente = s.nextLine();
		System.out.println("Aluno: " +alunoPresente+ " Estado: Presente ");
		System.out.println("PRESENÇA REGISTRADA COM SUCESSO!");
		
		RegistrarFrequencia aPresenca = new RegistrarFrequencia(); //objeto
		aPresenca.setData(data);
		aPresenca.setAlunoPresente(alunoPresente);
		listaFrequencias.add(aPresenca); //adiciona arrayList
		
		System.out.println("Registrar outra Frequência: [Sim/Nao]");
		continuar = s.nextLine();
		
		}while(continuar.equalsIgnoreCase("SIM"));
	}
	 
	public static void pesquisarUsuario() {
		String continuar;
		do {
		System.out.println("---PESQUISAR USUARIO---");
		System.out.println("[1] Pesquisar Aluno:");
		System.out.println("[2] Pesquisar Coordenador:");
		int opcao = Integer.parseInt(s.nextLine());
		
		System.out.println("Informe o id do usuario:");
		int id = Integer.parseInt(s.nextLine());
		
		boolean encontrado = false;
		for(int i =0;i<listaUsuarios.size();i++) {
			Usuario oUsuario = listaUsuarios.get(i);
			if (oUsuario.getIdUsuario()==id) { // ids iguais-condicional
				if(opcao ==1 && oUsuario.getClass()== Aluno.class) { //opção 1 classe Aluno
					System.out.println("---ALUNO ENCONTRADO---");
					System.out.println(oUsuario.toString());
					encontrado = true;
					break;
				}else if (opcao ==2 && oUsuario.getClass() == Coordenador.class) {
					System.out.println("---COORDENADOR ENCONTRADO---");
					System.out.println(oUsuario.toString());
					encontrado = true;
					break;
				}
			}
			}
			if(!encontrado) {
				System.out.println("Usuario nao encontrado.");
			}
			System.out.println("Continuar pesquisando usuario:[SIM/NAO]");
			continuar = s.nextLine();
			
		}while(continuar.equalsIgnoreCase("SIM"));
			
			System.out.println("Pesquisa Encerrada.");
		
		
	}
	

		
	public static void mostraDados() {
		for(int i =0;i<listaUsuarios.size();i++) {
			System.out.println(listaUsuarios.get(i).toString());
			

}
	}
	public static void mostraProgramas() {
		for(int i =0;i<listaProgramas.size();i++) {
			System.out.println(listaProgramas.get(i).toString());
		}
	}
	public static void mostraFrequencias() {
		for(int i=0;i<listaFrequencias.size();i++) {
			System.out.println(listaFrequencias.get(i).toString());
		}
	}
	
	
}


