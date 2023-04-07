package comunicacion;

public class Fabula extends Escrito {
	
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen,String titulo,String autor,int paginas,String enseñanza,String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.ensenanza = enseñanza;
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
		return ensenanza;
	}
	public void setEnsenanza(String a) {
		ensenanza = a;
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
