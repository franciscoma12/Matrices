/**
 * 
 */
package com.usuario.matrices;

import java.util.Scanner;

/**
 * @author USUARIO
 *
 */
public class Matrices {

	/**
	 * Método que pide una matriz por teclado
	 * @param matriz Matriz a ingresar por teclado
	 */
	public static void pedir_matriz(int matriz[][]) {
		Scanner sc = new Scanner (System.in);
		
		for (int i=0; i<matriz.length; i++) {
			for (int j= 0; j<matriz[0].length;j++) {
				System.out.printf("Introduce el elemento (%d,%d): ", i,j);
				matriz[i][j]=sc.nextInt();
			}
		}
	}
public static void mostrar_matriz (int matriz[][]) {
	for (int i=0; i<matriz.length; i++) {
		for (int j= 0; j<matriz[0].length;j++) {
			System.out.printf("%3d", matriz[i][j]);
			
				}
		System.out.println();
			}
		}
	}
	
