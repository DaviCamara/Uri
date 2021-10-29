package unifor.lista.estatica;

public class ListaVetor {
	//propriedades da classe ListaVetor.
	private String vetor[];
	public int nElementos;
	
	
	//Construtor
	public ListaVetor(int tamanho) {
		this.vetor = new String[tamanho];
		this.nElementos = 0;
	}
	
	
	
	//imprime a lista
	
	public void imprime() { 
		//System.out.print("[");
		for (int i = 0; i < this.nElementos; i++) {
			if(i < 1) {
				System.out.println(this.vetor[i]);
			}else {
			System.out.println("" + this.vetor[i]);
			}
		}
		
		
		
		//System.out.print("]");
		//System.out.println();
		
	}
	
	//imprime uri 3135
	/*public void imprime2() { 
		//System.out.print("[");
		int temp =  2;
		int j = 0;
		ListaVetor listaaux = new ListaVetor(12);
		for (int i = 0; i < this.nElementos; i++) {
			if(this.vetor[i].length() == temp ) {
				//System.out.println("VETOR i: " + this.vetor[i]);
				//System.out.println("VETOR i +1: " + this.vetor[i + 1]);
				//System.out.println("SS");
		
				//System.out.println("temp: " + temp);
				//System.out.print(this.vetor[i] + " ");
				temp++;
				listaaux.insereInicio(this.vetor[i]);
				if (i == 0) {
					System.out.print(this.vetor[i] + " ");
					
				}
				if(i != 0) {
					
						if(listaaux.acesse(i) != this.acesse( i) ) {
							j++;
							System.out.print(listaaux.acesse(i -j) + " ");
							
						}
					}
				
				}
			}if(temp == 12) {
				temp = 2;
				//System.out.println();
			} 
			else {
				//System.out.println(" " + this.vetor[i]);
				
			}
		}
		
		
		
		//System.out.print("]");
		//System.out.println();
*/
	
	//Verificar se a lista está vazia
	public boolean estaVazia() {
		if(this.nElementos == 0) 
			return true;
				return false;
		
	}
	//Verificar se a lista esta cheia
	public boolean estaCheia() {
		return this.nElementos == this.vetor.length;
	}

	//Inserir elementos no final  da lista.
	public void insereFinal(String elemento) {
		if(this.estaCheia()) {
			System.out.println("Lista cheia! Não é possível inserir" + elemento);
		}else {
				this.vetor[this.nElementos] = elemento;
				this.nElementos++;
			}
		}
	
	//Remover elemento do final da lista
	public String removeFinal() {

		if (this.estaVazia()) {
			System.out.println("Lista vazia. Não é possível remover");
			return null;
		} else {
			String removido = this.vetor[this.nElementos - 1];
			this.nElementos--;
			return removido;
		}
	}
	
	//Inserir elemento no final da lista.
	public void insereInicio(String string) {
		if(this.estaCheia()) {
			System.out.println("Lista Cheia! Não é possível inserir " + string );
		}else {

			for(int i = this.nElementos; i>= 1; i--) {
				this.vetor[i] = this.vetor[i-1];
				
			}
			this.vetor[0] = string;
			this.nElementos++;
		}
	}
	
	//Remove elemento no inicio da lista.
	public String removeInicio() {

		if (this.estaVazia()) {
			System.out.println("Lista vazia. Não é possível remover");
			return null;
		} else {
			String removido = this.vetor[0];

			for (int i = 1; i < this.nElementos; i++) {
				this.vetor[i - 1] = this.vetor[i];
			}

			this.nElementos--;

			return removido;
		}
	}
	
	//Remove um elemento na posição especificada
	
		public String removePosicao(int pos) {
			String elemento_removido = vetor[pos];
			if(this.estaVazia()) {
				System.out.println("Lista vazia! Não é possível remover ");
			}else {
				for (int i = pos + 1 ;  i < this.nElementos ; i++) {
					//System.out.println("LISTA: i =" + i);
					this.vetor[i - 1] = this.vetor[i];
				}
			}
			this.nElementos--;
			return elemento_removido;
			
		}
	
	//Iserir o elemento na posição selecionada, deslocando a lista para a direita.
	
	public void inserePosicao(String elemento, int pos) {
		if(this.estaCheia()) {
			System.out.println("Lista Cheia! Não é possível inserir " + elemento);
			
		}else {
			
			for (int i = this.nElementos; i >= pos; i--) {
				this.vetor[i] = this.vetor[i-1];
			}
			this.vetor[pos] = elemento;
			this.nElementos++;
		}
	}
	
	
	
	//Acessa a posição especificada
	public String acesse(int pos) {

		if (pos >= this.nElementos || pos < 0) {
			System.out.println("Posição " + pos + " não é acessível");
			return null;
		}
		
		return this.vetor[pos];
	}
	
	//Insere Lista Ordenada Inteiro
	/*
	private void insereOdenado(String  elemento) {
		if(this.estaCheia()) {
			System.out.println("Lista cheia. Não é ´possívccel inserir " + elemento);
		}else if(this.estaVazia()) {
			this.insereInicio(elemento);
		}else {
			boolean flagInserida = false;
			for (int i = 0; i < this.nElementos; i++) {
				if(this.vetor[i] >= elemento) {
					this.inserePosicao(elemento, i);
					flagInserida = true;
					break;
				}
				
			}
			if(flagInserida) {
				this.insereFinal(elemento);
			}
		}
	}
	*/
	
	//Sort String.
	public void organizaAlfabetico() {
		String str;
		 for(int a = 0; a < this.nElementos; a++) 
	      { 
	         for(int b = a + 1; b < this.nElementos; b++) 
	         { 
	            // java alphabetical sort 
	            if(this.vetor[a].compareTo(this.vetor[b]) > 0) 
	            { 
	               str = this.vetor[a]; 
	               this.vetor[a] = this.vetor[b]; 
	               this.vetor[b] = str; 
	            } 
	         } 
	      } 
		//for (int i = 0; i < this.nElementos -2; i++) {
		//	if(this.vetor[i].compareTo(this.vetor[i+1]) > 0) {
		//		this.vetor[i] = this.vetor[i+1];
		//	}
			
		//}
		
	}
	
	//Remoção de elementos duplicados da lista.
	public void removeDuplicado() {
		for(int i=0;i<this.nElementos;i++){
			 for(int j1=i + 1;j1<this.nElementos;j1++){
			            if(this.acesse(i).equals(this.acesse(j1))){
			                this.removePosicao(j1);
			                j1--;
			                
			            }
			    }
			
			 }
	}	
	// Organiza elementos por lenght.
	public void organizaPorTamanho() {
		 for (int i=1 ;i<this.nElementos; i++)
		    {
		        String temp = this.vetor[i];
		
		        int j = i - 1;
		        while (j >= 0 && temp.length() < this.vetor[j].length())
		        {
		        	//System.out.print(this.acesse(j+ 1)+ " ");
		            this.vetor[j+1] = this.vetor[j];
		            
		            j--;
		          //  this.imprime();
		            
		        }
		        this.vetor[j+1] = temp;
		        System.out.println();
		    }
		}
}


