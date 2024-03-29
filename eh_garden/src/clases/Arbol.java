package clases;

public class Arbol {

	private int id;
	private String nombreComun;
	private String nombreCientifico;
	private String habitat;
	private int altura;
	private String origen;
	
	public Arbol(int id, String nombreComun, String nombreCientifico, String habitat, int altura, String origen) {
		super();
		this.id = id;
		this.nombreComun = nombreComun;
		this.nombreCientifico = nombreCientifico;
		this.habitat = habitat;
		this.altura = altura;
		this.origen = origen;
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

	public void setHabitat(String habitat) {
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

	public String getHabitat() {
		return habitat;
	}

	public int getAltura() {
		return altura;
	}

	public String getOrigen() {
		return origen;
	}

	@Override
	public String toString() {
		return "id=" + id + ", nombreComun=" + nombreComun + ", nombreCientifico=" + nombreCientifico + ", habitat="
				+ habitat + ", altura=" + altura + ", origen=" + origen;
	}
	
	
	
	
	
}
