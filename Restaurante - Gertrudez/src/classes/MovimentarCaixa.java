package classes;

import java.util.Scanner;

public class MovimentarCaixa extends MovimentarContas {
	
	
	public static void main(String[] args) {
		
		Controle_Estoque controle = new Controle_Estoque();
		Quadro_Funcionarios quadro = new Quadro_Funcionarios();
		MovimentarContas moviContas = new MovimentarContas();
		
		Scanner sr = new Scanner(System.in);
		System.out.println("Bem vindo ao Restaurante da Gertrudez\n");
		System.out.println("digite 1 para acessar controle de estoque\n");
		System.out.println("digite 2 para acessar o quadro de funcionarios\n");
		System.out.println("digite 3 para ir ao Movimento do Caixa\n");
		
		int oPrin=sr.nextInt() ;
		
		do {
			
			switch(oPrin) {
			case 1:
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////Controle de Estoque///////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				int aCont = sr.nextInt();
				do {
					System.out.println("bem vindo ao controle de estoque\n");
					System.out.println("digite 1 para adicionar um produto\n");
					System.out.println("digite 2 para pesquisar um produto\n");
					System.out.println("digite 3 para remover um produto\n");
					System.out.println("digite 4 para sair");
					switch(aCont) {
					case 1:
						int a3;
						do {
						System.out.println("digite o os dados do produto");
						controle.addProduto(sr.nextInt(), sr.next(), sr.nextDouble(), sr.nextInt());
						System.out.println("deseja cadastrar outro produto? 1- sim \n 2- não");
						}while((a3 = sr.nextInt()) != 2);
						break;
					
					case 2:
						System.out.println("digite o codigo do produto\n");
						controle.pesquisarProduto(sr.nextInt());
						System.out.println("deseja pesquisar outro produto?");
						
						break;
					
					case 3:
						System.out.println("digite o codigo do produto que deseja remover \n");
						controle.removerProdutos(sr.nextInt());
						System.out.println("deseja remover mais produtos?");
						
						break;

					}
				}while((aCont = sr.nextInt()) != 4);
			//------------------------------------------------------------------------------------------------------//
				
				
			/////////////////////////////////////////////////////////////////////////////////////////////////////////				
			////////////////////////////////////Quadro de Funcionarios///////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			case 2:
				System.out.println("bem vindo ao quadro de funcionarios\n");
				System.out.println("digite 1 - para Adicionar um garcom");
				System.out.println("digite 2 - para pesquisar um garcom");
				System.out.println("digite 3 - para remover um garcom");
				int bQuad = sr.nextInt();
				do {
					switch(bQuad) {
					case 1:
						System.out.println("digite os dados do Garcom");
						quadro.addGarcom(sr.nextInt(), sr.next());
						
						break;
					case 2:
						System.out.println("digite o codigo do garcom");
						quadro.pesquisarGarcom(sr.nextInt());
						
						
						
						break;
					case 3: 
						System.out.println("digite o codigo do garçom que deseja demitir");
						quadro.removerGarcom(sr.nextInt());
						
					}
					
				}while((bQuad = sr.nextInt()) != 0);
				
			//----------------------------------------------------------------------------------------------
				
			/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////Movimentar Caixa/////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			case 3:
				System.out.println("bem vindo ao Movimentar Caixa\n");
				System.out.println("digite 1- para adicionar conta");
				System.out.println("digite 2- para consumo de produtos");
				System.out.println("digite 3- para remover conta");
				int cMov = sr.nextInt();
				do {
					switch(cMov) {
					case 1:
						System.out.println("digite o codigo da conta e nome do cliente que deseja associar\n");
						moviContas.criarConta(sr.nextInt(), sr.next());
						break;
					}
				}while((cMov= sr.nextInt())!=0);
				
			}
			
		}while((oPrin= sr.nextInt()) != 0);
	}

}
