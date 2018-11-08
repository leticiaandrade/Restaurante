package classes;

import java.util.HashMap;
import java.util.Map;

public class Controle_Estoque {
	
	Map<Integer ,Produtos> produtos = new HashMap<Integer, Produtos>();
	Produtos a = new Produtos();
	
	public void addProduto(int codigoProduto, String descricao, double preco, int quantidade ) {
		//a.setCodigo(codigoProduto);
		a.setDescricao(descricao);
		a.setPreco(preco);
		a.setQuantidade(quantidade);
		produtos.put(codigoProduto,a);
	}
	
	public void removerProdutos(int codigoProduto) {
		if(produtos.containsKey(codigoProduto)){
			produtos.remove(codigoProduto);
		System.out.println("produto removido");	
		}else{
			System.out.println("produto não cadastrado");
		}
	}
	
	public void pesquisarProduto(int codigoProduto) {
		if(produtos.containsKey(codigoProduto)) {
			System.out.println("Codigo:" + produtos.get(codigoProduto).getCodigo() + "\n" + "Nome: " + produtos.get(codigoProduto).getDescricao() + "\n" + "Preço: " + produtos.get(codigoProduto).getPreco() + "\n" + "Quantidade: " + produtos.get(codigoProduto).getQuantidade() );
		}else {
			System.out.println("produto não cadastrado");
		}
	}
	
	
	public double consumoDeProdutos(int codigoProduto) {
		int sub;
		if(produtos.containsKey(codigoProduto)){	
			sub = produtos.get(codigoProduto).getQuantidade() -1;
		}else{
			System.out.println("produto não cadastrado");
		}
		return produtos.get(codigoProduto).getPreco();
	}
}
