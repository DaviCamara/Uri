package unifor.lista.dinamica.circular;

public class ListaCircular {

	public Nodo inicio;
	public Nodo fim;
	public int nElementos;

	public ListaCircular() {
		this.inicio = null;
		this.fim = null;
		this.nElementos = 0;
	}

	public boolean estaVazia() {
		return this.nElementos == 0;
	}

	public void imprime() {

		System.out.print("[");

		Nodo cursor = this.inicio;
		for (int i = 0; i < this.nElementos; i++) {
			System.out.print(cursor.elemento + " ");
			cursor = cursor.proximo;
		}

		if (this.nElementos == 0)
			System.out.println("] Inicio: " + this.inicio + ", Fim: " + this.fim);
		else
			System.out.println("] Inicio: " + this.inicio.elemento + ", Fim: " + this.fim.elemento);
	}

	public void imprime(int nIter) {

		if (this.estaVazia())
			nIter = 0;

		System.out.print("[");

		Nodo cursor = this.inicio;
		for (int i = 0; i < nIter; i++) {
			System.out.print(cursor.elemento + " ");
			cursor = cursor.proximo;
		}

		if (this.nElementos == 0)
			System.out.println("] Inicio: " + this.inicio + ", Fim: " + this.fim);
		else
			System.out.println("] Inicio: " + this.inicio.elemento + ", Fim: " + this.fim.elemento);
	}

	public void insereInicio(int elemento) {

		Nodo novo = new Nodo(elemento);

		if (this.estaVazia()) {
			this.inicio = novo;
			this.fim = novo;
			this.fim.proximo = novo;
		} else {
			novo.proximo = this.inicio;
			this.inicio = novo;
			this.fim.proximo = novo;
		}

		this.nElementos++;
	}

	public Integer removeInicio() {

		if (this.estaVazia()) {
			System.out.println("Lista vazia! Não é possível remover.");
			return null;
		}

		Nodo nodoRemovido = this.inicio;

		if (this.nElementos == 1) {
			this.inicio = null;
			this.fim = null;
		} else {
			this.inicio = nodoRemovido.proximo;
			this.fim.proximo = this.inicio;
		}

		nodoRemovido.proximo = null;

		this.nElementos--;

		return nodoRemovido.elemento;

	}

	public void insereFinal(int elemento) {

		Nodo novo = new Nodo(elemento);

		if (this.estaVazia()) {
			this.inicio = novo;
		} else {
			this.fim.proximo = novo;
		}

		this.fim = novo;
		novo.proximo = this.inicio;

		this.nElementos++;

	}

	public Integer removeFinal() {

		if (this.estaVazia()) {
			System.out.println("Lista vazia! Não é possível remover.");
			return null;
		}

		Nodo nodoRemovido = this.fim;

		if (this.nElementos == 1) {
			this.inicio = null;
			this.fim = null;
		} else {

			Nodo cursor = this.inicio;
			for (int i = 1; i < this.nElementos - 1; i++) {
				cursor = cursor.proximo;
			}

			this.fim = cursor;
			cursor.proximo = this.inicio;
		}

		nodoRemovido.proximo = null;

		this.nElementos--;

		return nodoRemovido.elemento;

	}

	public void inserePosicao(int elemento, int pos) {

		if (pos < 0) {
			System.out.println("Posição negativa. Não é possível inserir");
			return;
		} else if (pos > this.nElementos) {
			System.out.println("Posição inválida. Não é possível inserir");
			return;
		}

		if (pos == 0) {
			this.insereInicio(elemento);
			return;
		}

		Nodo novo = new Nodo(elemento);

		Nodo cursor = this.inicio;
		for (int i = 1; i < pos; i++) {
			cursor = cursor.proximo;
		}

		novo.proximo = cursor.proximo;
		cursor.proximo = novo;

		if (pos == this.nElementos) {
			this.fim = novo;
		}

		this.nElementos++;

	}

	public Integer removePosicao(int pos) {

		if (this.estaVazia()) {
			System.out.println("Lista vazia. Não é possível remover");
			return null;
		} else if (pos < 0) {
			System.out.println("Posição negativa. Não é possível remover");
			return null;
		} else if (pos >= this.nElementos) {
			System.out.println("Posição inválida. Não é possível remover");
			return null;
		}

		if (pos == 0) {
			return this.removeInicio();
		}

		Nodo cursor = this.inicio;
		for (int i = 1; i < pos; i++) {
			cursor = cursor.proximo;
		}

		Nodo nodoRemovido = cursor.proximo;

		cursor.proximo = nodoRemovido.proximo;

		nodoRemovido.proximo = null;

		if (pos == this.nElementos - 1) {
			this.fim = cursor;
		}

		this.nElementos--;

		return nodoRemovido.elemento;
	}

	public void insereOrdenado(int elemento) {

		boolean flagInseriu = false;

		Nodo cursor = this.inicio;
		for (int i = 0; i < this.nElementos; i++) {
			if (cursor.elemento > elemento) {
				this.inserePosicao(elemento, i);
				flagInseriu = true;
				break;
			}
			cursor = cursor.proximo;
		}

		if (!flagInseriu) {
			this.insereFinal(elemento);
		}
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
