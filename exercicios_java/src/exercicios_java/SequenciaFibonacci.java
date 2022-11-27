// Marcelo Alves Santos
// Calculando a Sequ�ncia de Fibonacci
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
			// usando exce��es para receber apenas n�meros inteiros
			try 
			{
				System.out.print("N�mero de Fibonacci: ");
				numeroFibo = sc.nextInt();
				respostaCorreta = true;
			} catch (InputMismatchException e) 
			{
				System.out.println("Aten��o: Apenas n�meros inteiros!!\n");
				sc.nextLine();
			}
		}while(!respostaCorreta);
		// convertendo n�meros negativos para positivos
		if(numeroFibo < 0) {
			numeroFibo *= -1;
		}
		System.out.println("\nO(s) " + numeroFibo + " primeiro(s) n�mero(s) de Fibonacci:");
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
	} // fim do m�todo main
}// fim da classe SequenciaFibonacci
