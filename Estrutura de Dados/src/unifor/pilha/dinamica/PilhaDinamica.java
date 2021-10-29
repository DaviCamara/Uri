package unifor.pilha.dinamica;

public class PilhaDinamica {
	
	class Nodo {
		
		public int elemento;
		public Nodo proximo;
		public Nodo anterior;
		
		public Nodo(int elemento) {
			this.elemento = elemento;
			this.proximo = null;
			this.anterior = null;
		}
	}
	
	private Nodo inicio;
	private Nodo topo; // fim
	private int nElementos;
	
	public PilhaDinamica() {
		this.inicio = null;
		this.topo = null;
		this.nElementos = 0;
	}
	
	public boolean estaVazia() {
		return this.nElementos == 0;
	}
	
	public int tamanho() {
		return this.nElementos;
	}

	public void imprime() {
		Nodo cursor = this.topo;
		for(int i=0;i<this.nElementos;i++) {
			System.out.println("|\t" + cursor.elemento + "\t|");
			cursor = cursor.anterior;
		}
		System.out.println("----------------------");
	}
		
	public void empilha(int elemento) {
		
		Nodo novo = new Nodo(elemento);
		
		if(this.estaVazia()) {
			this.inicio = novo;
		} else {
			this.topo.proximo = novo;
			novo.anterior = this.topo;
		}
		
		this.topo = novo;
		
		this.nElementos++;
	}
	
	public Integer desempilha() {
		
		if(this.estaVazia()) {
			System.out.println("Lista vazia. N�o � poss�vel remover.");
			return null;
		}
		
		Nodo nodoRemovido = this.topo;
		
		if(this.nElementos == 1) {
			
			this.inicio = null;
			this.topo = null;
		} else {
			
			this.topo = nodoRemovido.anterior;
			
			nodoRemovido.anterior.proximo = null;			
			nodoRemovido.anterior = null;
		}
		
		this.nElementos--;
		
		return nodoRemovido.elemento;
	}
	
	public Integer espia() {
		
		if(this.estaVazia()) {
			System.out.println("Lista vazia! N�o � poss�vel espiar.");
			return null;
		}
		
		return this.topo.elemento;
	}
	
	public boolean contem(int elemento) {
		
		Nodo cursor = this.inicio;
		for(int i=0;i<this.nElementos;i++) {
			if(cursor.elemento == elemento) {
				return true;
			}
			cursor = cursor.proximo;
		}
		
		return false;
	}
	
}
