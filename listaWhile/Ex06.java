package listaWhile;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da base: ");
		int base = sc.nextInt();
		System.out.println("Digite o valor do expoente: ");
		int expo = sc.nextInt();
		int resultado = 1;
		int contador = 0;
		while (contador < expo) {
			resultado = resultado * base;
			contador = contador + 1;
		}
		sc.close();
	}

}
