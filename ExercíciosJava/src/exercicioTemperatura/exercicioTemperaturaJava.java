package exercicioTemperatura;

import java.util.Scanner; 
// Importação - Traz algo de fora, para dentro do código
public class exercicioTemperaturaJava{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    	double temperatura;
    	System.out.println("Escolha entre Celcius e Fahrenheit: ");
    	String Nometemperatura = ler.nextLine().toUpperCase();
    	System.out.println("Qual a temperatura em " + Nometemperatura);
    	temperatura = ler.nextDouble();
    	if(Nometemperatura.equals("CELCIUS")){
    		double calculo = 32 + (temperatura * 9/5) ;
    		System.out.println("A temperatura em Fahrenheit: " + calculo + "ºC");
    	}else if (Nometemperatura.equals("FAHRENHEIT")) {
    		double calculo = 5/9 * (temperatura - 32); 
    		System.out.println("A temperatura em Celcius: " + calculo + "ºF");
    	}
    }
}
