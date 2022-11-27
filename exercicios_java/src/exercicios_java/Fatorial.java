// Marcelo Alves Santos
// Calculando o Fatorial de um número inteiro nao negativo
package exercicios_java;

import java.util.Locale;
import java.util.Scanner;

public class Fatorial {
	
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); // criando o Scanner
		
		int numero = -1;
		do {
			System.out.print("Fatorial do número: ");
			numero = sc.nextInt();
			if(numero < 0) {
				System.out.println("\nDigite um número inteiro não negativo!\n");
			}
			
		}while( numero < 0);
		
		System.out.println("\nFatorial de " + numero + " = " + calcularFatorial(numero));
		
		sc.close(); // finalizando o Scanner
	} //fim do método main
	// método calcularFatorial para retornar o fatorial
	public static int calcularFatorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n * calcularFatorial(n - 1);
	} // fim do método calcularFatorial
} // fim da classe Fatorial
