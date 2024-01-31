package clases;

import java.util.Date;

public class Arbol {

	private int id;
	private String nombreComun;
	private String nombreCientifico;
	private Habitat habitat;
	private int altura;
	private String origen;
	private Date encontrado;
	private Boolean singular;
	
	public Arbol(int id, String nombreComun, String nombreCientifico, Habitat habitat, int altura, String origen,
			Date encontrado, Boolean singular) {
		super();
		this.id = id;
		this.nombreComun = nombreComun;
		this.nombreCientifico = nombreCientifico;
		this.habitat = habitat;
		this.altura = altura;
		this.origen = origen;
		this.encontrado = encontrado;
		this.singular = singular;
	}

	public Arbol() {
		
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public void setHabitat(Habitat habitat) {
		this.habitat = habitat;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	
	public int getId() {
		return id;
	}

	public String getNombreComun() {
		return nombreComun;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public Habitat getHabitat() {
		return habitat;
	}

	public int getAltura() {
		return altura;
	}

	public String getOrigen() {
		return origen;
	}

	public Date getEncontrado() {
		return encontrado;
	}

	public Boolean getSingular() {
		return singular;
	}

	public void setEncontrado(Date encontrado) {
		this.encontrado = encontrado;
	}

	public void setSingular(Boolean singular) {
		this.singular = singular;
	}

	@Override
	public String toString() {
		return "id=" + id + ", nombreComun=" + nombreComun + ", nombreCientifico=" + nombreCientifico + ", habitat="
				+ habitat + ", altura=" + altura + ", origen=" + origen + ", encontrado=" + encontrado + ", singular="
				+ singular;
	}

	
	
	
	
	
}
