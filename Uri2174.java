package unifor.tad.lista;

import java.util.Scanner;

public class Uri2174 {
	//Tad-List - URI - 2174 - Coleção Pokemon
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	String pokebola1;
	ListaVetor pokemon = new ListaVetor(N);
	
	
	//Preenchimento do Vetor com input.
	for (int i = 0; i <N; i++) {
		 pokebola1 = scan.next();
			pokemon.insereInicio(pokebola1);

		}
	pokemon.removeDuplicado();
		
	System.out.println("Falta(m) " + (151 - pokemon.nElementos)  + " pomekon(s).");
	}
}
