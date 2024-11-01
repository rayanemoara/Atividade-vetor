package atividadeVetor;

import java.util.Scanner;

public class JavaVetor {

	public static void main(String[] args) {
		Scanner localize = new Scanner(System.in);
		
		int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}; // Exemplo de vetor
		
		System.out.print("Digite o número que você deseja encontrar: ");
		int numeroProcurado = localize.nextInt();
		
		boolean encontrado = false;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numeroProcurado) {
				
				System.out.println("O número " + numeroProcurado + " está localizado na posição: " + i);
				encontrado = true;
				
				break;
		            }
		        }
		
		if (!encontrado) {
			System.out.println("O número " + numeroProcurado + " não foi encontrado!");
			
		        }
		
localize.close();

	}

}
