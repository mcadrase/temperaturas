package temperaturas;

import java.util.Scanner;

import temperaturas.Funciones;

public class Principal {
	
	public static void main(String[] args) {
		double minimas[][] = 
			{
			{2.3,2.1,6.8,8.8,10.3,9.9,13.8,12.4,16.6,10.8,9.1,5.3},
			{2.8,2.6,5.2,9.1,11.1,10.0,12.5,15.2,12.8,11.0,10.3,6.3},
			{3.2,2.6,4.2,10.1,10.8,11.1,13.3,15.3,16.6,10.8,9.5,10.3},
			{2.2,2.8,6.2,9.0,9.5,10.8,16.6,18.1,15.5,11.5,9.8,9.5},
			{1.7,3.1,5.5,8.8,10.8,9.8,17.6,16.5,12.8,8.2,10.2,8.2}
			};
		
		Funciones.mostrar_matriz(minimas);
		
		Scanner entrada = new Scanner(System.in);
		
		int anyo = entrada.nextInt();

		System.out.printf("%.2f", Funciones.media_anyo(minimas, anyo));
		
		int mes = entrada.nextInt();
		
		System.out.printf("%.2f", Funciones.media_mes(minimas, mes));
	}

}
