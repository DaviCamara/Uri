package unifor.tad.lista;

import java.util.Scanner;

public class Uri3135 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); // scan 12.
		String nome;
		ListaVetor listanomes = new ListaVetor(N);
		
		for (int i = 0; i < N; i++) {
			nome = scan.next();
			listanomes.insereFinal(nome);
			
		}
		//listanomes.imprime();
		listanomes.organizaPorTamanho();
		int tamanho = 2;
		//listanomes.imprime();
		//while(listanomes.nElementos != 0) {
		
		//int i = 0;
		int count =0;
		//while(listanomes.nElementos != 0) {
		while(listanomes.nElementos >0) {
			System.out.println("ELEMENTOS:" +listanomes.nElementos);
			for(int i = 0; i < N; i++) {
				if(i>= listanomes.nElementos ) {
					System.out.println();
					i = 0;
					tamanho  = 2;
				}
				
				else if(listanomes.acesse(i).length() == tamanho) {
				System.out.print(listanomes.acesse(i) + "-----");
				System.out.println("Item removedio +" + listanomes.removePosicao(i));
				tamanho++;
				//i++;
				i--;
				listanomes.imprime();
				//if() {
					
				//}
			//System.out.println("i +" + i);	
			} else {
				tamanho++;
			}
				
			 
		}
		//for (int i = 0; i < N; i++) {
			//if(listanomes.acesse(i).length() >listanomes.nElementos) {
				//listanomes.acesse(i)
			//}
				//if(listanomes.acesse(i).length() == tamanho) {
				//System.out.print(listanomes.acesse(i) + "-----");
				//System.out.println("Item removedio +" + listanomes.removePosicao(i));
				//tamanho++;
				//i++;
				//i--;
				//listanomes.imprime();
				//if() {
					
				//}
			//System.out.println("i +" + i);	
			}
		///else {
			//	count++;
			//	i = 0;
				//System.out.println();
				//tamanho =2;
			//}
			
					//else {
			//	tamanho =2;
			//System.out.println("i" +i);
			///System.out.println(listanomes.nElementos);
			//}
		//}
	//}
	listanomes.imprime();
		
	}

}

