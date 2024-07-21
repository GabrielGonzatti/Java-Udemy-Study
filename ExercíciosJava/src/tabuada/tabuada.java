package tabuada;
import java.util.Scanner;
public class tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Me diga um número: ");
		int numero = ler.nextInt();
		for(int c=1;c<=10;c++) {
			int tabuada = numero * c;
			System.out.println("Tabuada: " + numero + " X " + c + " = " + tabuada);
		}

	}

}
