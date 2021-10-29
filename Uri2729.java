package unifor.tad.lista;
import java.util.Iterator;
import java.util.Scanner;

public class Uri2729 {
	
	
	
	public static void main(String[] args) {
		
	//Tad-Lista - URI - 2729 - Lista de Compras
		
	Scanner scan = new Scanner(System.in);

	ListaVetor listacompras = new ListaVetor(1000);
	
	String N = scan.nextLine().trim();
	int n = Integer.parseInt(N);
	
	for (int i = 0; i < n ; i++) {
		//listacompras.imprime();
		String S = scan.nextLine();
		String[] s2 = S.split(" ");
		//System.out.println(s2);
		for (int j = 0; j < s2.length; j++) {
			listacompras.insereFinal(s2[j]);
			
			
			//listacompras.imprime();
			
		}
		listacompras.removeDuplicado();
		listacompras.organizaAlfabetico();
		listacompras.imprime();
		//System.out.println(listacompras.nElementos);
		
		for (int j = listacompras.nElementos; j > 0 ; j--) {
			listacompras.nElementos--;
			//System.out.println(listacompras.nElementos);
			
			}	
		}
	}

}