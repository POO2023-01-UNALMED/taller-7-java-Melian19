package comunicacion;

public class Fabula extends Escrito {
	
	private String enseñanza;
	private String interpretacion;
	
	public Fabula(String origen,String titulo,String autor,int paginas,String enseñanza,String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.enseñanza = enseñanza;
		this.interpretacion = interpretacion;
	}
	
	//metodos get y set
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String a) {
		interpretacion = a;
	}
	public String getEnsenanza() {
		return enseñanza;
	}
	public void setEnsenanza(String a) {
		enseñanza = a;
	}
	
	//metodos abstractos
	
		public int palabrasTotales(int palabrasPagina) {
			return palabrasPagina*getPaginas()*1;
		}

		public String interpretacion() {
			return getInterpretacion();
		}

		public String toString() {
			return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + getEnsenanza();
		}

}
