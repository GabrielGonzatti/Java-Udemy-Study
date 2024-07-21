package exercicioTemperatura;
import java.util.Scanner; 
public class exercicioFibonacci {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// Fibonacci sempre irá iniciar com primeiro e segundo números, para obtermos a soma - eles nunca serão mostrados na tela;
		int segundo = 1;
		int primeiro = 0;
		System.out.print("Me informe quantos elementos da sequência de fibonacci quer visualizar? ");
		int seq = ler.nextInt();
		for (int i=0; i<seq; i++){
			int soma = primeiro + segundo;
			//necessário ter uma variável de soma dos dois antecessores
			System.out.println("Fibonacci Seq " +(i+1)+": " + soma);
			primeiro = segundo; 
			segundo = soma; 
			//Necessário mudar as duas variáveis que estão se somando, 
			//o primeiro receberá o valor do segundo,
			//o segundo irá receber o valor da soma
		}

	}

}
