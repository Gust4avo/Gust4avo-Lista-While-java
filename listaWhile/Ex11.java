package listaWhile;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);

		
		int contadora = 50;
		int soma = 0;
		int media = 0;
		
		
		while (contadora <= 70){
		if(contadora % 2 == 0 ){
		soma = soma + contadora;
	}
		contadora++;

	}
		media = soma/ 11;
		System.out.println("A soma dos valores pares situados na faixa de 50 a 70 é :"  +soma);
		System.out.println("A media dos valores é :"  + media);


		sc.close();

	}
		
	}
