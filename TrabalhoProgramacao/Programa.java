package TrabalhoProgramacao;
import java.util.Scanner;
import java.util.ArrayList;

public class Programa {
	
	public static void main(String[] args) {
		
		//CRIANDO UM OBJETOS DA CLASSE SCANNER
		Scanner scanner = new Scanner(System.in);
        int opcao= -1;
        
       
        Cliente.saveCliente();
        Servico.saveServico();
        Funcionario.saveFuncionario();
        
        if(opcao == 0) {
			System.out.println("Saindo...");
			System.exit(0);
		}else {
			//CHAMADA DO MENU INICIAL
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
	        Global.menu(opcao);
	        
		}
       
    }
	
	
}
