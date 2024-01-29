package main;

import java.util.ArrayList;

import clases.Arbol;

public class GestorArboles {

	public static void main(String[] args) {
		run();

	}

	public static void run() {
		
		ArrayList<Arbol> arboles = new ArrayList<Arbol>();
		
		final int SELECT = 1;
		final int INSERT = 2;
		final int UPDATE = 3;
		final int DELETE = 4;
		
		int intro = 1;
		
		System.out.println("---MENU---");
		System.out.println(SELECT + " - Mostrar por pantalla");
		System.out.println(INSERT + " - Insertar tupla");
		System.out.println(UPDATE + " - Actueñizar tupla");
		System.out.println(DELETE + " - Eliminar tupla");
		
		
		do {
			switch (intro) {
			case SELECT:
				
				break;

			default:
				break;
			}
		} while (intro == 0);

		
		
		
		
		
		
	}

}
