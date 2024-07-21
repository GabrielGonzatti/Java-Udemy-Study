package média;
import java.util.Scanner;
public class MediaNotas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Me informe sua primeira nota: ");
		double num1 = ler.nextInt();
		System.out.println("Me informe sua segunda nota: ");
		double num2 = ler.nextInt();
		System.out.println("Me informe sua terceira nota: ");
		double num3 = ler.nextInt();
		double media = num1+num2+num3/3;
		System.out.println("Média = " + media);
	}

}
