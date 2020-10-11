public class ListaSobreArreglos<T extends Comparable>{
	private static final int MAX LIST = 100;
	private T item [] ;
	private int numItems ;

	public ListaSobreArreglos(){
		numItems = 0;
	}
	
	public void insertar(T elem){
		if(numItems == 0){
			this.item[0] = elem;
			numItems++;
			return this;
		}
		if(elem >= this.item[numItems - 1]){
			this.item[numItems] = elem;
			numItems++;
			return this ;
		}
		for(int i = 0 ; i < numItems ; i++){
			if(elem <= this.item[i]){
				for(int j = numItems - 1 ; j > i ; j--){
					this.item[j] = this.item[j-1];
				}
				this.item[i] = elem;
				numItems++;
				return this;
			}	
		}
	}

	public void eliminar(int index){
		for(int i = index ; i < numItems ; i++){
			this.item[i] = this.item[i+1];
		}
		numItems--;
		return this;
	}


	public Integer buscar(T elem,){
		int half;
		if(numItems mod 2 == 0){
			half = this.numItems % 2;
		}
		else{
			half = this.numItems % 2 + 1;
		}
		boolean cond = true;
		while(cond){
			if(this.item[half] == elem){
				return half;
			}
			else if(this.item[half] > elem){
				half = half % 2 ;
			}
			else if(this.item[half] < elem){
				half = half+(half%2)
			}
		}

	}

}
