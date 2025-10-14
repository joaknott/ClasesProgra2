package RecursionAgain;

public class RecursivTarea {
	
	public static void main(String[] args) {
		System.out.println("Suma del arreglo: "
				+ suma(new int[]{8,10,2,4,6}));

		System.out.println("Maximo del arreglo: "
				+ maximo(new int[]{8,10,2,4,6}));
	}
	
	// Metodo publico (no recursivo)
	public static int suma(int[] arr) {
		// Suma del arreglo a partir de la posicion 0
		return suma(arr,0);
	}
	
	// Metodo auxiliar privado RECURSIVO
	private static int suma(int[] arr, int i) {
		if (i==arr.length)
			// caso base
			return 0;
		else
			// caso recursivo
			return arr[i] + suma(arr,i+1);
	}
	
	
	
	
	
	
	// Metodo publico (no recursivo)
		public static int maximo(int[] arr) {
			if (arr.length==0)
				throw new RuntimeException("No es posible calcular el maximo para un arreglo vacio");
			// Maximo del arreglo a partir de la posicion 0
			return maximo(arr,0);
		}
		
		private static int maximo(int[] arr, int i) {
			
			return 0;
		}
		
		public static boolean esPalindromo(int[] vec) {
			return esPalindromoRec(vec, 0, vec.length -1);
		}
		
		private static boolean esPalindromoRec(int[] vec, int inicio, int finalizacion) {
			if (inicio >= finalizacion) {
				return true;
			}
			
			if(vec[inicio] != vec[finalizacion]) {
				return false;
			}
			
			return esPalindromoRec(vec, inicio+1, finalizacion-1);
			
		}
		
		public static int busquedaBin(int[] arr, int valor) {
			return busequedaBinRec(arr, valor,  0, arr.length -1);
		}

		private static int busequedaBinRec(int[] arr, int valor, int inicio, int fin) {
			if(inicio > fin) {
				return -1; //Es invalido
			}
			
			int medio = (inicio + fin) / 2;
			
			if (arr[medio] == valor) {
				return medio;
			}else if(valor < arr[medio]) {
				return busequedaBinRec(arr, valor, inicio, medio-1);
			}else {
				return busequedaBinRec(arr, valor, medio+1 , fin);
			}
			
		}
	
	
	
	
	
	
	
	
	

}
