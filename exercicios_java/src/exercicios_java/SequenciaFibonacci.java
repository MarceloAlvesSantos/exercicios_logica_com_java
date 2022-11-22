package exercicios_java;

import java.util.Scanner;

public class SequenciaFibonacci {
	
	public static void main(String[] args) {
		
		// OBS: Para FIBONACCI, usar algoritmo iterativo se tem mais desempenho do que se usar recursivo.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número de Fibonacci: ");
		int numeroFibo = sc.nextInt();
	
		// Declarando variáveis
		long fib1 = 0, fib2 = 1;
		
		for(int i = 1; i <= numeroFibo; i++) {
			System.out.print(fib1 + " ");
			long aux = fib1 + fib2;
			fib1 = fib2;
			fib2 = aux;
		}
		sc.close();
	}
}
