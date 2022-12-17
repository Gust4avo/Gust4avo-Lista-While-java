package listaWhile;

public class Ex03 {

	public static void main(String[] args) {

		int contadora = 0;
		int soma = 0;

		while (contadora <= 500) {
		contadora = contadora + 1;
				if (contadora % 2 == 0) {
				soma = soma + contadora;	
			}	
		}
		System.out.println("a somatoria dos 500 primeiros numeros pares é: " + soma);
	}

}
