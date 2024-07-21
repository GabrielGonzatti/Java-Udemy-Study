package ordenarNumeros;
import java.util.Scanner;
public class ordenarNumeros {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o tamanho do array: ");
		int tamanho = ler.nextInt();
		int[] numeros = new int[tamanho]; //Registrando um array
		System.out.println("Digite os números do array:");
		for (int i = 0; i < tamanho; i++) {
			 numeros[i] = ler.nextInt();
		}
		// Bubble Sort
		 for (int i = 0; i < tamanho - 1; i++) {
			 for (int j = 0; j < tamanho - i - 1; j++) {
				 if (numeros[j] > numeros[j + 1]) {
					 int temp = numeros[j];
					 numeros[j] = numeros[j + 1];
					 numeros[j + 1] = temp;
		 		}
		 	}
		 }
		 System.out.println("Array ordenado:");
		 for (int i = 0; i < tamanho; i++) {
			 System.out.print(numeros[i] + " ");
			 }
			 ler.close();
	}

}
