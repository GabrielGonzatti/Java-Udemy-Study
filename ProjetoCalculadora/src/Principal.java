import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Soma de dois numeros: ");
			int valor1 = Integer.parseInt(scanner.nextLine());
			int valor2 = Integer.parseInt(scanner.nextLine());
			int soma = valor1+valor2;
			System.out.println("A soma de " + valor1 + " + " + valor2 + " é: " + soma);
			if (soma > 100) {
				System.out.println("Soma maior que 100");
				
			} else { 
				System.out.println("Soma menor que 100");
			}
		}
		

	}

}
