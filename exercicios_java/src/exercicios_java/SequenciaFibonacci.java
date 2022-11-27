// Marcelo Alves Santos
// Calculando a Sequência de Fibonacci
package exercicios_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SequenciaFibonacci 
{
	
	public static void main(String[] args) 
	{
		// iniciando o Acanner
		Scanner sc = new Scanner(System.in); 
		boolean respostaCorreta = false;
		int numeroFibo = -1;
		
		do {
			// usando exceções para receber apenas números inteiros
			try 
			{
				System.out.print("Número de Fibonacci: ");
				numeroFibo = sc.nextInt();
				respostaCorreta = true;
			} catch (InputMismatchException e) 
			{
				System.out.println("Atenção: Apenas números inteiros!!\n");
				sc.nextLine();
			}
		}while(!respostaCorreta);
		// convertendo números negativos para positivos
		if(numeroFibo < 0) {
			numeroFibo *= -1;
		}
		System.out.println("\nO(s) " + numeroFibo + " primeiro(s) número(s) de Fibonacci:");
		long fib1 = 0, 
			 fib2 = 1;
		// OBS: Para FIBONACCI, usar algoritmo iterativo se tem mais desempenho do que se usar recursivo.
		for(int i = 1; i <= numeroFibo; i++) 
		{
			System.out.print(fib1 + " ");
			long aux = fib1 + fib2;
			fib1 = fib2;
			fib2 = aux;
		}
		sc.close(); // finalizando o Scanner
	} // fim do método main
}// fim da classe SequenciaFibonacci
