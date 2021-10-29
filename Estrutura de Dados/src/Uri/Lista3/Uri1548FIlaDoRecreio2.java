package Uri.Lista3;
import unifor.fila.estatica.*;

import java.util.Scanner;

import unifor.fila.dinamica.*;

public class Uri1548FIlaDoRecreio2 {


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
		int flag = 0 ;
		//número de alunos.
		
		
		;
		FilaEstatica filaRecreio = new FilaEstatica(1000);
		FilaEstatica filaRecreio2 = new FilaEstatica(1000);
		FilaEstatica filaRecreio3 = new FilaEstatica(1000);
		//alunos /notas (TOPO)100 - 80 - 90 (BOTTOM)
		
	for (int i = 0; i < M; i++) { //m =2
		
		int N = scan.nextInt();//3 - 4
		//System.out.println(N);
		for (int j = 0; j < N; j++) {
			int O = scan.nextInt();
			//System.out.println("OOOO" + O);
			filaRecreio.enfileira(O);
			filaRecreio3.enfileira(O);//10-80-90
			//filaRecreio.imprime();

		}
		int tamanho = filaRecreio.tamanho();

		for (int k = 0; k < tamanho; k++) {//4
			//System.out.println("-------------------");
			//int primeiro = filaRecreio.espia();
			if(filaRecreio.tamanho() == 0) {
				
			}else {
			int removido = filaRecreio.desenfileira();//30 - 25
			int removido2 = filaRecreio2.espia();
			
				if(filaRecreio.tamanho() == 0) {
				filaRecreio2.enfileira(removido); //100 -90
				//filaRecreio2.imprime();
						
				}
				
				if(removido > filaRecreio.espia() ) { //25
					filaRecreio2.enfileira(removido); //100 -90
					//filaRecreio2.imprime();
					
					
				}
				else {
					int aux = removido; //
					filaRecreio2.enfileira(filaRecreio.espia()); // 100 - 90
					 //1
					filaRecreio2.enfileira(aux); //100-90-80
					filaRecreio.desenfileira();
					//filaRecreio.imprime();
					//filaRecreio2.imprime(); // 120 - 100 - 50 30
					//System.out.println("tamanho" + filaRecreio2.tamanho());
					
				}
			}
		}
		/*
		System.out.println("------------");
		filaRecreio2.imprime();
		System.out.println("++++++++++++");
		filaRecreio3.imprime();
		*/
		/*
		for (int o = 0; o < filaRecreio2.tamanho(); o++) {
			if (filaRecreio2.espia() == filaRecreio3.espia()) {
				filaRecreio3.desenfileira();
				flag--;
				//System.out.println("FLAG:" + (filaRecreio2.tamanho()-flag));
			}else {
				//flag++;
				filaRecreio3.desenfileira();
			}
			System.out.println("FLAG:" + flag);
			
		
		}
		*/
		
		for(int m =0;m< filaRecreio2.tamanho(); m++) {
			if (filaRecreio2.acesse(m) == filaRecreio3.acesse(m)){
				flag++;
			}
			
		}
		System.out.println("flag   " +flag);
		flag = 0;
		//filaRecreio2.imprime();
		//int tamanho = filaRecreio2.tamanho();
		for (int l = filaRecreio2.tamanho(); l > 0; l--) {
			filaRecreio2.desenfileira();
			filaRecreio3.desenfileira();
			//System.out.println("l-------" + l);
			//filaRecreio2.imprime();
			
		}
		//filaRecreio2.ultimo = 0;
		 
	}
		
		//System.out.println("removido=" + removido);
		//int removido2 = filaRecreio.desenfileira();
		//filaRecreio2.imprime();
	}

}
