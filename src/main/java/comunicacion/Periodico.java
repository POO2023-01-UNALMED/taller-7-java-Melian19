package comunicacion;

public class Periodico extends Escrito {
	
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen,String titulo,String autor,int paginas,String fecha,String primicia,String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.fecha = fecha;
		this.interpretacion = interpretacion;
		this.primicia = primicia;
	}

	//metodos get y set
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String a) {
		interpretacion = a;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String a) {
		fecha = a;
	}
	public String getPrimicia() {
		return primicia;
	}
	public void setPrimicia(String a) {
		primicia = a;	
	}
	
	//metodos abstractos
	
	public int palabrasTotales(int palabrasPagina) {
		return palabrasPagina*getPaginas()*10;
	}

	public String interpretacion() {
		return getInterpretacion();
	}

	public String toString() {
		return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + getFecha() + "\n" + getPrimicia();
	}

}

