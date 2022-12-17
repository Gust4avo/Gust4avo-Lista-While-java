package listaWhile;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = sc.nextInt();

		int contadora = 1;
		while (contadora <= 10) {
		int resultado = numero * contadora;
		System.out.println(numero + " X " + contadora + " = " + resultado);
		contadora = contadora + 1;
		
		}
		sc.close();
	}

}
