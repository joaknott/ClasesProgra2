package asdiasdijasd;

public class sdasdsd {

	public static boolean diagonalMayor10algunaFilaPar(int [][] mat) { // EJ EXTRA ACUM EN CLASE
		
		if (mat == null || mat.length!= mat[0].length) return false;
		
	return sumarDiagonal(mat)>10 && algunaFila(mat);
}
	
	public static boolean algunaFila (int [][] mat) {
		boolean sonPares = true;
		boolean algunaFil = false;
		for (int fila=0 ; fila<mat.length ; fila++) {
			sonPares = true;
			for (int col=0 ; col<mat[0].length; col++) {
				sonPares = sonPares && (mat[fila][col]%2==0);
			}
			algunaFil = algunaFil || sonPares;
	}
		return algunaFil;
}
	
	public static int sumarDiagonal(int [][] mat) {
		
		int suma = 0;
		for (int i = 0 ; i<mat.length ; i++) {
			suma += mat[i][i];
		}
		
		return suma;
	}
	
	
	public static boolean filasCrecientesParImpar(int[][] mat) { //EJ 7 PRACTICA 00
		if (mat == null) return false;
		
		boolean FilaOrdenada = true;
		
		for(int i = 0; i < mat.length; i++) {
			
			boolean esAscendente = true;
			
			for(int j = 0; j < mat[0].length -1; j++) {
				
				esAscendente = esAscendente && (mat[i][j] < mat [i][j+1]); 
				
			}
			FilaOrdenada = FilaOrdenada && esAscendente;

		}
		return FilaOrdenada;
		
	}
	
	public static boolean parimpar(int [][] mat) { //Ejercicio parIMPAR 
		
		if(mat == null) return false;
		
		boolean par, impar,parimpar, todasTienen = true;
		
		for (int j = 0; j < mat[0].length; j++) {
			par = false; impar = false; parimpar = true;
			
			for(int i = 0; i < mat.length; i++) {
				par = par || mat[i][j] % 2 == 0;
				impar = impar || mat[i][j] %2 == 1;
				
			}
			parimpar = par && impar;
			todasTienen = todasTienen && parimpar;
		}
		return todasTienen;
		
	}
	
	
	
	
	
	
}












