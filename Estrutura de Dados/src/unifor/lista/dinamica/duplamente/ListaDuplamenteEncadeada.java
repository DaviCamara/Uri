package unifor.lista.dinamica.duplamente;


public class ListaDuplamenteEncadeada {

	private Nodo inicio;
	private Nodo fim;
	private int nElementos;

	public ListaDuplamenteEncadeada() {
		this.inicio = null;
		this.fim = null;
		this.nElementos = 0;
	}

	public boolean estaVazia() {
		return this.nElementos == 0;
	}

	public int tamanho() {
		return this.nElementos;
	}

	public void imprime() {
		System.out.print("[");
		Nodo cursor = this.inicio;
		for (int i = 0; i < this.nElementos; i++) {
			System.out.print(cursor.elemento + " ");
			cursor = cursor.proximo;
		}
		System.out.println("]");
	}

	public void imprimeInverso() {
		System.out.print("[");
		Nodo cursor = this.fim;
		for (int i = 0; i < this.nElementos; i++) {
			System.out.print(cursor.elemento + " ");
			cursor = cursor.anterior;
		}
		System.out.println("]");
	}

	public void insereInicio(int elemento) {

		Nodo novo = new Nodo(elemento);

		if (this.estaVazia()) {
			this.fim = novo;
		} else {
			novo.proximo = this.inicio;
			this.inicio.anterior = novo;
		}

		this.inicio = novo;
		this.nElementos++;

	}

	public Integer removeInicio() {

		if (this.estaVazia()) {
			System.out.println("Lista vazia. Não é possível remover.");
			return null;
		}

		Nodo nodoRemovido = this.inicio;

		if (this.nElementos == 1) {
			this.inicio = null;
			this.fim = null;
		} else {
			this.inicio = nodoRemovido.proximo;
			this.inicio.anterior = null;

			nodoRemovido.proximo = null;
		}

		this.nElementos--;

		return nodoRemovido.elemento;
	}

	public void insereFinal(int elemento) {

		Nodo novo = new Nodo(elemento);

		if (this.estaVazia()) {
			this.inicio = novo;
		} else {
			this.fim.proximo = novo;
			novo.anterior = this.fim;
		}

		this.fim = novo;

		this.nElementos++;
	}

	public Integer removeFinal() {

		return null;
	}

	public void inserePosicao(int elemento, int pos) {

	}

	public Integer removerPosicao(int pos) {

		return null;
	}

	public void insereOrdenado(int elemento) {

	}

	public Integer acesse(int pos) {

		return null;
	}

}