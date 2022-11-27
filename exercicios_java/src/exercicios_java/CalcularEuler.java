// Marcelo Alves Santos
// Calcular a constante matemática neperiano, usando a fórmula -> E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!

package exercicios_java;

import java.util.Scanner;

public class CalcularEuler 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); //Criar um Scanner
		System.out.print("Valor inteiro positivo N: "); 
		int n = sc.nextInt();
		double euler = 0.0d;
		for(int i = 0; i <= n; i++) 
		{
			euler += 1.0 / fatorial(i);
		}
		System.out.println(String.format("\nEuler = %.15f", euler));
		
		sc.close(); // finalizando o Scanner
	} // fim do método main
	// método para calcular o Fatorial
	public static long fatorial(long numero) 
	{
		if(numero == 0) {
			return 1;
		}
		return numero * fatorial(numero - 1);
	} // fim do método fatorial
} // fim da classe CalcularEuler