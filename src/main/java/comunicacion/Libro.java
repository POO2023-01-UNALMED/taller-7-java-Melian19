package comunicacion;

public class Libro extends Escrito{
	
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen,String titulo,String autor,int paginas,String coautor,String editorial,
			String edicion,String interpretacion){
		super(origen,titulo,autor,paginas);
		co_autor = coautor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	
	//metodos get y set
	
	public String getCo_autor() {
		return co_autor;
	}
	public void setCo_autor(String a) {
		co_autor = a;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String a) {
		editorial = a;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String a) {
		edicion = a;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String a) {
		interpretacion = a;
	}

	//metodos abstractos
	
	public int palabrasTotales(int palabrasPagina) {
		return palabrasPagina*getPaginas()*2;
	}

	public String interpretacion() {
		return getInterpretacion();
	}

	public String toString() {
		return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + getCo_autor() + "\n" + getEditorial() + "\n" + getEdicion();
		
	}
	
}
