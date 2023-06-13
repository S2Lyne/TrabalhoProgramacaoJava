package TrabalhoProgramacao;
import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;

public class Global {
	public static ArrayList<Cliente> cliente = new ArrayList<Cliente>();
	public static ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
	public static ArrayList<Servico> servico = new ArrayList<Servico>();
	
	public static void menu(int op) {
		Scanner scanner = new Scanner(System.in);
		int opcao = op;
		while (opcao != 0) {
			
			if(opcao == 0) {
				
				System.out.println("Saindo...");
				System.exit(0);
				
			}else {
				switch (opcao) {
	        	case 1:
	        		cadastrarMenu(opcao);  // Chama o método para exibir o menu de cadastro
	                break;
	        	case 2:
	        		atualizarMenu(opcao);  // Chama o método para exibir o menu de atualização
	                break;
	            case 3:
	                 deletarMenu(opcao);  // Chama o método para exibir o menu de exclusão
	                 break;
	            case 4:
	            	 listarMenu(opcao);
	            	//atendimento();  // Chama o método para o atendimento
	                break;
	            case 0:
	            	System.out.println("Saindo...");
	                break;
	            default:
	                System.out.println("Opção inválida. Tente novamente.");
	                break;
  
	        }
	        
	        //chamada de menu inicial
	        System.out.println("************* SALÃO DAS DONZELAS *************** ");
	        System.out.println("**************** MENU PRINCIPAL **************** ");
	        System.out.println("************* Selecione uma opção: ************* ");
	        System.out.println("**************** 1 - Cadastrar ***************** ");
	        System.out.println("**************** 2 - Atualizar ***************** ");
	        System.out.println("**************** 3 - Deletar ******************* ");
	        System.out.println("**************** 4 - Listar ******************** ");
	        //System.out.println("**************** 4 - Atendimento *************** ");
	        System.out.println("**************** 0 - SAIR ********************** ");
	        
	        opcao = scanner.nextInt();
				
			}

	        
	     }
		
	}

