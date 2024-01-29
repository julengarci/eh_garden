package main;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Arbol;

public class GestorArboles {

	public static void main(String[] args) {
		run();

	}

	public static void run() {
		
		Scanner scan = new Scanner(System.in);

		ArrayList<Arbol> arboles = new ArrayList<Arbol>();
		
		final int SELECT = 1;
		final int INSERT = 2;
		final int UPDATE = 3;
		final int DELETE = 4;
		final int SALIR = 0;
		
		int intro = 1;
		
		do {
			System.out.println("---MENU---");
			System.out.println(SELECT + " - Mostrar por pantalla");
			System.out.println(INSERT + " - Insertar tupla");
			System.out.println(UPDATE + " - Actueñizar tupla");
			System.out.println(DELETE + " - Eliminar tupla");
			
			intro = Integer.parseInt(scan.nextLine());
			
			switch (intro) {
			case SELECT:
				//conectarse a la base de datos y introduce los arboles a la arraylist
				//devuelve la arraylis(foreach)
				break;
			case INSERT:
				//metodo que pide datos y crea un arbol
				//metodo que inserta en base de datos 
				break;
			case UPDATE:
				
				break;
			case DELETE:
				
				break;
				
			case SALIR:
				
				break;

			default:
				break;
			}
		} while (intro == 0);

	}

	private static void visualizarArboles(ArrayList<Arbol> arboles) {
		// TODO Auto-generated method stub
		
	}

	private static void arboles() {
		// TODO Auto-generated method stub
		
	}

}
