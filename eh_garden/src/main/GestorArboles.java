package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
		
		final int VER_TODOS = 1;
		final int INSERT = 2;
		final int UPDATE = 3;
		final int DELETE = 4;
		final int SALIR = 0;
		
		int intro = 1;
		
		do {
			System.out.println("---MENU---");
			System.out.println(VER_TODOS + " - Mostrar todos por pantalla");
			System.out.println(INSERT + " - Insertar tupla");
			System.out.println(UPDATE + " - Actueñizar tupla");
			System.out.println(DELETE + " - Eliminar tupla");
			
			intro = Integer.parseInt(scan.nextLine());
			
			switch (intro) {
			case VER_TODOS:
				//conectarse a la base de datos y introduce los arboles a la arraylist
				//devuelve la arraylis(foreach)
				visualizarArboles(arboles());
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
		for (Arbol arbol : arboles) {
			System.out.println(arbol);
		}
		
	}

	private static ArrayList<Arbol> arboles() {
		ArrayList<Arbol> arboles = new ArrayList<Arbol>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/eh_garden","root","");
			
			String sql = "select * from arboles";
			
			Statement st = conexion.createStatement();
			
			st.execute(sql);
			
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				Arbol a = new Arbol();
				
				a.setId(rs.getInt(1));
				a.setNombreComun(rs.getString(2));
				a.setNombreCientifico(rs.getString(3));
				a.setHabitat(rs.getString(4));
				a.setAltura(rs.getInt(5));
				a.setOrigen(rs.getString(6));
				
				arboles.add(a);
			}
			
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return arboles;
	}

}
