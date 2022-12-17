package listaWhile;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int contadora = 0;
		int media = 0;
		int soma = 0;

		System.out.println("Dígite um número : ");
		int numero = sc.nextInt();
		while (contadora <= 10) {	
			soma = soma + numero;
			contadora++;

		}
		media = soma / 10;
		System.out.println(soma);
		System.out.println(media);

		sc.close();

	}

}
