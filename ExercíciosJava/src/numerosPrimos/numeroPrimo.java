package numerosPrimos;
import java.util.Scanner;
public class numeroPrimo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// EXERCÍCIO nº primo: todo número que pode ser divido por ele mesmo
		//boolean escolha = true;
		//String escolha;
		while (true){
			System.out.println("Me informe um número por favor: ");
			int numero = ler.nextInt();
			ler.nextLine(); //consome linha em branco
			if (numero % 2 != 0){
				System.out.println("O número " + numero + " É um número primo!");
			}else {
				System.out.println("Este número: " + numero + " não é primo");
			}
			System.out.println("Você quer continuar? [S/N]");
			String escolha = ler.nextLine();
			if (escolha.equalsIgnoreCase("N")) {
				System.out.print("Encerrando processo!");
				break;
			}
		}			
	}

}
