package TrabalhoProgramacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Pessoa {
	private int id;
	private int idade;

	// criando construtor da classe
	public Cliente(int id, String nome, int idade, String dataNascimento, String telefone, String email) {
		super(nome, dataNascimento, telefone, email);
		this.id = id;
		this.idade = idade;

	}

	public Cliente() {
		super();
	}

	// criando get e set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	// fazendo metodo para envio de cupom
	public boolean isMetodoEnvioCupom() {
		return true;
	}

	// salvando serviço com parametro
	public static void saveCliente(Cliente c) {
		Cliente cli = new Cliente();
		ArrayList<Cliente> clien = new ArrayList<Cliente>();

		if (Global.cliente.size() != 0) {
			clien = (ArrayList) Global.cliente.clone();
			Global.cliente.clear();
			if (Global.cliente.size() == 0) {
				System.out.println("limpou a lista");
			}
		}

		cli.setId(c.getId());
		cli.setNome(c.getNome());
		cli.setIdade(c.getIdade());
		cli.setTelefone(c.getTelefone());
		cli.setEmail(c.getEmail());
		cli.setDataNascimento(c.getDataNascimento());

		clien.add(cli);

		System.out.println("Cliente salvo com sucesso!");

		Global.cliente.addAll(clien);

	}

	// salvando servico sem parametro para quando a lista estiver vazia gerar os
	// default
	public static void saveCliente() {
		ArrayList<Cliente> clien = new ArrayList<Cliente>();

		if (Global.servico.size() != 0) {
			clien = (ArrayList) Global.cliente.clone();

		} else {
			System.out.println("***Criando lista default***");

			// CRIANDO OS OBJETOS DE CLIENTES
			Cliente c1 = new Cliente(1, "Judah Mueller", 22, "(738) 250-7312", "ullamcorper.eu@protonmail.org",
					"01/04/1987");
			clien.add(c1);
			Cliente c2 = new Cliente(2, "Ana Silva", 19, "(11) 1234-5678", "ana.silva@example.com", "10/05/1995");
			clien.add(c2);
			Cliente c3 = new Cliente(3, "Pedro Santos", 24, "(21) 9876-5432", "pedro.santos@example.com", "15/09/1980");
			clien.add(c3);
			Cliente c4 = new Cliente(4, "Maria Oliveira", 56, "(31) 5555-1234", "maria.oliveira@example.com",
					"03/07/1988");
			clien.add(c4);
			Cliente c5 = new Cliente(5, "Lucas Costa", 19, "(41) 2222-3333", "lucas.costa@example.com", "18/12/2003");
			clien.add(c5);
			Cliente c6 = new Cliente(6, "Isabella Almeida", 50, "(12) 9999-8888", "isabella.almeida@example.com",
					"22/02/1973");
			clien.add(c6);
			Cliente c7 = new Cliente(7, "Isabella Almeida", 50, "(12) 9999-8888", "isabella.almeida@example.com",
					"22/02/1973");
			clien.add(c7);
			System.out.println("Clientes salvo com sucesso!");
		}

		Global.cliente.addAll(clien);

	}

	// metódo que cadastrar o Cliente
	public static void cadastrarCliente() {
		// int opcao = -1;
		Scanner scanner = new Scanner(System.in);
		Cliente c = new Cliente();
		int id;
		boolean idExistente = false;
		System.out.println("Informe os dados do cliente a ser cadastrado:");
		System.out.println("id: ");

		id = (scanner.nextInt());
		for (int i = 0; i < Global.cliente.size(); i++) {
			Cliente c1 = (Cliente) Global.cliente.get(i);
			if (c1.getId() == id) {
				idExistente = true;
				break;
			}
		}

		if (idExistente) {
			System.out.println("Id já existente, tente novamente!");
		} else {
			c.setId(id);
			System.out.println("Nome: ");
			c.setNome(scanner.next());
			System.out.println("idade: ");
			c.setIdade(scanner.nextInt());
			System.out.println("telefone: ");
			c.setTelefone(scanner.next());
			System.out.println("e-mail: ");
			c.setEmail(scanner.next());
			System.out.println("data de nascimento: ");
			c.setDataNascimento(scanner.next());

			saveCliente(c);
		}

	}

	// metódo que update o Cliente
	public static void atualizarCliente() {
		// int opcao = -1;
		Scanner scanner = new Scanner(System.in);
		int idsc = -1;
		boolean idExistente = false;
		System.out.println("Informe o id do cliente a ser atualizado: ");
		idsc = scanner.nextInt();

		for (int i = 0; i < Global.cliente.size(); i++) {
			Cliente c1 = (Cliente) Global.cliente.get(i);
			if (c1.getId() == idsc) {
				idExistente = true;
				break;
			}
		}

		if (idExistente) {
			Cliente c1 = (Cliente) Global.cliente.get(idsc);
			System.out.format("\t " + c1.getId() + "\t" + c1.getNome() + "\t" + c1.getIdade() + "\t" + c1.getTelefone()
			+ "\t" + c1.getEmail() + "\t" + c1.getDataNascimento());
			System.out.println(" ");
			System.out.println("Deseja realmente atualizar esse cliente? Se sim Digite 1");
			int atualizar= scanner.nextInt();
			if(atualizar==1) {
				System.out.println("Informe os dados do cliente a ser cadastrado:");
				System.out.println("telefone: ");
				c1.setTelefone(scanner.next());
				System.out.println("e-mail: ");
				c1.setEmail(scanner.next());

				Global.cliente.set(idsc, c1);
				System.out.println("Cliente atualizado com sucesso!");
			}
			
		} else {
			System.out.println("Cliente não encontrado, tente novamente!");
			
		}

	}

	// metódo que lista o Cliente
	public static void listarCliente() {
		System.out.println("********************* LISTA DE CLIENTES *********************");
		System.out.format(
				"\t Id\t " + "\t Nome\t " + "\t Idade\t " + "\t Telefone \t" + "\t E-mail \t" + "\t Data de Nasc \t");
		System.out.println(" ");
		// System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s\n", " Id ", " Nome ", "
		// Idade ", " Telefone ", " E-mail ", " Data de Nasc ");
		for (int i = 0; i < Global.cliente.size(); i++) {

			Cliente c1 = (Cliente) Global.cliente.get(i);
			System.out.format("\t " + c1.getId() + "\t" + c1.getNome() + "\t" + c1.getIdade() + "\t" + c1.getTelefone()
					+ "\t" + c1.getEmail() + "\t" + c1.getDataNascimento());
			System.out.println(" ");
		}
	}

	// metódo que deleta o Cliente
	public static void deletarCliente() {
		Scanner scanner = new Scanner(System.in);
		int idsc = -1;
		boolean idExistente = false;
		System.out.println("Informe o id do cliente a ser atualizado: ");
		idsc = scanner.nextInt();
		for (int i = 0; i < Global.cliente.size(); i++) {
			Cliente c1 = (Cliente) Global.cliente.get(i);
			if (c1.getId() == idsc) {
				idExistente = true;
			
			}
		}

		if (idExistente) {
			Cliente c1 = (Cliente) Global.cliente.get(idsc);
			System.out.format("\t " + c1.getId() + "\t" + c1.getNome() + "\t" + c1.getIdade() + "\t" + c1.getTelefone()
			+ "\t" + c1.getEmail() + "\t" + c1.getDataNascimento());
			System.out.println(" ");
			System.out.println("Deseja realmente excluir esse cliente? Se sim Digite 1");
			int excluir= scanner.nextInt();
			if(excluir==1) {
				Global.cliente.remove(c1);
				System.out.println("Funcionario deletado com sucesso!");
			}else{
				System.out.println("Opção inválida, tente novamente!");
			}
			
		} else {
			System.out.println("Cliente não encontrado, tente novamente!");
			
		}

	}

}
