package Uri.Lista3;
import unifor.fila.estatica.*;

import java.util.Scanner;

import unifor.fila.dinamica.*;

public class Uri1548FilaDoRecreio {


	public static void main(String[] args) {
		//INPUT N == inteiro. (numero de casos de teste)
		//Input 1<=M <=1000== inteiro único - Numero de alunos (cada caso de teste inicia com ele)
		//INPUT Pi nota de cada aluno.
		//inteiro M são dados por ordem de chegada.
		
		//------------------------------------------
		//------------------------------------------
		
		//OUTPUT: Imprime uma linha, contendo um inteiro indicando número de alunos que não precisam trocar de lugar
		
		
		//Algoritmo: Soma das notas obtidas em sala de aula
		//Insere no fim e remove no inicio.
		
		Scanner scan = new Scanner(System.in);
		//número de casos.
		int M = scan.nextInt();
		
		//número de alunos.
		
		
		int flag = 0;
		FilaEstatica filaRecreio = new FilaEstatica(1000);
		FilaEstatica filaRecreio2 = new FilaEstatica(1000);
		//alunos /notas (TOPO)100 - 80 - 90 (BOTTOM)
		
	for (int i = 0; i < M; i++) { //m =2
		
		int N = scan.nextInt();//3 - 4
		//System.out.println(N);
		for (int j = 0; j < N; j++) {
			filaRecreio.enfileira(scan.nextInt()); //10-80-90
			//filaRecreio.imprime();
		}
		//filaRecreio.imprime();
		//100 80 90
		//System.out.println(filaRecreio.tamanho());
		for (int k = 0; k < filaRecreio.tamanho(); k++) {//3
			//System.out.println("-------------------");
			int primeiro = filaRecreio.espia();
			int removido = filaRecreio.desenfileira(); //100 - 80
				if(removido > filaRecreio.espia()) { //90
					filaRecreio2.enfileira(removido);
					//100
					System.out.println("------------"+ primeiro);
					System.out.println("------------"+ filaRecreio2.espia());
					if (primeiro == filaRecreio2.espia()) {
						flag++;
						System.out.println("flag:   " +flag);
					}
					//filaRecreio2.imprime();
					
					
				}
				else {
					int aux = removido; //80
					filaRecreio2.enfileira(filaRecreio.espia()); // 100 - 90
					 //1
					filaRecreio2.enfileira(aux); //100-90-80
					filaRecreio.desenfileira();
					//filaRecreio.imprime();
					//filaRecreio2.imprime(); // 120 - 100 - 50 30
					//System.out.println("tamanho" + filaRecreio2.tamanho());
					
				}
				
			
		}
		//filaRecreio2.imprime();
		//int tamanho = filaRecreio2.tamanho();
		for (int l = filaRecreio2.tamanho(); l > 0; l--) {
			filaRecreio2.desenfileira();
			//System.out.println("l-------" + l);
			//filaRecreio2.imprime();
			
		}
		 
	}
		
		//System.out.println("removido=" + removido);
		//int removido2 = filaRecreio.desenfileira();
		//filaRecreio2.imprime();
	}

}
