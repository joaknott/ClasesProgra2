
import java.util.LinkedList;

public class PilaEnteros {

	LinkedList<Integer> pila;

	public PilaEnteros() {
		pila = new LinkedList<Integer>();
	}
	
	public void apilar(Integer elem){
		pila.addLast(elem);
	}

	public Integer desapilar(){
		if (esVacia())
			throw new RuntimeException("La pila esta vacia");
		return pila.removeLast();
	}
	
	public Integer tope(){
		if (esVacia())
			throw new RuntimeException("La pila esta vacia");
		//COMPLETAR
		return pila.getLast();
	}

	public boolean esVacia(){
		return pila.isEmpty();
	}

	public Integer tamanio(){ 
		return pila.size();
	}

	public Integer minimo() {
		
		if(esVacia()) {
			throw new RuntimeException("La pila esta vacia");
		}
		PilaEnteros pilaAux = new PilaEnteros();
		Integer minimo = this.tope();	
		Integer actual;

	
		while(!this.esVacia()) {
			actual = this.desapilar();
			if(actual < minimo) minimo=actual;
			
			pilaAux.apilar(actual);
		}
		while(!pilaAux.esVacia()) {
			this.apilar(pilaAux.desapilar());		
	}
	
	return minimo;

}

	
//	public String toString(){
//		/// COMPLETAR
//	
//	}


}

