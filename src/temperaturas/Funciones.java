package temperaturas;

public class Funciones {
	/**
	 * Esto es para hacer algo
	 * @param m: matriz con los datos
	 * @return muestra la matriz
	 */
	public static void mostrar_matriz(double m[][]) {
		int i, j, k;
		
		System.out.println("     |  E  |  F  |  M  |  A  |  M  |  J  |  J  |  A  |  S  |  O  |  N  |  D  |");
		System.out.println("______________________________________________________________________________");
		
		for(i=0;i<m.length;i++) {
			System.out.printf("%5d|", 2002+i);
			for(j=0;j<m[i].length;j++) {
				System.out.printf("%5.1f|", m[i][j]);
			}
			System.out.println("");
			//System.out.println("______________________________________________________________________________");
		}
	}
	
	public static double media_anyo(double m[][], int fila) {
		int i;
		double suma=0;
		
		for(i=0;i<m[fila].length;i++) {
			suma += m[fila][i];
		}
		
		suma = suma/m[fila].length;
		
		return suma;
		
	}
	
	public static double media_mes(double m[][], int mes) {
		int i;
		double suma=0;
		
		for(i=0;i<m.length;i++) {
			suma += m[i][mes];
		}
		
		suma = suma/m.length;
		
		return suma;
		
	}
}
