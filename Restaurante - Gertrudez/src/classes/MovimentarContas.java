package classes;

import java.util.HashMap;
import java.util.Map;

public class MovimentarContas extends Quadro_Funcionarios {
	
	Map<Integer, Conta> contas = new HashMap<Integer, Conta>();
	Conta c = new Conta();
	
	public void criarConta(int codigoConta, String nomeCliente) {
		c.setNomeCliente(nomeCliente);
		contas.put(codigoConta, c);
	}

	public void removerConta(int codigoConta) {
		if(contas.containsKey(codigoConta)) {
			contas.remove(codigoConta);
		}else {
			System.out.println("Conta não cadastrada");
		}
		
	}
	
}
