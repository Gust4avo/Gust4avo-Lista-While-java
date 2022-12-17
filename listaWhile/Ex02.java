package listaWhile;

public class Ex02 {

	public static void main(String[] args) {
		
		int contador = 0;
		int soma = 0;
		while (contador <= 100) {
		    soma = soma + contador;
		    contador = contador + 1;
		    
		    System.out.println("a somatoria dos 100 primeiro numeros é: " + soma);
		}
	}
	
}
