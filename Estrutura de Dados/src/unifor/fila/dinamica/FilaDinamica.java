package unifor.fila.dinamica;


//FIFO (primeiro que entra � o primeiro a sair)
public class FilaDinamica<T> {

	//constructor class nodo g�nerica
	class Nodo {
		
		public T elemento;
		public Nodo proximo;
		
		public Nodo(T elemento) {
			this.elemento = elemento;
			this.proximo = null;
		}
	}
	private Nodo inicio;
	private Nodo fim;
	private int nElementos;
	
	
	//costrutor
	public  FilaDinamica() {
		this.inicio = null;
		this.fim = null;
		this.nElementos = 0;
	}
	
	//retorna o tamaho da fila
	public int tamanho() {
		return this.nElementos;
	}
	
	//verifica se a lista estaVazia
	public boolean estaVazia() {
		return this.nElementos == 0;
	}
	
	//imprime os valores da fila din�mica
	public void imprime() {
		
		System.out.print("[");
		Nodo cursor = this.inicio;
		for (int i = 0; i < this.nElementos; i++) {
			System.out.print(cursor.elemento + " ");
			cursor = cursor.proximo;
		}
		System.out.println("]");
	}
	
	//remove no inicio da fila
	public T desenfileira() {

		if (this.estaVazia()) {
			System.out.println("Lista vazia. N�o � poss�vel remover.");
			return null;
		}

		Nodo nodoRemovido = this.inicio;

		this.inicio = nodoRemovido.proximo;

		nodoRemovido.proximo = null;

		this.nElementos--;

		return nodoRemovido.elemento;

	}
	
	//insere no final da fila
	public void enfileira(T elemento) {

		Nodo novo = new Nodo(elemento);

		if (this.estaVazia()) {
			this.inicio = novo;
		} else {
			this.fim.proximo = novo;
		}

		this.fim = novo;
		this.nElementos++;
	}
		
	public boolean contem(T elemento) {

		Nodo cursor = this.inicio;
		for (int i = 0; i < this.nElementos; i++) {
			if (cursor.elemento.equals(elemento)) {
				return true;
			}
			cursor = cursor.proximo;
		}

		return false;
	}
	
	
	//espia
	public T espia() {

		if (this.estaVazia()) {
			System.out.println("Lista vazia! N�o � poss�vel espiar.");
			return null;
		}

		return this.inicio.elemento;
	}
	
}