	 //metódo que chama o menu de cadastrar
    public static void cadastrarMenu( int op) {
        int opcao = op;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("************************ CADASTRAR ************************ ");
        System.out.println("******************* Selecione uma opção: ****************** ");
        System.out.println("*********************** 1 - Cliente *********************** ");
        System.out.println("*********************** 2 - Funcionário ******************* ");
        System.out.println("*********************** 3 - Serviço *********************** ");
        //System.out.println("*********************** 4 - Voltar ao Menu Anterior ******* ");
        
        opcao = scanner.nextInt();

        while (opcao != 0) {

            switch (opcao) {
                case 1:
                	Cliente.cadastrarCliente();  // Chama o método para cadastrar um cliente
                    break;
                case 2:
                	Funcionario.cadastrarFuncionario();  // Chama o método para cadastrar um funcionário
                    break;
                case 3:
                	Servico.cadastrarServico();  // Chama o método para cadastrar um serviço
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println(" ");
            System.out.println(" ");
	        System.out.println("************* SALÃO DAS DONZELAS *************** ");
	        System.out.println("**************** MENU PRINCIPAL **************** ");
	        System.out.println("************* Selecione uma opção: ************* ");
	        System.out.println("**************** 1 - Cadastrar ***************** ");
	        System.out.println("**************** 2 - Atualizar ***************** ");
	        System.out.println("**************** 3 - Deletar ******************* ");
	        System.out.println("**************** 4 - Listar ******************** ");
	        //System.out.println("**************** 4 - Atendimento *************** ");
	        System.out.println("**************** 0 - SAIR ********************** ");
	        
	        opcao = scanner.nextInt();
	        
	        if(opcao == 0) {
				System.out.println("Saindo...");
				System.exit(0);
			}else {
				menu(opcao);
			}
        }
        
    }

    //metódo que chama o menu de update
    public static void atualizarMenu(int op) {
        int opcao = op;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("************************ ATUALIZAR ************************ ");
        System.out.println("******************* Selecione uma opção: ****************** ");
        System.out.println("*********************** 1 - Cliente *********************** ");
        System.out.println("*********************** 2 - Funcionário ******************* ");
        System.out.println("*********************** 3 - Serviço *********************** ");
        //System.out.println("*********************** 4 - Voltar ao Menu Anterior ******* ");
        
        opcao = scanner.nextInt();
        
        while (opcao != 0) {

            switch (opcao) {
                case 1:
                    Cliente.atualizarCliente();  // Chama o método para atualizar um cliente
                    break;
                case 2:
                    Funcionario.atualizarFuncionario();  // Chama o método para atualizar um funcionário
                    break;
                case 3:
                    Servico.atualizarServico();  // Chama o método para atualizar um serviço
                    break;
                
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            System.out.println(" ");
            System.out.println(" ");
          //chamada de menu inicial
	        System.out.println("************* SALÃO DAS DONZELAS *************** ");
	        System.out.println("**************** MENU PRINCIPAL **************** ");
	        System.out.println("************* Selecione uma opção: ************* ");
	        System.out.println("**************** 1 - Cadastrar ***************** ");
	        System.out.println("**************** 2 - Atualizar ***************** ");
	        System.out.println("**************** 3 - Deletar ******************* ");
	        System.out.println("**************** 4 - Listar ******************** ");
	        //System.out.println("**************** 4 - Atendimento *************** ");
	        System.out.println("**************** 0 - SAIR ********************** ");
	        
	        opcao = scanner.nextInt();
	        
	        if(opcao == 0) {
				System.out.println("Saindo...");
				System.exit(0);
			}else {
				menu(opcao);
			}
        }
        
    }

    //metódo que chama o menu de deletar
    public static void deletarMenu(int op) {
        int opcao = -1;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("************************* DELETAR ************************* ");
        System.out.println("******************* Selecione uma opção: ****************** ");
        System.out.println("*********************** 1 - Cliente *********************** ");
        System.out.println("*********************** 2 - Funcionário ******************* ");
        System.out.println("*********************** 3 - Serviço *********************** ");
        //System.out.println("*********************** 4 - Voltar ao Menu Anterior ******* ");
        
        opcao = scanner.nextInt();

        while (opcao != 0) {

            switch (opcao) {
                case 1:
                    Cliente.deletarCliente();  // Chama o método para deletar um cliente
                    break;
                case 2:
                    Funcionario.deletarFuncionario();  // Chama o método para deletar um funcionário
                    break;
                case 3:
                    Servico.deletarServico();  // Chama o método para deletar um serviço
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            System.out.println(" ");
            System.out.println(" ");
          //chamada de menu inicial
	        System.out.println("************* SALÃO DAS DONZELAS *************** ");
	        System.out.println("**************** MENU PRINCIPAL **************** ");
	        System.out.println("************* Selecione uma opção: ************* ");
	        System.out.println("**************** 1 - Cadastrar ***************** ");
	        System.out.println("**************** 2 - Atualizar ***************** ");
	        System.out.println("**************** 3 - Deletar ******************* ");
	        System.out.println("**************** 4 - Listar ******************** ");
	        //System.out.println("**************** 4 - Atendimento *************** ");
	        System.out.println("**************** 0 - SAIR ********************** ");
	        
	        opcao = scanner.nextInt();
	        
	        if(opcao == 0) {
				System.out.println("Saindo...");
				System.exit(0);
			}else {
				menu(opcao);
			}
        }
     
    }
    
  //metódo que chama o menu de listar
    public static void listarMenu(int op) {
        int opcao = -1;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("************************* LISTAR ************************* ");
        System.out.println("******************* Selecione uma opção: ****************** ");
        System.out.println("*********************** 1 - Cliente *********************** ");
        System.out.println("*********************** 2 - Funcionário ******************* ");
        System.out.println("*********************** 3 - Serviço *********************** ");
        //System.out.println("*********************** 4 - Voltar ao Menu Anterior ******* ");
        
        opcao = scanner.nextInt();

        while (opcao != 0) {

            switch (opcao) {
                case 1:
                	if(cliente.size() == 0) {
	            		System.out.println("Lista vazia gerando valores default: ");
	            		
	            		Cliente.saveCliente();
            		}
                	Cliente.listarCliente();  // Chama o método para deletar um cliente
                    break;
                case 2:
                	if(funcionario.size() == 0) {
                		System.out.println("Lista vazia gerando valores default: ");
                		
                		//Funcionario.saveFuncionario();
                	}
                	Funcionario.listarFuncionario();  // Chama o método para deletar um funcionário
                    break;
                case 3:
                	if(servico.size() == 0) {
                		System.out.println("Lista vazia gerando valores default: ");
                		
                		Servico.saveServico();
                	}
                	Servico.listarServico();  // Chama o método para deletar um serviço
                    break;
                
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;

            }
            System.out.println(" ");
            System.out.println(" ");
          //chamada de menu inicial
	        System.out.println("************* SALÃO DAS DONZELAS *************** ");
	        System.out.println("**************** MENU PRINCIPAL **************** ");
	        System.out.println("************* Selecione uma opção: ************* ");
	        System.out.println("**************** 1 - Cadastrar ***************** ");
	        System.out.println("**************** 2 - Atualizar ***************** ");
	        System.out.println("**************** 3 - Deletar ******************* ");
	        System.out.println("**************** 4 - Listar ******************** ");
	        //System.out.println("**************** 4 - Atendimento *************** ");
	        System.out.println("**************** 0 - SAIR ********************** ");
	        
	        opcao = scanner.nextInt();
	        
	        if(opcao == 0) {
				System.out.println("Saindo...");
				System.exit(0);
			}else {
				menu(opcao);
			}
        }
      
    }

}
