package listaWhile;

public class Ex08 {

	public static void main(String[] args) {
		
		int celsius = 0;
		int fahre  = 0;
		int contadora = 0;

		while (celsius < 100) {
			celsius = celsius + 10;
		    fahre = (9 * celsius + 160)/5;
		    contadora = contadora + 1;

		    System.out.println(celsius + "°c" +  " = " + fahre  + "°f");
		}
	}

}
