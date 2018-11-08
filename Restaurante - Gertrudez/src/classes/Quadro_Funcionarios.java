package classes;


import java.util.HashMap;
import java.util.Map;

public class Quadro_Funcionarios extends Controle_Estoque {
	
	Map<Integer, Garcom> garcom = new HashMap<Integer, Garcom>();
	Garcom b = new Garcom();
	
	public void addGarcom(int codigoGarcom, String nome ) {
		//b.setCodigo(codigo);
		b.setNome(nome);
		garcom.put(codigoGarcom ,b);
	}
	
	public void pesquisarGarcom(int codigoGarcom){
		System.out.println("digite o codigo do gar�om");
		if(garcom.containsKey(codigoGarcom) ){
			System.out.println(garcom.get(codigoGarcom));
		}else{
			System.out.println("gar�om n�o cadastrado");
		}
	}
	
	public void removerGarcom(int codigoGarcom){
		if(garcom.containsKey(codigoGarcom)){
			garcom.remove(codigoGarcom);
			System.out.println("gar�om demitido");
		}else{
			System.out.println("gar�om n�o cadastrado, ou dados invalidos");
		}
	}
	

}
