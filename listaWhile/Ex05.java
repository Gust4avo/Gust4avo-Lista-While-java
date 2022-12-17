package listaWhile;

public class Ex05 {

	public static void main(String[] args) {
		
		int contadora = 0;
		int resultado = 0;

		while (contadora <= 15) {
		   resultado = resultado * 3;
		   
		    if (resultado == 0) {
		      resultado = resultado + 1;
		    };
		    
		  System.out.println("3 ^ " + contadora + " = " + resultado);
		    contadora = contadora + 1;
		}
		
	}
	
}
