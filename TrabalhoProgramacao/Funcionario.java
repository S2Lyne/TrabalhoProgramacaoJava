package TrabalhoProgramacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario extends Pessoa {
	private int id;
	private String endereco;
	private double valorServico;
	
	public Global g = new Global();
	
	//Criando  o construtor
	public Funcionario(int id, String nome, String dataNascimento, String endereco, String telefone, String email) {
		super( nome, dataNascimento, telefone, email )
		this.id = id;
		this.endereco = endereco;
		
    }
	
	//Criando  o construtor sem parametro
	public Funcionario() {
		
	}
	
	//Criando método get
	public int getId() {
		return id;
	}

	// Criando o salario
	public double calculaSalario(double comissao) {
		double valorServico = comissao * 0.3;
		return valorServico;
	}	

	public void setId(int id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	//metódo que salvar o Funcionario com parametro
	 public static void saveFuncionario(Funcionario f) {
		Funcionario fun = new Funcionario();
	    ArrayList<Funcionario> func = new ArrayList<Funcionario>();
	    	
	    if(Global.funcionario.size() != 0) {
	    	func = (ArrayList)Global.funcionario.clone();
	    	Global.funcionario.clear();
	    	if(Global.funcionario.size() == 0) {
	    		System.out.println("limpou a lista");
	    	}
	    	
	    }    	
	    fun.setId(f.getId()); 
    	fun.setNome(f.getNome()); 
    	fun.setDataNascimento(f.getDataNascimento());
    	fun.setEndereco(f.getEndereco()); 
    	fun.setTelefone(f.getTelefone());
    	fun.setEmail(f.getEmail());
	    	
    	func.add(fun);
	    	
	    	
    	System.out.println("Funcionario salvo com sucesso!");
	    	
	    Global.funcionario.addAll(func);
	 }
	 
	//metódo que salvar o Funcionario
	public static void saveFuncionario() {

		ArrayList<Funcionario> func = new ArrayList<Funcionario>();
    	
		if(Global.funcionario.size() != 0) {
	    	func = (ArrayList)Global.funcionario.clone();
	    	
	    }else {
    		System.out.println("***Criando lista default***");
    		
    		//CRIANDO OS OBJETOS DE FUNCIONARIOS
            Funcionario funcionario1 = new Funcionario(1, "Aline Athaydes", "14/05/1995", "Ap #339-1801 Ornare Ave", "1-654-884-6326", "erat.eget@hotmail.com");
            func.add(funcionario1);
            Funcionario funcionario2 = new Funcionario(2, "Bianca Santos", "11/04/1998", "Ap #741-8033 Eu Avenue", "(121) 635-4780", "sem@outlook.net");
            func.add(funcionario2);
            Funcionario funcionario3 = new Funcionario(3, "Francine Solon", "11/10/1995", "Ap #769-4451 Eu Road", "1-443-237-1017", "purus@outlook.edu");
            func.add(funcionario3);
            Funcionario funcionario4 = new Funcionario(4, "Raquel Silva", "19/12/2000", "257-3408 Rhoncus. Av.", "1-648-835-8767", "ut.mi.duis@outlook.net");
            func.add(funcionario4);
            Funcionario funcionario5 = new Funcionario(5, "Marcos Vinicius", "06/08/2006", "P.O. Box 327, 8651 Tincidunt St.", "(265) 546-6263", "metus.aenean@google.net");
            func.add(funcionario5);
            Funcionario funcionario6 = new Funcionario(6, "Sarah Chagas", "25/07/2005", "Ap #821-4102 Sed Av.","1-617-738-6987", "elit.erat.vitae@icloud.org");
            func.add(funcionario6);
            Funcionario funcionario7 = new Funcionario(7, "Thiago Dotto", "28/10/1980", "Ap #821-4102 Sed Av.", "(532) 622-2182", "luctus.ipsum@google.com");
            func.add(funcionario7);
            //System.out.println("Salário do funcionário 1: R$" + salarioFuncionario1);
            
            System.out.println("Funcionarios salvo com sucesso!");
    	}
    	
    	Global.funcionario.addAll(func);
		   	
	}
	 
	//metódo que cadastrar o Funcionario
    public static void cadastrarFuncionario() {
        //int opcao = -1;
        Scanner scanner = new Scanner(System.in);
        Funcionario f = new Funcionario();
       
        
        System.out.println("Informe os dados do funcionário a ser cadastrado:");
    	System.out.println("id: ");
    	f.setId(scanner.nextInt()); 
    	System.out.println("Nome: ");
    	f.setNome(scanner.next()); 
    	System.out.println("data de nascimento: ");
    	f.setDataNascimento(scanner.next());
    	System.out.println("endereço: ");
    	f.setEndereco(scanner.next()); 
    	System.out.println("telefone: ");
    	f.setTelefone(scanner.next()); 
    	System.out.println("e-mail: ");
    	f.setEmail(scanner.next());
    	//System.out.println("Valor do serviço: ");
    	//valorServico_func = scanner.nextDouble();
    	
    	saveFuncionario(f);
    	scanner.close();
    }
    
  //metódo que update o funcionario
    public static void atualizarFuncionario() {
        //int opcao = -1;
        Scanner scanner = new Scanner(System.in);
        int idsc = -1;
        
        System.out.println("Informe o id do funcionario a ser atualizado: ");
        idsc = scanner.nextInt();
        
        for(int i = 0; i < Global.funcionario.size(); i++) {
        	Funcionario f1 = (Funcionario) Global.funcionario.get(i);
        	if(f1.getId() == idsc) {
        		System.out.println("Informe os dados do funcionário a ser atualizado:");
            	System.out.println("id: ");
            	f1.setId(scanner.nextInt());
            	System.out.println("Nome: ");
            	f1.setNome(scanner.next());
            	System.out.println("endereço: ");
            	f1.setEndereco(scanner.next());
            	System.out.println("telefone: ");
            	f1.setTelefone(scanner.next()); 
            	System.out.println("e-mail: ");
            	f1.setEmail(scanner.next());
        	}
        	Global.funcionario.set(i, f1);
        }
        System.out.println("Funcionario atualizado com sucesso!");
        scanner.close();
    }
    
  //metódo que lista o funcionario
    public static void listarFuncionario() {
    	
    	System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s\n", " Id ", " Nome ", " Data de Nasc ", " Endereço ", " Telefone ", " E-mail ");
    	for(int i = 0; i < Global.funcionario.size(); i++) {
    		Funcionario f1 = (Funcionario) Global.funcionario.get(i);    
    		//System.out.println(f1.getId() +"\t"+ f1.getNome()+"\t"+f1.getDataNascimento()+"\t"+ f1.getEndereco()+"\t"+ f1.getTelefone()+"\t"+ f1.getEmail());
        	System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s\n", f1.getId(), f1.getNome(), f1.getDataNascimento(), f1.getEndereco(), f1.getTelefone(), f1.getEmail());    	
        	
        }

    }
    
  
    
  //metódo que deleta o Funcionario
    public static void deletarFuncionario() {
    	Scanner scanner = new Scanner(System.in);
        int idsc = -1;
        
        System.out.println("Informe o id do funcionario a ser cancelado: ");
        idsc = scanner.nextInt();
        
        for(int i = 0; i < Global.funcionario.size(); i++) {
        	Funcionario f1 = (Funcionario) Global.funcionario.get(i);
        	if(f1.getId() == idsc) {
            	Global.funcionario.remove(f1);
            	System.out.println("Funcionario deletado com sucesso!");
        	}
        	
        }
        scanner.close();
    }

}
