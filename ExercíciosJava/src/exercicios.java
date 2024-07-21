import java.util.Scanner; 
// Importação - Traz algo de fora, para dentro do código
public class exercicios{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    	int n1, n2;
        System.out.print("Informe um número por favor: \n");
        n1 = ler.nextInt();
        System.out.print("Informe o segundo número por favor: \n");
        n2 = ler.nextInt();
        int soma = n1 + n2;
        double divisao = n1/n2;
        int multi = n1*n2;
        int sub = n1 - n2;
        System.out.println("A soma dos números: " + soma);
        System.out.println("A subtração dos números: " + sub);
        System.out.println("A divisão dos números: " + divisao);
        System.out.println("A multiplicação dos números: " + multi);
    }
}
