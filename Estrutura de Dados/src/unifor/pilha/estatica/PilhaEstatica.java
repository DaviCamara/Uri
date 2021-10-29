package unifor.pilha.estatica;


//LIFO (LAST  IN FIRST OUT)
public class PilhaEstatica {

	private int vetor[];
	private int nElementos;

	public PilhaEstatica(int capacidade) {
		this.vetor = new int[capacidade];
		this.nElementos = 0;
	}

	public boolean estaVazia() {
		return this.nElementos == 0;
	}

	public boolean estaCheia() {
		return this.nElementos == this.vetor.length;
	}
	
	public int tamanho() {
		return this.nElementos;
	}

	public void imprime() {
		for (int i = this.nElementos - 1; i >= 0; i--) {
			System.out.println("|\t" + this.vetor[i] + "\t|");
		}
		System.out.println("-----------------\n\n");
	}

	//insere no fim da lista
	public void empilha(int elemento) {

		if (this.estaCheia()) {
			System.out.println("Lista Cheia. N�o � poss�vel empilhar. STACK OVERFLOW");
			return;
		}

		this.vetor[this.nElementos] = elemento;
		this.nElementos++;
	}

	//retira no fim da lista.
	public Integer desempilha() {

		if (this.estaVazia()) {
			System.out.println("Lista vazia! N�o � poss�vel desempilhar.");
			return null;
		}

		int removido = this.vetor[this.nElementos-1];
		this.nElementos--;

		return removido;
	}

	public Integer espia() {

		if (this.estaVazia()) {
			System.out.println("Lista vazia! N�o � poss�vel espiar.");
			return null;
		}

		return this.vetor[this.nElementos-1];
	}

	public boolean contem(int elemento) {
		
		for (int i = 0; i < this.nElementos; i++) {
			if (this.vetor[i] == elemento) {
				return true;
			}
		}
		
		return false;
	}

}