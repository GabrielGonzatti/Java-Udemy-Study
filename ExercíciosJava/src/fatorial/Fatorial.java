package fatorial;
import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Me informe um número para Fatorial: ");
		int fatorial = ler.nextInt();
		for(int c=fatorial-1;c>0;c--) {
			int multi = (fatorial * c); //Fazendo multiplicação pelo número do usuário e do FOR
			fatorial =  multi; //Fatorial é atualizado pela multiplicação, para manter a lógica do fatorial
			System.out.println("Fatorial " + fatorial + " X " + c + " = " + fatorial);
		}

	}

}
