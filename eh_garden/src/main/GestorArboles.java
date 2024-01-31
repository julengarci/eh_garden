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
import clases.Habitat;

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
				insert(crearArbol());
				break;
			case UPDATE:
				
				break;
			case DELETE:
				//metodo que pida id y devuelva el arbol si existe
				//metodo que conecta a la base de datos y elimina
				delete(buscarUno());
				break;
				
			case SALIR:
				
				break;

			default:
				break;
			}
		} while (intro == 0);

	}

	private static Arbol buscarUno() {
		Arbol a = new Arbol();
		
		
		return a;
	}

	private static void delete(Arbol arbol) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/gestor_tareas","root","");
			
			Statement st = conexion.createStatement();
			String sql = "delete from arboles where id = ? ";
			
			PreparedStatement ps = conexion.prepareStatement(sql);
			ps.setInt(1,arbol.getId());
			
			st.execute(sql);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}

	private static void insert(Arbol arbol) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/eh_garden","root","");
			
			Statement st = conexion.createStatement();
			
			String sql = "INSERT INTO arboles(nombre_comun,nombre_cientifico, habitat, altura, origen) VALUES ( ? , ? , ? , ? , ? );";
			PreparedStatement ps = conexion.prepareStatement(sql);
			ps.setString(1,arbol.getNombreComun());
			ps.setString(2,arbol.getNombreCientifico());
			ps.setString(3, arbol.getHabitat());
			ps.setInt(4,arbol.getAltura());
			ps.setString(5, arbol.getOrigen());
			
			ps.execute();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

	private static Arbol crearArbol() {
		Scanner scan = new Scanner(System.in);
		
		Arbol a = new Arbol();
		
		System.out.println("introduce el nombre comun del arbol :");
		a.setNombreComun(scan.nextLine());
		System.out.println("introduce el nombre cientifico");
		a.setNombreCientifico(scan.nextLine());
		System.out.println("introduce el habitat");
		a.setHabitat(scan.nextLine());
		System.out.println("introduce la altura");
		a.setAltura(Integer.parseInt(scan.nextLine()));
		System.out.println("introduce el origen");
		a.setOrigen(scan.nextLine());
		
		return a;
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
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/eh_garden2","root","");
			
			String sql = "SELECT * FROM arboles inner JOIN habitats on arboles.id_habitat = habitats.id;";
			
			Statement st = conexion.createStatement();
			
			st.execute(sql);
			
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				Arbol a = new Arbol();
				
				a.setId(rs.getInt(1));
				a.setNombreComun(rs.getString(2));
				a.setNombreCientifico(rs.getString(3));
				a.setAltura(rs.getInt(5));
				a.setOrigen(rs.getString(6));
				a.setEncontrado(rs.getString(7));
				a.setSingular(rs.getBoolean(8));
				
				Habitat h = new Habitat();
				h.setId(rs.getInt(9));
				h.setNombre(rs.getString(10));
				
				a.setHabitat(h);
				
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
