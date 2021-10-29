package unifor.lista.dinamica.simplismente;

import unifor.lista.dinamica.circular.Nodo;

public class ListaEncadeada {

	private Nodo inicio;
	private int nElementos;

	public ListaEncadeada() {
		this.inicio = null;
		this.nElementos = 0;
	}

	public int tamanho() {
		return this.nElementos;
	}

	public boolean estaVazia() {
		return this.inicio == null;
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

	public void insereInicio(int elemento) {

		Nodo novo = new Nodo(elemento);

		if (!this.estaVazia()) {
			novo.proximo = this.inicio;
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

		this.inicio = nodoRemovido.proximo;

		this.nElementos--;

		nodoRemovido.proximo = null;

		return nodoRemovido.elemento;

	}

	public void insereFinal(int elemento) {

		Nodo novo = new Nodo(elemento);

		if (this.estaVazia()) {

			this.inicio = novo;
		} else {

			Nodo cursor = this.inicio;
			for (int i = 1; i < this.nElementos; i++) {
				cursor = cursor.proximo;
			}

			cursor.proximo = novo;
		}

		this.nElementos++;
	}

	public Integer removeFinal() {

		if (this.estaVazia()) {
			System.out.println("Lista vazia. Não é possível remover.");
			return null;
		}

		Nodo nodoRemovido;

		if (this.nElementos == 1) {
			nodoRemovido = this.inicio;
			this.inicio = null;
		} else {

			Nodo cursor = this.inicio;
			for (int i = 1; i < this.nElementos - 1; i++) {
				cursor = cursor.proximo;
			}

			nodoRemovido = cursor.proximo;
			cursor.proximo = null;
		}

		this.nElementos--;

		return nodoRemovido.elemento;
	}

	public void inserePosicao(int elemento, int pos) {

		if (pos < 0) {
			System.out.println("Posição negativa. Não é possível inserir.");
			return;
		} else if (pos > this.nElementos) {
			System.out.println("Posição inválida. Não é possível inserir.");
			return;
		}

		Nodo novo = new Nodo(elemento);

		if (pos == 0) {
			this.insereInicio(elemento);
		} else {
			Nodo cursor = this.inicio;
			for (int i = 1; i < pos; i++) {
				cursor = cursor.proximo;
			}
			novo.proximo = cursor.proximo;
			cursor.proximo = novo;

			this.nElementos++;
		}
	}

	public Integer removerPosicao(int pos) {

		// Atividade valendo ponto extra...

		return null;
	}

	public void insereOrdenado(int elemento) {

		// Atividade valendo ponto extra...

	}

	public Integer acesse(int pos) {

		if (pos < 0 || pos >= this.nElementos) {
			return null;
		}

		Nodo cursor = this.inicio;
		for (int i = 0; i < pos; i++) {
			cursor = cursor.proximo;
		}

		return cursor.elemento;

	}

}