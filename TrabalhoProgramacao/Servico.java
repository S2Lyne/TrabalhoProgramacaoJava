package TrabalhoProgramacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Servico {
	private int id;
    private String nome;
    private double valor;
    private String[] listaProdutos;

   
     public Servico(int id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        
    }
     public Servico() {
    	 
     }
         
    public int getId() {
        return  this.id;
    }
    
    public void setId(int id) {
    	this.id = id;
    }

    public String getNome() {
        return this. nome;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }

    public double getValor() {
        return this. valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void getListaProdutos() {
    	
    	for(int i = 0; i < this.listaProdutos.length;i++ ) {
    		System.out.println(this.listaProdutos[i]);
    	}
        
    }

    public void setListaProdutos(String[] listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
    
    //salvando serviço com parametro
    public static void saveServico(Servico s) {
    	Servico serv = new Servico();
    	ArrayList<Servico> servi = new ArrayList<Servico>();
    	
    	if(Global.servico.size() != 0) {
    		servi = (ArrayList)Global.servico.clone();
    		Global.servico.clear();
    		if(Global.servico.size() == 0) {
    			System.out.println("limpou a lista");
    		}
    	}    	
    	
    	serv.setId(s.getId());
    	serv.setNome(s.getNome());
    	serv.setValor(s.getValor());
    	
    	servi.add(serv);
    	
    	System.out.println("Serviço salvo com sucesso");
    	
    	Global.servico.addAll(servi);
    	
    }
    
    //salvando servico sem parametro para quando a lista estiver vazia gerar os default
    public static void saveServico() {
    	ArrayList<Servico> servi = new ArrayList<Servico>();
    	
    	if(Global.servico.size() != 0) {
    		servi = (ArrayList)Global.servico.clone();
    		
    	}else {
    		System.out.println("***Criando lista default***");
    		//CRIANDO OBJETOS DE SERVIÇO
            Servico s1 = new Servico(1, "sombracelha",  50.00);
            servi.add(s1);
            Servico s2 = new Servico(2, "Unha", 30.00);
            servi.add(s2);
            Servico s3 = new Servico(3, "Corte", 50.00 );
            servi.add(s3);
            Servico s4 = new Servico(4, "Pintura", 50.00);
            servi.add(s4);
            Servico s5 = new Servico(5, "Escova", 30.00);
            servi.add(s5);
            Servico s6 = new Servico(6, "Progressiva", 150.00);
            servi.add(s6);
            Servico s7 = new Servico(7, "Botox", 100.00);
            servi.add(s7);
            System.out.println("Serviços salvo com sucesso");
            
    	}
    	
    	Global.servico.addAll(servi);

    }
    
    
  //metódo que cadastrar o serviço
    public static void cadastrarServico() {
        //int opcao = -1;
        Scanner scanner = new Scanner(System.in);
        Servico s = new Servico();
        
        System.out.println("Informe os dados do Serviço a ser cadastrado:");
    	System.out.println("id: ");
    	s.setId(scanner.nextInt()); 
    	System.out.println("Nome: ");
    	s.setNome(scanner.next()); 
    	System.out.println("Valor Serviço: ");
    	s.setValor(scanner.nextDouble()); 
    	
    	saveServico(s);
    	scanner.close();
    }
    
  //metódo que lista o serviço
    public static void listarServico() {
    	System.out.format("%-15s%-15s%-15s\n", " Id ", " Nome ", " Valor do serviço ");
    	for(int i = 0; i < Global.servico.size(); i++) {
    		Servico s1 = (Servico) Global.servico.get(i);	 
    		//System.out.println(s1.getId() +"\t"+ s1.getNome()+"\t"+s1.getValor()+"\t");
        	System.out.format("%-15s%-15s%-15s\n", s1.getId(), s1.getNome(), s1.getValor());    	
        	
        }
    }
    
  //metódo que update o serviço
    public static void atualizarServico() {
        //int opcao = -1;
        Scanner scanner = new Scanner(System.in);
        int idsc = -1;
        
        System.out.println("Informe o id do serviço a ser atualizado: ");
        idsc = scanner.nextInt();
        
        for(int i = 0; i < Global.servico.size(); i++) {
        	Servico s1 = (Servico) Global.servico.get(i);
        	if(s1.getId() == idsc) {
        		System.out.println("Informe os dados do serviço a ser atualizado:");
            	System.out.println("Valor do serviço: ");
            	s1.setValor(scanner.nextDouble());
            	System.out.format( "\t Id\t " +"\t Nome\t " +"\t Valor do serviço\t ");
            	System.out.println(" ");
            	System.out.format("\t "+s1.getId() +"\t"+ s1.getNome()+"\t"+s1.getValor()+"\t");
            	System.out.println(" ");
        	}
        	Global.servico.set(i, s1);
        	scanner.close();
        	
        }
        System.out.println("Serviço atualizado com sucesso!");
        
    }
    
  //metódo que deleta o serviço
    public static void deletarServico() {
    	Scanner scanner = new Scanner(System.in);
        int idsc = -1;
        
        System.out.println("Informe o id do serviço a ser cancelado: ");
        idsc = scanner.nextInt();
        
        for(int i = 0; i < Global.servico.size(); i++) {
        	Servico s1 = (Servico) Global.servico.get(i);
        	if(s1.getId() == idsc) {
            	//servico.remove(i);
            	Global.servico.remove(s1);
            	System.out.println("Serviço excluído com sucesso!");
        	}
        	
        }
        scanner.close();
    }
    
        //Raquel

}
