/**
 * 
 */
package com.usuario.matrices;

import java.util.Scanner;

/**
 * @author USUARIO
 * Clase que pide una matriz por teclado y la muestra en pantalla
 */
public class ej0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿Cuántas filas quieres?: ");
		int filas =sc.nextInt();
		
		System.out.println("¿Cuántas columnas quieres?: ");
		int columnas =sc.nextInt();
		
		int matriz[][]= new int [filas] [columnas];
		System.out.println("Introduce la matriz");
		Matrices.pedir_matriz(matriz);
		
		System.out.println("Tu matriz es: ");
		Matrices.mostrar_matriz(matriz);
		
		

	}

}
