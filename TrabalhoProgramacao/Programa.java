package TrabalhoProgramacao;
import java.util.Scanner;
import java.util.ArrayList;

public class Programa {
	
	public static void main(String[] args) {
		
		//CRIANDO UM OBJETOS DA CLASSE SCANNER
		Scanner scanner = new Scanner(System.in);
        int opcao;
        
       
        Cliente.saveCliente();
        Servico.saveServico();
        Funcionario.saveFuncionario();
        
        //CHAMADA DO MENU INICIAL
        System.out.println("*********** SALÃO DAS DONZELAS DE TI *********** ");
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
        
     

        scanner.close();
    }
	
	
}
