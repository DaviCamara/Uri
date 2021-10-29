package unifor.fila.estatica;

public class FilaEstatica {

	private int vetor[];
	private int inicio;
	private int ultimo;
	private int nElementos;
	
	//Costrutor da fila Estatica
	public FilaEstatica(int capacidade) {
		this.vetor = new int[capacidade];
		this.inicio = 0;
		this.ultimo = 0;
		this.nElementos = 0;
	}
	
	//retornar se a fila estaVazia.
	public boolean estaVazia() {
		return this.nElementos == 0;
	}
	
	// retornar se a fial estiver cheia.
	public boolean estaCheia() {
		return this.nElementos == this.vetor.length;
	}
	
	//retora o tamaho do vetor.
	public int tamanho() {
		return this.nElementos;
	}
	
	//Imprime os vetores.
	public void imprime() {
		System.out.println("(I) [");
		for (int i = this.inicio; i < this.nElementos + this.inicio; i++) {
			System.out.println(this.vetor[i % this.vetor.length] + " ");			
		}
		System.out.println("] (F) ");
		System.out.println("Início = " + this.inicio);
		System.out.println("Último = " + this.ultimo);
	}
	
	//insere no fim
	public void enfileira(int elemento) {
		
		if (this.estaCheia()){
			System.out.println("Lista cheia! Não é possível enfileirar.");
			return;
		}
		
		this.vetor[this.ultimo] = elemento;
		this.ultimo = (this.ultimo + 1) % this.vetor.length;
		this.nElementos++;
	}
	
	//remove do inicio
	public Integer desenfileira() {
		if(this.estaVazia()) {
			System.out.println("Lista Vazia! Não é possível desenfileira.");
			return null;
		}
		int removido = this.vetor[this.inicio];
		this.inicio = (this.inicio + 1) % this.vetor.length;
		
		if(this.nElementos == 1) {
			this.inicio = 0;
			this.ultimo = 0;
			this.nElementos--;
		}else {
			this.nElementos--;
		}
		
		return removido;
	}
	
	//espia o valor que está para ser removido
	public Integer espia() {
		if(this.estaVazia()) {
			System.out.println("Lista Vazia! Não é possível espiar.");
			return null;
		}
		
		return this.vetor[this.inicio];
		
	}
	
	//verificar se contem o elemento a fila (percorre o idice através do for.)
	public boolean contem(int elemento) {
		
		for (int i = this.inicio; i < this.nElementos + this.inicio; i++) {
			if(this.vetor[i % this.vetor.length] == elemento) {
				return true;
			}
		}
		return false;
	}
	public int acesse(int pos) {

		if (pos >= this.nElementos || pos < 0) {
			System.out.println("Posição " + pos + " não é acessível");
			return 0;
		}
		
		return this.vetor[pos];
	}
}
