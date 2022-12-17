package listaWhile;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int area = 0;
		int total = 0;
		String parar = "s";

		while (parar == "s") {
			System.out.println("Insira o nome do cômodo: ");
			String nome = sc.next();
			System.out.println();

			System.out.println("Dígite a largura do cômodo: ");
			int largura = sc.nextInt();
			System.out.println();

			System.out.println("Dígite o comprimento do cômodo: ");
			int comprimento = sc.nextInt();
			System.out.println();

			area = largura * comprimento;
			total = total + area;

			System.out.println("Deseja continuar calculando? [s/n] ");
			parar = sc.next();
			System.out.println();

		}

		System.out.println("O valor total da área calculada da residência é : " + total);

		sc.close();
		
	}

}
