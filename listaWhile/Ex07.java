package listaWhile;

public class Ex07 {

	public static void main(String[] args) {

	int contador = 1;
	int primeiro = 0;
	int anterior = 1;
	int resultado = 0;
	System.out.println("1");
	while (contador <= 15) {
	resultado = primeiro + anterior;
	System.out.println(resultado);
	primeiro = anterior;
	anterior = resultado;
	contador = contador + 1;

		}
	}

}
