package listaWhile;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = 0;
		int menor = 0;
		int maior = 0;

		while (numero >= 0) {
			System.out.println("Insira um número: ");
			numero = sc.nextInt();

			if (numero > maior) {

				maior = numero;

			} else {
				menor = numero;

			}

			System.out.println("O maior número é : " + maior);
			System.out.println("O menor número é : " + menor);

		}

		sc.close();

	}

}
